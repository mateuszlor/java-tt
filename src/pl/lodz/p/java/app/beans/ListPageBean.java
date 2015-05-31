/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.java.app.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import pl.lodz.p.java.app.model.Element;
import pl.lodz.p.java.app.model.Set;
import pl.lodz.p.java.app.persistance.CSV;

@Named(value = "listPageBean")
@RequestScoped
public class ListPageBean {

	private List<Element> elements;
	private DataModel<Element> elementsDataModel;
	private String selected;
//	private CSV csv;

	public DataModel<Element> getElementsDataModel() {
//		csv.save();
		System.out.println("aaa");
		return elementsDataModel;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	@PostConstruct
	private void initModel() {
		Set set = new Set();
		elements = set.getElements();
		elementsDataModel = new ListDataModel<Element>(elements);
//		csv = new CSV(set); 
//		csv.save();
	}
	
//	public void save() {
//
//		csv.save();
//		System.out.println("aaa");
//	}
	public String test() {
		return "test";
	}
}
