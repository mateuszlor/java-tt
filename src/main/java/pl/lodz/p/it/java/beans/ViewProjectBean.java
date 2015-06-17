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
import pl.lodz.p.it.java.model.Element;
import pl.lodz.p.it.java.model.ProjectStatus;
import pl.lodz.p.it.java.model.Projects;
import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;
import pl.lodz.p.it.java.session.Session;

@Named(value = "viewProjectBean")
@RequestScoped
public class ViewProjectBean {

    @Inject
    private Session session;

    private Projects project;
    private List<Element> elements;
    private ProjectStatus[] statuses;
    private ProjectStatus status;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public ProjectStatus[] getStatuses() {
        return statuses;
    }

    public void setStatuses(ProjectStatus[] statuses) {
        this.statuses = statuses;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }
    
    public String save() {
        project.setStatus(status);
        project.setDescription(description);
        session.saveProject();
        return "list_projects";
    }

    @PostConstruct
    private void initModel() {
        project = session.getSavedProject();
        description = project.getDescription();
        status = project.getStatus();

        statuses = ProjectStatus.values();
        
        elements = new ArrayList<>();

        for (Resistors r : session.getAllResistors()) {
            elements.add(r);
        }
        for (Capacitors c : session.getAllCapacitors()) {
            elements.add(c);
        }
        for (UCs u : session.getAllUCs()) {
            elements.add(u);
        }
    }
}
