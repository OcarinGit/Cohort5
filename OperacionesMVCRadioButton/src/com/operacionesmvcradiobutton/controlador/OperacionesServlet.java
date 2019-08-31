package com.operacionesmvcradiobutton.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operacionesmvcradiobutton.modelo.Operaciones;

@WebServlet("/OperacionesServlet")
public class OperacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sNum1;
		String sNum2;
		String sOpcion;
		double dNum1;
		double dNum2;
		double dResultado;
		
		Operaciones objOperacion=new Operaciones();
		
		sNum1=request.getParameter("txtNumero1");
		sNum2=request.getParameter("txtNumero2");
		sOpcion=request.getParameter("rdbOperacion");
		
		response.getWriter().append(sOpcion);
		if(sOpcion.equals("Suma"))
		{
			response.getWriter().append("El Resultado de la operacion es:"+objOperacion.Suma(Double.parseDouble(sNum1), Double.parseDouble(sNum2)));
		}
		if(sOpcion.equals("Resta"))
		{
			response.getWriter().append("El Resultado de la operacion es:"+objOperacion.Resta(Double.parseDouble(sNum1), Double.parseDouble(sNum2)));
		}
		if(sOpcion.equals("Multiplicacion"))
		{
			response.getWriter().append("El Resultado de la operacion es:"+objOperacion.Multi(Double.parseDouble(sNum1), Double.parseDouble(sNum2)));
		}
	}

}
