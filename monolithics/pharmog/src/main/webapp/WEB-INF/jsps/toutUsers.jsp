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
<title>UTILISATEURS</title>
</head>
<body>
<h2>Utilisateurs</h2>
<table>
<tr>
<th>Prenom</th>
<th>Nom</th>
<th>Email</th>
<th>Password</th>
<th>Roles</th>

</tr>
<c:forEach  items="${users}" var="user">
<tr>
<td>${user.prenom}</td>
<td>${user.nom}</td>
<td>${user.email}</td>
<td>${user.password}</td>
<td>${user.roles}</td>

<td><a href="supprimerUser?id=${user.id}"><button type="submit">effacer</button></a></td>
<td><a href="ciblerUser?id=${user.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>


</table>
<a href="/creerUser"> Ajouter Utilisateur</a>

</body>
</html>