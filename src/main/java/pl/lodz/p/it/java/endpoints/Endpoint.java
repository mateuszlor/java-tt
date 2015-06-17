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
import pl.lodz.p.it.java.facades.ProjectFacadeLocal;
import pl.lodz.p.it.java.facades.ResistorFacadeLocal;
import pl.lodz.p.it.java.facades.UCFacadeLocal;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Projects;
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
    @EJB
    private ProjectFacadeLocal projectFacade;

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

    @Override
    public List<Projects> getAllProjects() {
        return projectFacade.findAll();
    }

    @Override
    public void addProject(Projects project) {
        projectFacade.create(project);
    }

    @Override
    public Projects getProject(Projects project) {
        return projectFacade.find(project.getId());
    }

    @Override
    public void saveProject(Projects project) {
        projectFacade.edit(project);
    }

    @Override
    public void addUC(UCs uc) {
        ucFacade.create(uc);
    }

    @Override
    public void addCapacitorToProject(Integer id, Projects projectState) {
        Capacitors c = capacitorFacade.find(id);
        c.setUsed(true);
        projectState.addCapacitor(c);
    }

    @Override
    public void addResistorToProject(Integer id, Projects projectState) {
        Resistors r = resistorFacade.find(id);
        r.setUsed(true);
        projectState.addResistor(r);
    }

    @Override
    public void addUCToProject(Integer id, Projects projectState) {
        UCs u = ucFacade.find(id);
        u.setUsed(true);
        projectState.addUC(u);
    }

}
