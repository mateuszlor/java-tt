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
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import pl.lodz.p.it.java.model.Capacitors;

import pl.lodz.p.it.java.model.Element;
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
    private DataModel<Resistors> resistorsDataModel;
    private DataModel<Capacitors> capacitorsDataModel;
    private DataModel<UCs> ucsDataModel;

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
    private String selected;

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    @PostConstruct
    private void initModel() {
        resistors = session.getAllResistors();
        capacitors = session.getAllCapacitors();
        ucs = session.getAllUCs();
        resistorsDataModel = new ListDataModel(resistors);
        capacitorsDataModel = new ListDataModel(capacitors);
        ucsDataModel = new ListDataModel(ucs);
    }
}
