/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.errors;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pl.lodz.p.it.java.facades.AbstractContext;

/**
 *
 * @author Tomasz Berger
 */
@Named(value = "errorRequest")
@RequestScoped
public class ErrorRequest extends AbstractContext {

    @Inject
    ErrorSession errorSession;

    public ErrorRequest() {
        context = super.getFacesContext();
        bundle = super.getMessageBundle();
    }

    public String getMessage() {
        return errorSession.getErrorMessage(super.bundle);
    }

}
