/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.inceptors;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * Loguje wywolywanie metod przez uzytkownikow
 *
 * @author Szymon Kaminski
 */
public class LoggerInterceptor {

    @Resource
    private SessionContext sessionContext;

     /**
     * Metoda loguje wykonywanie metod przez uzytkownika
     *
     * @param invocation Kontekst logowanej czynności
     * @return Zwraca String z logami, lub rzuca wyjatek. 
     * @throws Wyjatek jaki rzuca obslugiwana klasa
     */
    @AroundInvoke
    public Object logger(InvocationContext invocation) throws Exception {
        StringBuilder message = new StringBuilder("Medoda " + invocation.getTarget().getClass().getName() + "." + invocation.getMethod().getName());
        message.append(" wywolana przez uzytkownika " + sessionContext.getCallerPrincipal().getName());

        try {
            Object[] params = invocation.getParameters();

            if (null != params) {
                for (Object param : params) {
                    if (param != null) {
                        message.append(" z parametrem " + param.getClass().getName() + "=" + param.toString());
                    } else {
                        message.append(" z parametrem null");
                    }
                }
            }

            long startTime = System.currentTimeMillis();
            Object result = invocation.proceed();
            long stopTime = System.currentTimeMillis();
            long duration = stopTime - startTime;

            message.append(" czas wykonania " + duration);

            if (result != null) {
                message.append(" zwrócono " + result.getClass().getName() + "=" + result.toString());
            } else {
                message.append(" zwrócono null");
            }
            return result;
        } catch (Exception e) {
            message.append(" wystąpił wyjątek: " + e);
            throw e;
        } finally {
            Logger.getGlobal().log(Level.INFO, message.toString());
        }
    }
}