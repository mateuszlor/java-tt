/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.facades;


import java.util.ResourceBundle;
import javax.faces.context.FacesContext;

/**
 *
 * @author Tomasz Berger
 */
abstract public class AbstractContext {

    protected ResourceBundle bundle = null;
    protected FacesContext context = null;

    public AbstractContext() {
    }

    protected ResourceBundle getMessageBundle() {
        if (bundle == null) {
            bundle = ResourceBundle.getBundle(getFacesContext().getApplication().getMessageBundle(), context.getViewRoot().getLocale());
        }
        return bundle;
    }
    
    protected FacesContext getFacesContext() {
        if (context == null) {
            context = FacesContext.getCurrentInstance();
        }
        return context;
    }
}
