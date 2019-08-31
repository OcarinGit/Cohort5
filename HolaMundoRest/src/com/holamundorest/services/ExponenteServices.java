package com.holamundorest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

//Ejecutar
//http://localhost:8080/HolaMundoRest/potencia/potencia/10/3
@Path("/potencia")
public class ExponenteServices {
	@Path("/potencia/{numero}/{base}")
	@GET
	@Produces("text/html")
	public String getPotencia(@PathParam("numero") int numero, @PathParam("base") int base) {
		return "<h1>Potencia de " + numero + " a la " + base + ": " + Potencia(numero, base);
	}
	
	public int Potencia(int numero, int base) {
		return (int) Math.pow(numero, base);
	}
	
	//Ejecutar en el ff
	//http://localhost:8080/HolaMundoRest/potencia/cesar?name=oscar&som=soma
	
	@GET
	@Path("/cesar")
	@Produces("text/html")
	public String HelloWorldHTML(@QueryParam("name") String name, @QueryParam("som") String som)
	{
		return "<h1>ola, " + name + " " + som +"</h1>";
	}
}
