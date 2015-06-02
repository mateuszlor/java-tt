/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.errors;


import java.io.Serializable;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import pl.lodz.p.it.java.exceptions.AbstractException;

/**
 *
 * @author Tomasz Berger
 */

@Named
@SessionScoped
public class ErrorSession implements Serializable {

    private Exception e = null;

    public void setE(Exception e) {
        this.e = e;
    }

    public ErrorSession() {
    }

    public String getErrorMessage(ResourceBundle bundle) {
        if (e != null) {
            if (e instanceof AbstractException) {
                return bundle.getString(e.getMessage());
            } else {
                return bundle.getString("Exception.UnhandledException");
            }
        }
        return bundle.getString("Exception.NullException");
    }

}
