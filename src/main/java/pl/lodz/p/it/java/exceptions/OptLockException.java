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
public class OptLockException extends AbstractException {

    public OptLockException() {
    }

    public OptLockException(String message) {
        super(message);
    }

    public OptLockException(String message, Throwable cause) {
        super(message, cause);
    }

    public OptLockException(Throwable cause) {
        super(cause);
    }

    public OptLockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    
    
    
}
