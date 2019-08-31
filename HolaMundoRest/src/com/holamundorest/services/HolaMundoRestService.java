package com.holamundorest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//Ejecución en el internet explorador
//http://localhost:8080/HolaMundoRest/holamundo
@Path("/holamundo")
public class HolaMundoRestService {
	
	@GET
	@Produces("text/html")
	public String HolaMundoHTML()
	{
		return "<h1>Hola Mundo</h1>";
	}
}
