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
public class ZaKrotkieHasloException extends AbstractException {

    public ZaKrotkieHasloException() {
    }

    public ZaKrotkieHasloException(String message) {
        super(message);
    }

    public ZaKrotkieHasloException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZaKrotkieHasloException(Throwable cause) {
        super(cause);
    }

    public ZaKrotkieHasloException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
