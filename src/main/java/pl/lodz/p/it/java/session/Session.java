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
import pl.lodz.p.it.java.model.Projects;
import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;

@SessionScoped
public class Session implements Serializable {

    @EJB
    private EndpointLocal endpoint;

    private Projects projectState;

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

    public List<Projects> getAllProjects() {
        return endpoint.getAllProjects();
    }

    public void addProject(Projects project) {
        endpoint.addProject(project);
    }

    public void getProject(Projects project) {
        projectState = endpoint.getProject(project);
    }
    
    public Projects getSavedProject() {
        return projectState;
    }

    public void saveProject() {
        endpoint.saveProject(projectState);
    }

    public void addUC(UCs uc) {
        endpoint.addUC(uc);
    }

    public void addCapacitorToProject(Integer id) {
        endpoint.addCapacitorToProject(id, projectState);
    }

    public void addResistorToProject(Integer id) {
        endpoint.addResistorToProject(id, projectState);
    }

    public void addUCToProject(Integer id) {
        endpoint.addUCToProject(id, projectState);
    }
}
