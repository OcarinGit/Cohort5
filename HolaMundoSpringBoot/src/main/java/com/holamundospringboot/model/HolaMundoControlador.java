package com.holamundospringboot.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoControlador {

	@RequestMapping("/HolaMundo")
	public String Holo() 
	{
		return "Holo";
	}
}
