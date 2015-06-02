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
public class CriticalAppException extends AbstractException {

    public CriticalAppException() {
    }

    public CriticalAppException(String string) {
        super(string);
    }

    public CriticalAppException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CriticalAppException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CriticalAppException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
