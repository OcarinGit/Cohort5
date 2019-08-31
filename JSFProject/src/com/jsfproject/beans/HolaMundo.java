package com.jsfproject.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name = "HolaMundito")
@RequestScoped
public class HolaMundo {
	
	public HolaMundo() {
		
	}
	
	public String Hola() {
		return "Hola World";
	}
}
