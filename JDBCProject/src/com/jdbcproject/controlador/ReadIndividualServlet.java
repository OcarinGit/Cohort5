package com.jdbcproject.controlador;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


@WebServlet("/ReadIndividualServlet")
public class ReadIndividualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idAutor = request.getParameter("txtidAutor");
		
		String url="jdbc:mysql://127.0.0.1:3306/biblioteca";
		String user="root";
		String pass="root";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = (Connection) DriverManager.getConnection(url,user,pass);
			Statement stmn  = (Statement) conn.createStatement();
			ResultSet rs;
			
			rs= stmn.executeQuery("SELECT * FROM autores WHERE idautor="+idAutor);
			while(rs.next())
			{
				response.getWriter().append("Id Autor:"+rs.getInt("idautor")+"<br/>");
				response.getWriter().append("Nombre Autor:"+rs.getString("nombre")+"<br/>");
				response.getWriter().append("Apellido Autor:"+rs.getString("apellido")+"<br/>");
				response.getWriter().append("Telefono Autor:"+rs.getInt("telefono")+"<br/>");
				response.getWriter().append("Domicilio Autor:"+rs.getString("domicilio")+"<br/>");
				response.getWriter().append("Salario Autor:"+rs.getDouble("salario")+"<br/><br/>");
			}
			response.getWriter().append("<a href=\"index.jsp\">Regresar</<>");
			rs.close();
			stmn.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Error de Base de datos "+e);
		}
	}

}
