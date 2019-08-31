package com.helloworld;

public class HelloWorld {
	
	private String mensaje;
	
	public HelloWorld()
	{
		System.out.println("Object Created");
	}
	public void setMensaje(String msg)
	{
		mensaje=msg;
	}
	
	public String getMensaje() 
	{
		return mensaje;
	}

}
