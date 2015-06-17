/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import pl.lodz.p.it.java.beans.comparators.CapacitorComparator;
import pl.lodz.p.it.java.beans.comparators.ResistorsComparator;
import pl.lodz.p.it.java.beans.comparators.UCsComparator;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Projects;

import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;
import pl.lodz.p.it.java.session.Session;

@Named(value = "listPageBean")
@RequestScoped
public class ListPageBean {

    @Inject
    Session session;

    private List<Resistors> resistors;
    private List<Capacitors> capacitors;
    private List<UCs> ucs;
    private List<Projects> projects;
    private DataModel<Resistors> resistorsDataModel;
    private DataModel<Capacitors> capacitorsDataModel;
    private DataModel<UCs> ucsDataModel;
    private DataModel<Projects> projectsDataModel;

    public DataModel<Projects> getProjectsDataModel() {
        return projectsDataModel;
    }

    public void setProjectsDataModel(DataModel<Projects> projectsDataModel) {
        this.projectsDataModel = projectsDataModel;
    }

    public DataModel<Resistors> getResistorsDataModel() {
        return resistorsDataModel;
    }

    public void setResistorsDataModel(DataModel<Resistors> resistorsDataModel) {
        this.resistorsDataModel = resistorsDataModel;
    }

    public DataModel<Capacitors> getCapacitorsDataModel() {
        return capacitorsDataModel;
    }

    public void setCapacitorsDataModel(DataModel<Capacitors> capacitorsDataModel) {
        this.capacitorsDataModel = capacitorsDataModel;
    }

    public DataModel<UCs> getUcsDataModel() {
        return ucsDataModel;
    }

    public void setUcsDataModel(DataModel<UCs> ucsDataModel) {
        this.ucsDataModel = ucsDataModel;
    }
    
    public String viewProject(Projects project) {
        session.getProject(project);
        return "view_project";
    }
    
    @PostConstruct
    private void initModel() {
        resistors = session.getAllResistors();      
        Collections.sort(resistors, new ResistorsComparator());
        
        capacitors = session.getAllCapacitors();
        Collections.sort(capacitors,new CapacitorComparator());
        
        ucs = session.getAllUCs();
        Collections.sort(ucs, new UCsComparator());
        
        projects = session.getAllProjects();
        resistorsDataModel = new ListDataModel(resistors);
        capacitorsDataModel = new ListDataModel(capacitors);
        ucsDataModel = new ListDataModel(ucs);
        projectsDataModel = new ListDataModel<>(projects);
    }
}
