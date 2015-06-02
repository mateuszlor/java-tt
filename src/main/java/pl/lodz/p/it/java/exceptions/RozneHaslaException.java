/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author java
 */
@ApplicationException(rollback = true)
public class RozneHaslaException extends AbstractException{

    public RozneHaslaException() {
    }

    public RozneHaslaException(String message) {
        super(message);
    }

    public RozneHaslaException(String message, Throwable cause) {
        super(message, cause);
    }

    public RozneHaslaException(Throwable cause) {
        super(cause);
    }

    public RozneHaslaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
