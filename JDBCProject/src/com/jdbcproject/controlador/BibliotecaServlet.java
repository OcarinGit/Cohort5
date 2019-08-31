package com.jdbcproject.controlador;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jdbcproject.modelo.Autores;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@WebServlet("/BibliotecaServlet")
public class BibliotecaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Autores Cristian = new Autores();
		
		Cristian.setidautor(Integer.parseInt(request.getParameter("txtidautor")));
		Cristian.setnombre(request.getParameter("txtnombre"));
		Cristian.setapellido(request.getParameter("txtapellido"));
		Cristian.setdomicilio(request.getParameter("txtdomicilio"));
		Cristian.setsalario(Double.parseDouble(request.getParameter("txtsalario")));
		
		response.getWriter().append("El id del autor:"+Cristian.getidautor()+"<br/>"+"Nombre:"+Cristian.getnombre()+"<br/>"+"Apellido:"+Cristian.getapellido()+"<br/>"+"Domicilio:"+Cristian.getdomicilio()+"<br/>"+"Sueldo:"+Cristian.getsalario());
		
		String url = "jdbc:mysql://127.0.0.1:3306/biblioteca";
		String user = "root";
		String password="root";
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = (Connection) DriverManager.getConnection(url,user,password);
			System.out.println("Conexión Exitosa");
			
			Statement stmnt = (Statement) conn.createStatement();
			
			ResultSet rs = stmnt.executeQuery("SELECT * FROM autores");
			
			while(rs.next())
			{
				System.out.println("Id Autor:"+rs.getInt("idautor"));
				System.out.println("Nombre Autor:"+rs.getString("nombre"));
				System.out.println("Apellido Autor:"+rs.getString("apellido"));
				System.out.println("Telefono Autor:"+rs.getInt("telefono"));
				System.out.println("Domicilio Autor:"+rs.getString("domicilio"));
				System.out.println("Salario Autor:"+rs.getDouble("salario"));
				System.out.println("");
			}
			conn.close();
		}
		catch(Exception e)
		{
			System.out.print("Conexión Fallida");
		}
	}

}
