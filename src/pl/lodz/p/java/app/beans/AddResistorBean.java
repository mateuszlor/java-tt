/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.java.app.beans;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pl.lodz.p.java.app.model.Resistor;
import pl.lodz.p.java.app.model.Set;

@Named
@RequestScoped
public class AddResistorBean {
	
	@EJB
	Set set;

	private Resistor resistor;
	
	public String add() {
		set.addElement(resistor);
		return "list";
	}
    
    public String goBack() {
        return "success";
    }

	public Resistor getResistor() {
		return resistor;
	}

	public void setResistor(Resistor resistor) {
		this.resistor = resistor;
	}
}
