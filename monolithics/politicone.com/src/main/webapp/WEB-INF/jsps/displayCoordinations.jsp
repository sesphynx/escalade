<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>COORDINATIONS</title>
</head>
<body>
<h2>Coordinations</h2>
<table>
<tr>
<th>Commune</th>
<th>Numero</th>
</tr>
<c:forEach  items="${coordinations}" var="coordination">
<tr>
<td>${coordination.commune}</td>
<td>${coordination.numero}</td>
<td><a href="deleteCoordination?id=${coordination.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCoordination?id=${coordination.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateCoordination"> Ajoute Coordination</a>

</body>
</html>