package com.proyecto1webservices.services;

import javax.jws.WebService;

@WebService (endpointInterface="com.proyecto1webservices.services.HolaMundoService")
public class HolaMundoServiceImplentation implements HolaMundoService{
	
	public String HolaMundo()
	{
		return "Hola Munditu";
	}

}
