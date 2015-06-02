/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.exceptions;
import javax.ejb.ApplicationException;
/**
 *
 * @author Bartłomiej Zacharski
 */
@ApplicationException(rollback=true)
public class AccessLevelModificationException extends AbstractException {
    
    public AccessLevelModificationException() {      
    }
    
    public AccessLevelModificationException(String message) {
        super(message);
    }
    
    public AccessLevelModificationException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public AccessLevelModificationException(Throwable cause) {
        super(cause);
    }
    
    protected AccessLevelModificationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}