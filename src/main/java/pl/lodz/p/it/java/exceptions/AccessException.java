/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author Michał Kagankiewicz
 */
@ApplicationException(rollback = true)
public class AccessException extends AbstractException {

    public AccessException() {
    }

    public AccessException(String message) {
        super(message);
    }

    public AccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessException(Throwable cause) {
        super(cause);
    }

    public AccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
