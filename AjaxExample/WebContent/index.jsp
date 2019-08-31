<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Ejercicio Ajax</h1>
<p><label for="txtNombre">Nombre:</label>
<input id="txtNombre" type="text" name="txtNombre"/> </p>
<p><label for="txtNumero1">Numero 1:</label> <input id="txtNumero1" type="text" name="txtNumero1"> </p>
<p><label for="txtNumero2">Numero 2:</label> <input id="txtNumero2" type="text" name="txtNumero2"> </p>
<p><input id="btnLlamarServidorGET" type="button" value="Llamar Servidor GET"/> </p>
<p><input id="btnLlamarServidorPOST" type="button" value="Llamar Servidor POST"/> </p>

<div id="divResultadoAjax"></div>
<div id="divCochesAjax"></div>
<div id="divSumaAjax"></div>
<script src="js/jquery-3.3.1.min.js"></script> 
<script src="js/scriptAjaxServlet.js"></script>
</body>
</html>