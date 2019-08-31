package com.primeservice.webservices;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HolaMundoCliente {

	public static void main(String[] args) {
		try
		{
			URL url = new URL("http://localhost:8976/hw?wsdl");
			QName qname = new QName("http://webservices.primeservice.com/", "HolaMundoServerImplementationService");
			
			Service service = Service.create(url, qname);
			
			HolaMundoServer server =service.getPort(HolaMundoServer.class);
			String name = "ElMacho";
			System.out.println(server.HolaMundoMensaje(name));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
