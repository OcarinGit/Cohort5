package com.primeservice.webservices;

import javax.jws.WebService;

@WebService(endpointInterface="com.primeservice.webservices.HolaMundoServer")
public class HolaMundoServerImplementation implements HolaMundoServer {

	public String HolaMundoMensaje(String nombre) {
		return "Hola Mundo "+nombre;
	}
	
	
}
