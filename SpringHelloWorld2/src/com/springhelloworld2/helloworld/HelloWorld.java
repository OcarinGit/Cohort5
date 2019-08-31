package com.springhelloworld2.helloworld;

public class HelloWorld {
	
	private String mensajitu;
	private Bienvenida bien; //Este tipo de relaci�n se denomina HAS-A
	
	HelloWorld()
	{
		System.out.println("Objeto Hello World Creado");
		//bien = new Bienvenida();
	}
	
	HelloWorld(Bienvenida b){
		bien = b;
	}
	
	public void setMensajitu(String msg)
	{
		mensajitu=msg;
	}
	
	public String getMensajitu()
	{
		return mensajitu;
	}
	
	public void miInicio()
	{
		System.out.println("Objeto Inicializado");
	}
	
	public void miFin()
	{
		System.out.println("Objeto Finalizado");
	}
	
	public void setBien(Bienvenida b)
	{
		bien = b;
	}
	
	public Bienvenida getBien()
	{
		return bien;
	}
}
