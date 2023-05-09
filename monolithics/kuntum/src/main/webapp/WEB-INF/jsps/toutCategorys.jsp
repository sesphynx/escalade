<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CATEGORIES</title>
</head>
<body>
<h2>Categories</h2>
<table>
<tr>
<th>Name</th>
<th>Description</th>
<th>Disabled</th>
</tr>
<c:forEach  items="${categorys}" var="category">
<tr>
<td>${category.name}</td>
<td>${category.description}</td>
<td>${category.disabled}</td>
<td><a href="deleteCategory?id=${category.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCategory?id=${category.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/creerCategory"> Ajouter Categorie</a>

</body>
</html>