<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ROLES</title>
</head>
<body>
<h2>Roles</h2>
<table>
<tr>
<th>Nom</th>
</tr>
<c:forEach  items="${roles}" var="role">
<tr>
<td>${role.nom}</td>
<td><a href="deleteRole?id=${role.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateRole?id=${role.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateRole"> Ajoute Role</a>

</body>
</html>