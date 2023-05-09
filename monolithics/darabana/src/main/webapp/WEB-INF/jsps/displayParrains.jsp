<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PARRAINS</title>
</head>
<body>
<h2>Parrains</h2>
<table>
<tr>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
</tr>
<c:forEach  items="${parrains}" var="parrain">
<tr>
<td>${parrain.nom}</td>
<td>${parrain.prenom}</td>
<td>${parrain.email}</td>
<td>${parrain.addresse}</td>
<td><a href="deleteParrain?id=${parrain.id}"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateParrain"> Add Parrain</a>

</body>
</html>