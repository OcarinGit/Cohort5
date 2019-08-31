package com.proyectoasincrono.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectoasincrono.modelo.Numeros;

@WebServlet("/Numeros")
public class SumaNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Ya estamos en el POST en el servlet");
		
		Numeros numeros = new Numeros();
		String sNumero1;
		String sNumero2;
		
		sNumero1=request.getParameter("txtNumero1");
		sNumero2=request.getParameter("txtNumero2");
		//response.getWriter().append("Numero1:"+sNumero1);
		//response.getWriter().append("Numero2:"+sNumero2);
		numeros.setNumero1(Float.parseFloat(sNumero1));
		numeros.setNumero2(Float.parseFloat(sNumero2));
		response.getWriter().append("La suma es:"+numeros.sumaNumeros());
	}

}
