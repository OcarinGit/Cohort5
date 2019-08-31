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

@WebServlet("/BorrarAutorServlet")
public class BorrarAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Estoy borrando a un autor");
		String idAutor;
		idAutor=request.getParameter("txtIdAutor");
		
		response.getWriter().append("Id autor:"+idAutor);
		
		String url;
		String user;
		String pass;
		String sentenciaSQL="DELETE FROM autores WHERE idautor="+idAutor;
		
		url="jdbc:mysql://127.0.0.1:3306/biblioteca";
		user="root";
		pass="root";
		
		try
		{
			Connection conn;
			Statement stmnt;
			int resultado;
			//ResultSet rs;
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = (Connection) DriverManager.getConnection(url,user,pass);
			stmnt = (Statement) conn.createStatement();
			resultado = stmnt.executeUpdate(sentenciaSQL);
			if(resultado>0)
				response.getWriter().append("Registros Borrados:"+resultado);
			else
				response.getWriter().append("No se borró el registro");
			//rs = stmnt.executeQuery(sentenciaSQL);
			
			/*while(rs.next())
			{
				response.getWriter().append("id Autor:"+rs.getInt("idautor"));
			}*/
			
			//rs.close();
			stmnt.close();
			conn.close();
		}
		catch(Exception ex)
		{
			System.out.println("Error en la conexión"+ex);
		}
		/*
		String idAutor2;
		idAutor2=request.getParameter("txtIdAutor2");
		
		response.getWriter().append("Id autor:"+idAutor2);*/
	}

}
