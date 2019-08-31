package com.junitproject.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.junitproject.modelo.OperacionesMatematicas;

@WebServlet("/SumarServlet")
public class SumarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OperacionesMatematicas objOperaciones;
		objOperaciones = new OperacionesMatematicas();
		objOperaciones.setNumero1(Double.parseDouble(request.getParameter("txtNumero1")));
		objOperaciones.setNumero2(Double.parseDouble(request.getParameter("txtNumero2")));
		response.getWriter().append("Resultado de la suma:"+objOperaciones.sumarNumeros());
	}

}
