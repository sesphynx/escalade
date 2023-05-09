<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BENEVOLES</title>
</head>
<body>
<h2>Benevoles</h2>
<table>
<tr>
<th>COMMUNE</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
</tr>
<c:forEach  items="${benevoles}" var="benevole">
<tr>
<td>${benevole.commune.id}</td>
<td>${benevole.nom}</td>
<td>${benevole.prenom}</td>
<td>${benevole.email}</td>
<td>${benevole.addresse}</td>
<td><a href="deleteBenevole?id=${benevole.id}"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateBenevole"> AJOUTER  BENEVOLE</a>

</body>
</html>