<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Operaciones matemáticas</h1>
<form id="frmSuma" action="OperacionesServlet" method="get">

<p><label for="txtNumero1">Numero 1:</label> <input id="txtNumero1" type="text" name="txtNumero1"/>
 </p>
 <p><label for="txtNumero2">Numero 2:</label> <input id="txtNumero2" type="text" name="txtNumero2"/>
 </p>
 <p>
<input id="rdbOperacion" type="radio" name="rdbOperacion" value="Suma">Suma
<input id="rdbOperacion" type="radio" name="rdbOperacion" value="Resta">Resta
<input id="rdbOperacion" type="radio" name="rdbOperacion" value="Multiplicacion">Multiplicación
 </p>
 <p>
 <input type="submit" value="Realiza Operación"/>
 </p>
 </form>
</body>
</html>