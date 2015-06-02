/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pl.lodz.p.it.java.model.Capacitor;
import pl.lodz.p.it.java.model.CapacityUnit;
import pl.lodz.p.it.java.model.Set;


@Named(value = "addCapacitorBean")
@RequestScoped
public class AddCapacitorBean {

	@EJB
	Set set;

	private Capacitor capacitor;
	private CapacityUnit[] values;

	private int capacity;
	private CapacityUnit unit;

	public String add() {
		capacitor.setC(capacity);
		capacitor.setUnit(unit);
		set.addElement(capacitor);
		return "list";
	}

	public String goBack() {
		return "success";
	}

	public Capacitor getCapacitor() {
		return capacitor;
	}

	public void setCapacitor(Capacitor capacitor) {
		this.capacitor = capacitor;
	}

	public CapacityUnit[] getValues() {
		return this.values;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public CapacityUnit getUnit() {
		return unit;
	}

	public void setUnit(CapacityUnit unit) {
		this.unit = unit;
	}

	@PostConstruct
	private void initModel() {
		this.values = CapacityUnit.values();
		capacitor = new Capacitor();
		capacitor.setC(55);
		capacitor.setUnit(CapacityUnit.micro);
	}

	public String test() {
		return "test";
	}
}
