package com.proyectoasincrono.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.proyectoasincrono.modelo.DatosPersonales;

@WebServlet("/DatosPersonalesServlet")
public class DatosPersonalesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Servlet Datos Personales Método GET");
		response.setContentType("UTF-8");
		response.setCharacterEncoding("UTF-8");
		DatosPersonales Daniel = new DatosPersonales();
		Daniel.setNombre(request.getParameter("txtNombre"));
		response.getWriter().append("Valor de Nombre:"+Daniel.getNombre());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Servlet Datos Personales Método POST");
	}

}
