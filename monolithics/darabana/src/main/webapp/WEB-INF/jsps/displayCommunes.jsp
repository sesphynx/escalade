<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>COMMUNES </title>
</head>
<body>
<h2>Communes</h2>
<table>
<tr>
<th>Nom</th>
<c:forEach  items="${communes}" var="commune">
<tr>
<td>${commune.nom}</td>
<td><a href="deleteCommune?id=${commune.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdateCommune?id=${commune.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>

<a href="/showCreateCommune"> Ajouter Commune</a>

</body>
</html>