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
public class TransactionReqException extends AbstractException {

    public TransactionReqException() {
    }

    public TransactionReqException(String message) {
        super(message);
    }

    public TransactionReqException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransactionReqException(Throwable cause) {
        super(cause);
    }

    public TransactionReqException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
