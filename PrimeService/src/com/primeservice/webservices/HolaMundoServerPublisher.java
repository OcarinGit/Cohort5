package com.primeservice.webservices;

import javax.xml.ws.Endpoint;

public class HolaMundoServerPublisher {

	public static void main(String[] args) {
		System.out.println("Comenzando la publicaci�n del servicio HolaMundoService");
		Endpoint.publish("http://localhost:8977/hw", new HolaMundoServerImplementation());
		System.out.println("Se ha terminado la publicaci�n");

	}

}