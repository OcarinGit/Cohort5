package com.ajaxservlet.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/text");
		response.getWriter().append("Entró al servlet en GET");
		String txtNombre=request.getParameter("txtNombre");
		response.getWriter().append("Valor del textbox:"+txtNombre);
		String txtNumero1=request.getParameter("txtNumero1");
		response.getWriter().append("Valor del textbox:"+txtNumero1);
		String txtNumero2=request.getParameter("txtNumero2");
		response.getWriter().append("Valor del textbox:"+txtNumero2);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.setContentType("application/text");
		//response.getWriter().append("Entró al servlet en POST");
		String txtNombre=request.getParameter("txtNombre");
		//response.getWriter().append("Valor del textbox:"+txtNombre);
		String txtNumero1=request.getParameter("txtNumero1");
		//response.getWriter().append("Valor del textbox:"+txtNumero1);
		String txtNumero2=request.getParameter("txtNumero2");
		//response.getWriter().append("Valor del textbox:"+txtNumero2);
		int resultado = Integer.parseInt(txtNumero1)+Integer.parseInt(txtNumero2);
		
		response.setContentType("application/json;charset=UTF-8");
		//System.out.println("{\"suma\":\""+resultado+"\", \"CocheBarato\" : \"Ford\", \"CocheCaro\" : \"BMW\", \"CocheMedio\" : \"Fiat\"}");
		response.getWriter().append("{\"suma\":\""+resultado+"\", \"CocheBarato\" : \"Ford\", \"CocheCaro\" : \"BMW\", \"CocheMedio\" : \"Fiat\"}");
		//handleRequest(request, response);
		
	}
	
	public void handleRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PrintWriter out = res.getWriter();
		
        res.setContentType("text/plain");

 
        res.getWriter().append("Entra a obtener los parameternames");
        System.out.println("Entra a obtener los parameternames");
        Enumeration<String> parameterNames = req.getParameterNames();

 

        while (parameterNames.hasMoreElements()) {

        	res.getWriter().append("Entra al ciclo while");
        	System.out.println("Entra al ciclo while");

            String paramName = parameterNames.nextElement();

            out.write(paramName);

            out.write("n");

 

            String[] paramValues = req.getParameterValues(paramName);

            for (int i = 0; i < paramValues.length; i++) {
            	res.getWriter().append("Entra al ciclo for");
            	System.out.println("Entra al ciclo for");

                String paramValue = paramValues[i];

                out.write("t" + paramValue);

                out.write("n");

            }

        }

        out.close();
	}
	
}
