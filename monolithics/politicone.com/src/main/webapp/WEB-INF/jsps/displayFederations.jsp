<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FEDERATIONS</title>
</head>
<body>
<h2>Federations</h2>
<table>
<tr>
<th>Nom</th>
<th>Numero</th>
</tr>
<c:forEach  items="${federations}" var="federation">
<tr>
<td>${federation.nom}</td>
<td>${federation.numero}</td>
<td><a href="deleteFederation?id=${federation.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateFederation?id=${federation.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateFederation"> Ajoute Federation</a>

</body>
</html>