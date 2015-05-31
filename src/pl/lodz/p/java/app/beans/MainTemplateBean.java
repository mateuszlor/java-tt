/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.java.app.beans;

import java.util.Calendar;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "mainTemplateBean")
@RequestScoped
public class MainTemplateBean {

	public MainTemplateBean() {
	}

	public String year() {
		int year =  Calendar.getInstance().get(Calendar.YEAR);
		return Integer.toString(year);
	}
}
