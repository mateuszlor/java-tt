/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "setBean")
@RequestScoped
public class SetBean {

	public SetBean() {
	}

	public String test() {
		return "test";
	}
	// @Inject
	// private KontoSession kontoSession;
}
