<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=<device-width>, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- <link rel="stylesheet" href="css/bootstrap-reboot.min.css">
<link rel="stylesheet" href="css/style.css"/> -->
<title>Insert title here</title>
</head>
<body>
<h1>MVC Hibernate Project</h1>
<form action="CreatePacientesServlet" method="post">
<label for="NSSPacienteText">NSS Paciente:</label> 
<input id="NSSPacienteText" class="form-control" type="text" name="NSSPacienteText"/>
<label for="nombrePacienteText">Nombre Paciente:</label> 
<input id="nombrePacienteText" class="form-control" type="text" name="nombrePacienteText"/>
<label for="noCuartoText">No Cuarto:</label> 
<input id="noCuartoText" class="form-control" type="text" name="noCuartoText"/>
<label for="nombreResponsableText">Nombre Responsable:</label> 
<input id="nombreResponsableText" class="form-control" type="text" name="nombreResponsableText"/>
<input class="btn btn-primary" type="submit" value="Ok" />
</form>


<script src="js/jquery-3.3.1.min.js"></script>
<!-- <script src="js/popper.min.js"></script> -->
<script src="js/bootstrap.min.js"></script>
<!-- <script src="js/bootstrap.bundle.min.js"></script> 
<script src="js/script.js"></script>-->
</body>
</html>