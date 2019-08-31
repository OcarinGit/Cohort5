package org.holamundo.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.holamundo.modelo.SumarNumeros;

@WebServlet("/SumarNumerosServlet")
public class SumarNumerosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SumarNumeros resultado;
		
		resultado = new SumarNumeros();
		response.getWriter().append("El resultado es:"+resultado.Sumar(2,3));
		
		resultado.setNumero1(10);
		resultado.setNumero2(7);
		response.getWriter().append("El resultado es:"+resultado.Sumar());
		
		resultado.setNumero1(5);
		resultado.setNumero2(2);
		response.getWriter().append(resultado.Sumar());
	}
}
