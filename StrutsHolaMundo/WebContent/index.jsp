<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts App</title>
</head>
<body>
<h2>Bienvenido a mi Page</h2>

<s:form action="holaworld.action" method="post">
	<s:textfield label="Mensaje" name="msg"/> 
	<s:textfield name="username" key="label.username" size="20"></s:textfield>
	<s:password name="password" key="label.password" size="20" />
	<s:submit method="execute" key="label.login" align="center" />
</s:form>
</body>
</html>