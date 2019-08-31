package com.loginapp.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginapp.modelo.Login;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Login Ivonne = new Login("Ivonne","Ivonne");
		Login estudianteGeneration = new Login();
		estudianteGeneration.setUsername("Quique");
		estudianteGeneration.setPassword("Quique");
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		String user;
		String pass;
		
		user= request.getParameter("txtUsername");
		pass = request.getParameter("txtPassword");
		
		
		if(user.equals(Ivonne.getUsername()) && pass.equals(Ivonne.getPassword()))
		{
			//response.getWriter().append("Usuario Sí Existe");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		}
		else if(user.equals(estudianteGeneration.getUsername()) && user.equals(estudianteGeneration.getPassword()))
		{
			//response.getWriter().append("Usuario Sí Existe");
			RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		}
		else
		{
			salida.println("Nombre de usuario y contraseña NO válidos.");
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			//response.getWriter().append("Usuario No Existe");
		}
		/*
		response.getWriter().append("Usuario:"+user+"<br/>");
		response.getWriter().append("Contraseña:"+pass+"<br/>");
		*/
		/*
		PrintWriter salida=response.getWriter();
		
		response.setContentType("text/html");
		salida.println("<html>");
		salida.println("<head><title>Página de Login</title></head>");
		salida.println("<body>");
		salida.println("<h1>Usuario Autenticado</h1>");
		salida.println("</body></html>");
		*/
	}

}
