<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite User</title>
</head>
<body>
<form:form action="saveUser" method="post" modelAttribute="user">
<pre>
Id:<input type="text" name="id" value="${user.id}" />

PRENOM <form:input type="text" path="firstName" value="${user.prenom}" />
NOM <form:input type="text" path="lastName" value="${user.nom}"/>
EMAIL <form:input type="text" path="email" value="${user.email}"/>
PASSWORD <form:input type="password" path="password"  value="${user.password}"/>
NUMERO TELPHONE <form:input type="text" path="numTel" value="${user.numTel}"/>
NUMERO CARTE ELECTEUR <form:input type="text" path="numCarteElecteur" value="${user.numCarteElecteur}"/>
NUMERO IDENTIFICATION NATIONALE <form:input type="text"  path="nin" value="${user.nin}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayUsers">View All Users</a>
</body>
</html>