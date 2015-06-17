/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Projects;
import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;
import pl.lodz.p.it.java.session.Session;

@Named(value = "addElementBean")
@RequestScoped
public class AddElementBean {

    @Inject
    Session session;

    private List<Resistors> resistors;
    private List<Capacitors> capacitors;
    private List<UCs> ucs;
    
    private List<String> choosenResistors;
    private List<String> choosenCapacitors;
    private List<String> choosenUcs;

    private Projects project;

    public List<String> getChoosenResistors() {
        return choosenResistors;
    }

    public void setChoosenResistors(List<String> choosenResistors) {
        this.choosenResistors = choosenResistors;
    }

    public List<String> getChoosenCapacitors() {
        return choosenCapacitors;
    }

    public void setChoosenCapacitors(List<String> choosenCapacitors) {
        this.choosenCapacitors = choosenCapacitors;
    }

    public List<String> getChoosenUcs() {
        return choosenUcs;
    }

    public void setChoosenUcs(List<String> choosenUcs) {
        this.choosenUcs = choosenUcs;
    }

    public List<Resistors> getResistors() {
        return resistors;
    }

    public void setResistors(List<Resistors> resistors) {
        this.resistors = resistors;
    }

    public List<Capacitors> getCapacitors() {
        return capacitors;
    }

    public void setCapacitors(List<Capacitors> capacitors) {
        this.capacitors = capacitors;
    }

    public List<UCs> getUcs() {
        return ucs;
    }

    public void setUcs(List<UCs> ucs) {
        this.ucs = ucs;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

    public String save() {
        for (String id : choosenCapacitors) {
            session.addCapacitorToProject(Integer.parseInt(id));
        }
        
        for (String id : choosenResistors) {
            session.addResistorToProject(Integer.parseInt(id));
        }
        
        for (String id : choosenUcs) {
            session.addUCToProject(Integer.parseInt(id));
        }
        
        session.saveProject();
        return "view_project";
    }

    @PostConstruct
    private void initModel() {
        project = session.getSavedProject();

        List<Resistors> rs = session.getAllResistors();
        resistors = new ArrayList<>();

        for (Resistors r : rs) {
            if (!r.isUsed()) {
                resistors.add(r);
            }
        }

        List<Capacitors> cs = session.getAllCapacitors();
        capacitors = new ArrayList<>();

        for (Capacitors c : cs) {
            if (!c.isUsed()) {
                capacitors.add(c);
            }
        }

        List<UCs> us = session.getAllUCs();
        ucs = new ArrayList<>();

        for (UCs u : us) {
            if (!u.isUsed()) {
                ucs.add(u);
            }
        }
    }
}
