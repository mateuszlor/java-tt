/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.endpoints;

import java.util.List;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;

public interface EndpointLocal {

    public List<Resistors> getAllResistors();

    public void addResistor(Resistors resistor);

    public List<Capacitors> getAllCapacitors();

    public void addCapacitor(Capacitors capacitor);

    public List<UCs> getUCs();

}
