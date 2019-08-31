package org.holamundo.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HTMLPersonalizado
 */
@WebServlet("/HTMLPersonalizado")
public class HTMLPersonalizado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HTMLPersonalizado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Testitu de prueba");
		PrintWriter salida;
		salida= response.getWriter();
		
		response.setContentType("text/html");
		salida.println("<html>");
		salida.println("<head><title>HTML Personalizado</title></head>");
		salida.println("<body>");
		salida.println("<h1>Título Personalizado</h1>");
		salida.println("<p>Algo de testo</p>");
		for(int i=0;i<10;i++)
		{
			salida.println("<p>Testo No:"+i+"</p>");
		}
		salida.println("</body></html>");
	}

}
