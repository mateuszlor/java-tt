/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import pl.lodz.p.it.java.model.PackageType;
import pl.lodz.p.it.java.model.ResistanceUnit;

import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;
import pl.lodz.p.it.java.session.Session;

@Named
@RequestScoped
public class AddICBean {

    @Inject
    Session session;

    private UCs uc;
    private PackageType[] values;

    public UCs getUc() {
        return uc;
    }

    public void setUc(UCs uc) {
        this.uc = uc;
    }

    public PackageType[] getValues() {
        return values;
    }

    public void setValues(PackageType[] values) {
        this.values = values;
    }

    public String add() {
        session.addUC(uc);
        return "list";
    }

    public String goBack() {
        return "success";
    }

    @PostConstruct
    private void initModel() {
        uc = new UCs();
        values = PackageType.values();
    }

   
}
