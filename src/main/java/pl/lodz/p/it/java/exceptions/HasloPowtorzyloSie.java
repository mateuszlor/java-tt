/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.exceptions;

import javax.ejb.ApplicationException;

/**
 *
 * @author Tomasz Berger
 */
@ApplicationException(rollback = true)
public class HasloPowtorzyloSie extends AbstractException {

    public HasloPowtorzyloSie() {
    }

    public HasloPowtorzyloSie(String message) {
        super(message);
    }

    public HasloPowtorzyloSie(String message, Throwable cause) {
        super(message, cause);
    }

    public HasloPowtorzyloSie(Throwable cause) {
        super(cause);
    }

    public HasloPowtorzyloSie(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
