package com.proyecto1webservices.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface HolaMundoService {
	
	@WebMethod
	public String HolaMundo();

}
