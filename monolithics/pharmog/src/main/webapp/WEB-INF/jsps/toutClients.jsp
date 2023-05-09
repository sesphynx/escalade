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
<title>CLIENTS</title>
</head>
<body>
<h2>Clients</h2>
<table>
<tr>
<th>Prenom</th>
<th>Nom</th>
<th>Email</th>
<th>Password</th>
<th>Phone</th>

</tr>
<c:forEach  items="${clients}" var="client">
<tr>
<td>${client.prenom}</td>
<td>${client.nom}</td>
<td>${client.email}</td>
<td>${client.password}</td>
<td>${client.phone}</td>

<td><a href="supprimerClient?id=${client.id}"><button type="submit">effacer</button></a></td>
<td><a href="ciblerClient?id=${client.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>


</table>
<a href="/creerClient"> Ajouter Client</a>

</body>
</html>