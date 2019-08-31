package com.holamundorest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//Abrir el ff y ejecutar con:
//http://localhost:8080/HolaMundoRest/factorial/factorial/5
@Path("/factorial")
public class FactorialService {
	
	@GET
	@Path("/factorial/{limite}")
	@Produces("text/xml")
	public String Factorial(@PathParam("limite") int limite)
	{
		int factorial=1;
		String cadenaResultante="";
		
		if(limite>0)
		{
			
			for(int i=1;i<=limite;i++)
			{
				factorial = factorial*i;
			}
			
			cadenaResultante= "<?xml version='1.0' encoding='UTF-8'?>"
					+"<facto><limite>valor del limite:"+limite+"</limite>"
					+ "<factorial>valor del factorial:"+factorial+"</factorial></facto>";
			}
		else if (limite==0)
		{
			cadenaResultante= "<?xml version='1.0' encoding='UTF-8'?>"
					+"<facto><limite>valor del limite:"+limite+"</limite>"
					+ "<factorial>valor del factorial:1</factorial></facto>";
		}
		else
		{
			cadenaResultante= "<?xml version='1.0' encoding='UTF-8'?>"
					+"<facto>Introduce un número positivo pofavó</facto>";
		}
		return cadenaResultante;
	}
}
