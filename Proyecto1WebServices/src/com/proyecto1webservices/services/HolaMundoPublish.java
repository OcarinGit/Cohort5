package com.proyecto1webservices.services;

import javax.xml.ws.Endpoint;

public class HolaMundoPublish {

	public static void main(String[] args) {
		System.out.println("Publicando Servicio");
		
		Endpoint.publish("http://localhost:8974/hw", new HolaMundoServiceImplentation());
		
		System.out.println("Servicio Publicado");
	}

}
