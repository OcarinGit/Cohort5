package com.springhelloworld2.helloworld;

public class Bienvenida {
	
	private String bienvenido;
	
	Bienvenida()
	{
		System.out.println("Objeto Bienvenida Creado");
	}
	
	public void setBienvenido(String bien)
	{
		bienvenido=bien;
	}
	
	public String getBienvenido()
	{
		return bienvenido;
	}
}
