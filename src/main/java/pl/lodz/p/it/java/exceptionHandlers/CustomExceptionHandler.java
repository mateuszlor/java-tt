/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.exceptionHandlers;

import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.FacesException;
import javax.faces.application.NavigationHandler;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

/**
 *
 * @author Marek Pawłowski
 */
public class CustomExceptionHandler extends ExceptionHandlerWrapper {
    
    private static final Logger log = Logger.getLogger(CustomExceptionHandler.class.getCanonicalName());
    private ExceptionHandler wrapped;
    
    /**
     * Konstruktor ustawiający pole "wrapped".
     * 
     * @param exception
     * @author Marek Pawłowski
     */
    CustomExceptionHandler(ExceptionHandler exception) {
        this.wrapped = exception;
    }
 
    /**
     * Metoda zwracająca pole wrapped
     * 
     * @return pole "wrapped"
     * @author Marek Pawłowski
     */        
    @Override
    public ExceptionHandler getWrapped() {
        return wrapped;
    }

    /**
     * Metoda obsługująca napotkane wyjątki
     * 
     * @author Marek Pawłowski
     */    
    @Override
    public void handle() throws FacesException {
 
        final Iterator<ExceptionQueuedEvent> i = getUnhandledExceptionQueuedEvents().iterator();
        
        while (i.hasNext()) {
            
            ExceptionQueuedEvent event = i.next();
            ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();
            Throwable t = context.getException();
 
            final FacesContext fc = FacesContext.getCurrentInstance();
            final NavigationHandler nav = fc.getApplication().getNavigationHandler();
 
            try {

                if(t instanceof javax.faces.application.ViewExpiredException)
                    nav.handleNavigation(fc, null, "/index");
                else    
                    nav.handleNavigation(fc, null, "/error");
                                    

            } finally {
                i.remove();
            }
        }
        getWrapped().handle();
    }
}