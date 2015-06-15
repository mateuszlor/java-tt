/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.session;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import pl.lodz.p.it.java.endpoints.EndpointLocal;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;

@SessionScoped
public class Session implements Serializable {

    @EJB
    private EndpointLocal endpoint;

    public List<Resistors> getAllResistors() {
        return endpoint.getAllResistors();
    }

    public List<Capacitors> getAllCapacitors() {
        return endpoint.getAllCapacitors();
    }

    public void addCapacitor(Capacitors capacitor) {
        endpoint.addCapacitor(capacitor);
    }

    public void addResistor(Resistors resistor) {
        endpoint.addResistor(resistor);
    }

    public List<UCs> getAllUCs() {
        return endpoint.getUCs();
    }

}
