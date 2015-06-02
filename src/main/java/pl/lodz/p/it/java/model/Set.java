package pl.lodz.p.it.java.model;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

@Stateful
public class Set {
	private List<Element> elements;

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public Set() {
		this.elements = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Element e = new Element();
			e.setName("aaa");
			elements.add(e);
		}
		for (int i = 0; i < 5; i++) {
			Resistor r = new Resistor();
			r.setR(4700);
			elements.add(r);
		}
		for (int i = 0; i < 5; i++) {
			Capacitor c = new Capacitor();
			c.setC(10);
			c.setUnit(CapacityUnit.micro);
			elements.add(c);
		}
	}
	
	public void addElement(Element e) {
		elements.add(e);
	}
}
