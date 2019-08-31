package com.operacionesmvc.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operacionesmvc.modelo.OperacionesMatematicas;

@WebServlet(description = "Este es mi servlet de suma", urlPatterns = { "/SumaServlet" })
public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sNum1="";
		String sNum2="";
		double dNum1=0.0;
		double dNum2=0.0;
		double dResultado=0.0;
		OperacionesMatematicas objOperaciones = new OperacionesMatematicas();
		
		sNum1 = request.getParameter("txtNumero1");
		sNum2 = request.getParameter("txtNumero2");
		dNum1=Double.parseDouble(sNum1);
		dNum2=Double.parseDouble(sNum2);
		dResultado=objOperaciones.Sumar(dNum1, dNum2);
		response.getWriter().append(String.valueOf(dResultado));
	}

}
