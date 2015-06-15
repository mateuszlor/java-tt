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
import javax.validation.ConstraintViolationException;
import pl.lodz.p.it.java.model.ResistanceUnit;

import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.session.Session;

@Named
@RequestScoped
public class AddResistorBean {

    @Inject
    Session session;

    private Resistors resistor;
    private int resistance;
    private ResistanceUnit unit;
    private ResistanceUnit[] values;

    public String add() {
        try {
            resistor.setR(resistance);
            resistor.setUnit(unit);
            session.addResistor(resistor);
            return "list";
        } catch (Exception e)  {
            e.printStackTrace();
        }
        return null;
    }

    public String goBack() {
        return "success";
    }

    @PostConstruct
    private void initModel() {
        resistor = new Resistors();
        values = ResistanceUnit.values();
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public ResistanceUnit getUnit() {
        return unit;
    }

    public void setUnit(ResistanceUnit unit) {
        this.unit = unit;
    }

    public ResistanceUnit[] getValues() {
        return values;
    }

    public void setValues(ResistanceUnit[] values) {
        this.values = values;
    }

    public Resistors getResistor() {
        return resistor;
    }

    public void setResistor(Resistors resistor) {
        this.resistor = resistor;
    }
}
