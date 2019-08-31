package com.jdbcproject.controlador;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idAutor=request.getParameter("txtidautor");
		String nombreAutor=request.getParameter("txtnombreautor");
		String apellidoAutor=request.getParameter("txtapellidoautor");
		String telefonoAutor=request.getParameter("txttelefonoautor");
		String domicilioAutor=request.getParameter("txtdomicilioautor");
		String salarioAutor=request.getParameter("txtsalarioautor");
		
		String url;
		String user;
		String pass;
		String sentenciaSQL;
		
		url="jdbc:mysql://127.0.0.1:3306/biblioteca";
		user="root";
		pass="root";
		sentenciaSQL="UPDATE autores SET nombre=?, apellido=?, telefono=?, domicilio=?, salario=? WHERE idautor=?";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn;
			PreparedStatement stmnt;
			int resultado;
			
			conn = (Connection) DriverManager.getConnection(url,user,pass);
			stmnt = (PreparedStatement) conn.prepareStatement(sentenciaSQL);
			stmnt.setString(1, nombreAutor);
			stmnt.setString(2, apellidoAutor);
			stmnt.setInt(3, Integer.parseInt(telefonoAutor));
			stmnt.setString(4, domicilioAutor);
			stmnt.setDouble(5, Double.parseDouble(salarioAutor));
			stmnt.setInt(6, Integer.parseInt(idAutor));
			resultado=stmnt.executeUpdate();
			if(resultado>0)
			{
				response.getWriter().append("Cantidad de registros afectados:"+resultado);
			}
			else
			{
				response.getWriter().append("Actualización Fallida");
			}
			
			stmnt.close();
			conn.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
