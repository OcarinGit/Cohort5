package com.proyectojsf.modelo;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="HolaMundito", eager=true)
@RequestScoped
public class HolaMundo {
	
	public HolaMundo(){}
	
	public String getHolaMundo()
	{
		return "Hola Mundo Macho";
	}

}
