/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.CapacityUnit;
import pl.lodz.p.it.java.session.Session;

@Named(value = "addCapacitorBean")
@RequestScoped
public class AddCapacitorBean {

    @Inject
    Session session;

    private Capacitors capacitor;
    private CapacityUnit[] values;

    private int capacity;
    private CapacityUnit unit;

    public String add() {
        capacitor.setC(capacity);
        capacitor.setUnit(unit);
        session.addCapacitor(capacitor);
        return "list";
    }

    public String goBack() {
        return "success";
    }

    public Capacitors getCapacitor() {
        return capacitor;
    }

    public void setCapacitor(Capacitors capacitor) {
        this.capacitor = capacitor;
    }

    public CapacityUnit[] getValues() {
        return this.values;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public CapacityUnit getUnit() {
        return unit;
    }

    public void setUnit(CapacityUnit unit) {
        this.unit = unit;
    }

    @PostConstruct
    private void initModel() {
        capacitor = new Capacitors();
        this.values = CapacityUnit.values();
    }

    public String test() {
        return "test";
    }
}
