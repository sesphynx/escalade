<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PRODUCTEURS</title>
</head>
<body>
<h2>Producteurs</h2>
<table>
<tr>
<th>Name</th>
<th>Description</th>
<th>Disabled</th>
</tr>
<c:forEach  items="${producteurs}" var="producteur">
<tr>
<td>${producteur.name}</td>
<td>${producteur.description}</td>
<td>${producteur.disabled}</td>
<td><a href="deleteProducteur?id=${producteur.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateProducteur?id=${producteur.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/creerProducteur"> Ajouter Producteur</a>

</body>
</html>