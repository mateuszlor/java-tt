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
public class PersException extends AbstractException {

    public PersException() {
    }

    public PersException(String message) {
        super(message);
    }

    public PersException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersException(Throwable cause) {
        super(cause);
    }

    public PersException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
