package org.holamundo.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.holamundo.modelo.HelloWorld;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HelloWorld HolaMundo;
		HolaMundo = new HelloWorld();
		
		HolaMundo.setMensajitu("Mi mensaje es Hola Mundo");
		
		response.getWriter().append(HolaMundo.getMensajitu());
	}

}
