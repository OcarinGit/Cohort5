package com.holamundorest.services;


//Ejecución en el internet explorador
//http://localhost:8080/HolaMundoRest/fibonacci/prueba?limite=9
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/fibonacci")
public class FibonacciService {
	
	@GET
	@Path("/prueba")
	@Produces("application/json")
	public String fibonacci(@QueryParam("limite") int limite)
	{
		int fibonacci=0;
		int n1=0;
		int n2=1;
		
		//Límite  es -1
		for(int i=1;i<limite-1;i++)
		{
			fibonacci=n1+n2;
			n1=n2;
			n2=fibonacci;
		}
		
		return "{\"limite\":\""+limite+"\",\"fibonacci\":\""+fibonacci+"\"}";
		//return "["+limite+"]";
	}
}
