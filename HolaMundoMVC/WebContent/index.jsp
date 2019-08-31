<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css"/>
<script src="js/script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola Mundo</title>
</head>
<body>
	<h1>Hola Mundo</h1>
	<h2>Datos Personales</h2>
	<form id="formita" action="HolaMundoServlet" method="GET">
	<p><label for="txtNombre">Nombre:</label>
	<input id="txtNombre" type="text" name="Nombre"> </p>
	<p><label for="txtApellidos">Apellidos</label>
	<input id="txtApellidos" type="text" name="Apellidos"> </p>
	<p><label for="txtEdad">Edad</label>
	<input id="txtEdad" type="text" name="Edad"> </p>
	<input type="submit" value="Enviar datos">
	</form>
	<form id="frmServlet2" action="Suma4" method="get">
	<input type="submit" value="Suma">
	</form>
	<form id="frmServlet3" action="HTMLPersonalizado" method="post">
	<input type="submit" value="HTML Personalizado">
	</form>
	<form id="frmServlet4" action="HelloWorldServlet" method="post">
	<input type="submit" value="Hello Worlditu">
	</form>
	<form id="frmServlet5" action="SumarNumerosServlet" method="get">
	<input type="submit" value="Suma Numeros">
	</form>
</body>
</html>