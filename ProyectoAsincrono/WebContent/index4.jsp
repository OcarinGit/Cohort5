<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Práctica de Nombre</title>
</head>
<body>
<h1>Práctica Asíncrona</h1>
<p>
<div class="form-inline">
<label for="txtNombre">Nombre:</label>
<input class="form-control" id="txtNombre" type="text" name="txtNombre">
</div>
</p>

<input class="btn btn-success" id="btnNombre" type="button" value="Dame Nombre">
<p><a href="index.jsp">index.jsp</a> </p>
<div id="divResultado"></div>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/scriptJQueryconFlecha.js"></script>
</body>
</html>