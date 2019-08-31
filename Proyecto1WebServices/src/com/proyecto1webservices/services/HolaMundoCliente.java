package com.proyecto1webservices.services;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HolaMundoCliente {

	public static void main(String[] args) {
		try
		{
			URL url = new URL("http://localhost:8975/hw?wsdl");
			QName qname = new QName("http://services.proyecto1webservices.com/","HolaMundoServiceImplentationService");
			Service servicio = Service.create(url,qname);
			HolaMundoService servicioHolaMundo = servicio.getPort(HolaMundoService.class);
			
			System.out.println(servicioHolaMundo.HolaMundo());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		

	}

}
