package com.jdbcproject.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;

@WebServlet("/UpdateAuthorServlet")
public class UpdateAuthorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String idAutor = request.getParameter("txtidautor");
	//response.getWriter().append("Id Autor:"+idAutor);
	
	String url;
	String user;
	String pass;
	String sentenciaSQL;
	
	url="jdbc:mysql://127.0.0.1:3306/biblioteca";
	user="root";
	pass="root";
	sentenciaSQL="SELECT * FROM autores WHERE idautor="+idAutor;
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn;
		Statement stmnt;
		ResultSet rs;
		
		conn = (Connection) DriverManager.getConnection(url, user, pass);
		
		stmnt = (Statement) conn.createStatement();
		
		rs = stmnt.executeQuery(sentenciaSQL);
		
		while(rs.next())
		{
			response.getWriter().append("<form action=\"UpdateServlet\" method=\"get\">");
			response.getWriter().append("<p>Id Autor:<input type=\"text\" name=\"txtidautor\" value=\""+rs.getInt("idautor")+"\"> </p>");
			response.getWriter().append("<p>Nombre Autor:<input type=\"text\" name=\"txtnombreautor\" value=\""+rs.getString("nombre")+"\"> </p>");
			response.getWriter().append("<p>Apellido Autor:<input type=\"text\" name=\"txtapellidoautor\" value=\""+rs.getString("apellido")+"\"> </p>");
			response.getWriter().append("<p>Telefono Autor:<input type=\"text\" name=\"txttelefonoautor\" value=\""+rs.getInt("telefono")+"\"> </p>");
			response.getWriter().append("<p>Domicilio Autor:<input type=\"text\" name=\"txtdomicilioautor\" value=\""+rs.getString("domicilio")+"\"> </p>");
			response.getWriter().append("<p>Salario Autor:<input type=\"text\" name=\"txtsalarioautor\" value=\""+rs.getDouble("salario")+"\"> </p>");
			response.getWriter().append("<p><input type=\"submit\" value=\"Actualiza Registro\"></p>");
			response.getWriter().append("</form>");
		}
	}
	catch(Exception e)
	{
		System.out.println("Error en la bd:"+e);
	}
	}

}
