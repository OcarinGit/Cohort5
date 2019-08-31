package com.apprestws.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/holita")
public class HolaMundoRestService {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{name}")
	public String HoloXML(@PathParam("name") String name)
	{
		return "<?xml version=\"1.0\"?><holo>Holo"+name+"</holo>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String HoloHTML()
	{
		return "<h1>Holo</h1>";
	}
}
