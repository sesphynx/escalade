<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite User</title>
<%@include file="/WEB-INF//jsps/fragments/header.html" %>
</head>
<body>
<%@include file="/WEB-INF//jsps/fragments/menuBar.html" %>
<form:form action="sauvegarderUser" method="post" modelAttribute="user">

<table class="table table-dark" >

<tr>
<td>Id:</td>
<td><form:input type="text" name="id" value="${user.id}" />
</td>
</tr>


<tr>
<td>PRENOM</td> <td> <form:input type="text" path="firstName" value="${user.prenom}" /></td>
</tr>

<tr>
<td>NOM</td><td> <form:input type="text" path="lastName" value="${user.nom}"/></td>
</tr>
<tr>
<td>EMAIL</td><td> <form:input type="text" path="email" value="${user.email}"/></td>
</tr>
<tr>
<td>PASSWORD</td><td> <form:input type="password" path="password"  value="${user.password}"/></td>
</tr>
<tr>
<td>NUMERO TELPHONE</td><td> <form:input type="text" path="numTel" value="${user.numTel}"/></td>
</tr>	
	<tr>
	<td><input type="text" value="save"></td>
	</tr>
</table>
	
</form:form>
${msg}
<a href="toutUsers">Voir les Utilisateurs du Systéme</a>

<%@include file="/WEB-INF//jsps/fragments/footer.html" %>
</body>
</html>