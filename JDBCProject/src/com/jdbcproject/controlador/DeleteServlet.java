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

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Declaro las variables que corresponden a las cajas de texto
		String idAutor;
		
		//Me traigo los valores del objeto request y los guardo en las variables recién declaradas
		idAutor = request.getParameter("txtIdAutor");
		
		//Compruebo que las variables String realmente obtuvieron (cacharon) los valores del objeto request mediante una salida al objeto response.
		//response.getWriter().append("Id Autor:"+idAutor);
	
		//Declaro las variables necesarias que contendrán los valores para crear la conexión a la base de datos.
		String url;
		String user;
		String pass;
		String SentenciaSQL;
		
		//Asigno los valores iniciales a dichas variables.
		url="jdbc:mysql://127.0.0.1:3306/biblioteca";
		user="root";
		pass="root";
		SentenciaSQL="SELECT * FROM Autores WHERE idautor="+idAutor;
		
		//Crear la conexión a la base de datos
		try
		{
			//Instanciamos el API del connector
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//Declaramos el objeto de tipo Connection que nos permitirá abrir la conexión
			Connection conn;
			
			//Declaramos el objeto Statement que nos permite ejecutar sentencias SQL sobre la base de datos
			Statement stmnt;
			
			//Declaramos el objeto ResultSet que nos permite guardar los datos obtenidos por las sentencias sql ejecutadas en la base de datos
			ResultSet rs;
			
			//Abrimos la conexión a la base de datos
			conn = (Connection) DriverManager.getConnection(url, user, pass);
			
			//Creamos la instancia de la sentencia sql que apunte al objeto connection
			stmnt = (Statement) conn.createStatement();
			
			//Ejecuto la sentencis SQL almacenada en la variable String
			rs = stmnt.executeQuery(SentenciaSQL);
			
			//Recorremos el ResultSet para obtener la información que se trajo de la base de datos
			while(rs.next())
			{
				response.getWriter().append("<form action=\"BorrarAutorServlet\" method=\"get\">");
				//response.getWriter().append("Id Autor:"+rs.getInt("idautor")+"<br/>");
				
				request.setAttribute("txtIdAutor2", rs.getInt("idautor"));
				
				response.getWriter().append("Id Autor:"+"<input type=\"text\" id=\"txtIdAutor\" name=\"txtIdAutor\" value=\""+rs.getInt("idautor")+"\" readonly=\"readonly\"><br/>");
				
				response.getWriter().append("Nombre Autor:"+rs.getString("nombre")+"<br/>");
				response.getWriter().append("Apellido Autor:"+rs.getString("apellido")+"<br/>");
				response.getWriter().append("Teléfono Autor:"+rs.getInt("telefono")+"<br/>");
				response.getWriter().append("Domicilio Autor:"+rs.getString("domicilio")+"<br/>");
				response.getWriter().append("Salario Autor:"+rs.getDouble("Salario")+"<br/>");
				response.getWriter().append("<p><input type=\"submit\" value=\"Borrar Usuario\"</p>");
				response.getWriter().append("</form>");
				
			}
			
			//Cerramos todos los objetos
			rs.close();
			stmnt.close();
			conn.close();
		}
		catch(Exception tacos)
		{
			System.out.println("Error en la conexión:"+tacos);
		}
		
	}

}
