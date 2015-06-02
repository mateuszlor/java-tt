/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.exceptions;

/**
 *
 * @author Michał Kagankiewicz
 */
public class MyEJBException extends AbstractException{

    public MyEJBException() {
    }

    public MyEJBException(String message) {
        super(message);
    }

    public MyEJBException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyEJBException(Throwable cause) {
        super(cause);
    }

    public MyEJBException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
