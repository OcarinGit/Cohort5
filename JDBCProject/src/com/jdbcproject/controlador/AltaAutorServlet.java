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
import com.mysql.jdbc.Statement;

@WebServlet("/AltaAutorServlet")
public class AltaAutorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idAutor= Integer.parseInt(request.getParameter("txtidautor"));
		String nombre=request.getParameter("txtnombre");
		String apellido=request.getParameter("txtapellido");
		String domicilio=request.getParameter("txtdomicilio");
		int telefono=Integer.parseInt(request.getParameter("txttelefono"));
		double salario=Double.parseDouble(request.getParameter("txtsalario"));
		String url="jdbc:mysql://127.0.0.1:3306/biblioteca";
		String user="root";
		String pass="root";
		String sentenciaSQL="INSERT INTO autores (nombre,apellido,domicilio,telefono,salario) VALUES (?,?,?,?,?)";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn;
			PreparedStatement stmnt;
			int resultado;
			
			conn = (Connection) DriverManager.getConnection(url,user,pass);
			stmnt = (PreparedStatement) conn.prepareStatement(sentenciaSQL);
			//stmnt.setInt(1, idAutor);
			stmnt.setString(1, nombre);
			stmnt.setString(2, apellido);
			stmnt.setString(3, domicilio);
			stmnt.setInt(4, telefono);
			stmnt.setDouble(5, salario);
			
			resultado =stmnt.executeUpdate();
			if(resultado>0)
			{
				response.getWriter().append("Registros afectados:"+resultado);
			}
			else
			{
				response.getWriter().append("No hubo inserción de registros");
			}
			stmnt.close();
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println("Error en la bd:"+e);
		}
	}

}
