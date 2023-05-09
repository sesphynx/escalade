<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>PARENTS</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PARENTS</title>
</head>
<body>
<h2>Parents</h2>
<table>
<tr>
<th>COMMUNE</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
</tr>
<c:forEach  items="${parents}" var="parent">
<tr>
<td>${parent.commune.id}</td>
<td>${parent.nom}</td>
<td>${parent.prenom}</td>
<td>${parent.email}</td>
<td>${parent.addresse}</td>
<td><a href="deleteParent?id=${parent.id}"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateParent"> Ajouter Parent</a>

</body>
</html>

</body>
</html>