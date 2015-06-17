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
import pl.lodz.p.it.java.model.Projects;
import pl.lodz.p.it.java.session.Session;

@Named
@RequestScoped
public class AddProjectBean {

    @Inject
    Session session;

    private Projects project;
    private String description;

    public Projects getProject() {
        return project;
    }

    public void setProject(Projects project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String add() {
        session.addProject(project);
        return "list_projects";
    }

    @PostConstruct
    private void initModel() {
        project = new Projects();
    }
}
