package com.primeservice.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HolaMundoServer {
	
	@WebMethod
	public String HolaMundoMensaje(String nombre);
}
