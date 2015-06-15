/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.endpoints;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import pl.lodz.p.it.java.facades.CapacitorFacadeLocal;
import pl.lodz.p.it.java.facades.ResistorFacadeLocal;
import pl.lodz.p.it.java.facades.UCFacadeLocal;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;

@Stateful
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class Endpoint implements EndpointLocal {

    @EJB
    private CapacitorFacadeLocal capacitorFacade;
    @EJB
    private ResistorFacadeLocal resistorFacade;
    @EJB
    private UCFacadeLocal ucFacade;

    @Override
    public List<Resistors> getAllResistors() {
        return resistorFacade.findAll();
    }

    @Override
    public void addResistor(Resistors resistor) {
        resistorFacade.create(resistor);
    }

    @Override
    public List<Capacitors> getAllCapacitors() {
        return capacitorFacade.findAll();
    }

    @Override
    public void addCapacitor(Capacitors capacitor) {
       capacitorFacade.create(capacitor);
    }

    @Override
    public List<UCs> getUCs() {
        return ucFacade.findAll();
    }

}
