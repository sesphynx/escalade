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
<title>PAYS</title>
<%@include file="/WEB-INF/jsps/fragments/header.html"  %>
</head>
<body>
<%@include file="/WEB-INF/jsps/fragments/menuBar.html"  %>
<h2>Pays</h2>
<table>
<tr>
<th>Nom</th>
</tr>
<c:forEach  items="${payss}" var="pays">
<tr>
<td>${pays.nom}</td>
<td><a href="deletePays?id=${pays.id}"><button type="submit">effacer</button></a></td>
<td><a href="showUpdatePays?id=${pays.id}"><button type="submit">editer</button></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreatePays"> Ajouter Pays</a>
<%@include file="/WEB-INF/jsps/fragments/footer.html"  %>
</body>
</html>