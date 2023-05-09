<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>  
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>PROJETS</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<hr>
<br>
<h2>Projets</h2>
	
	<table class="table table-dark">
		<tr>
			<th>Budget</th>
			<th>Devise</th>
			<th>Resume</th>
			<th>seuilDeRentabilite</th>
			<th>uniteTempsRentabilite</th>
			<th>Acquisitions</th>
			<th>Produits</th>
		</tr>

		<c:forEach items="${projets}" var ="projet">
			<tr>
				<td>${projet.budget}</td>
				<td>${projet.devise}</td>
				<td>${projet.resume}</td>
				<td>${projet.seuilDeRentabilite}</td>
				<td>${projet.uniteTempsRentabilite}</td>
				<td><a href="#">Acquisitions</a></td>
				<td><a href="#">Promoteur</a></td>
				<td><a href="ciblerProjet?projetId=${projet.id}">Select</a></td>
			</tr>
		</c:forEach>

	</table>
	
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>

</body>
</html>