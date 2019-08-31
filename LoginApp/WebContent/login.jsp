<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Página de Login</h1>
<form id="frmLogin" method="post" action="LoginServlet">
<p>
<label for="txtUsername">Username:</label><input type="text" name="txtUsername">
</p>
<p>
<label for="txtPassword">Password:</label><input type="Password" name="txtPassword">
</p>
<p><input type="submit" value="Login"></p>
</form>

<form id="frmSearch" method="post" action="GoogleServlet">
<p>
<label for="txtSearch">Search:</label><input type="text" name="txtSearch">
</p>
<p><input type="submit" value="Google it"></p>
</form>
<%
for(int cont=0;cont<10;cont++)
{
	out.println("Perritu");
}
%>
</body>
</html>