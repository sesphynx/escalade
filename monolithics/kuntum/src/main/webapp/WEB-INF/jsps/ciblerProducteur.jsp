<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER PRODUCTEUR</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
	
</head>

<body>
<jsp:include page="/WEB-INF/jsps/fragments/menuBar.html"></jsp:include>



<form:form action="sauvegarderProducteur" method="post" modelAttribute="producteur">
<pre>

<h2>Producteurs</h2>
<table class="table table-dark">
<tr>
<td>NOM</td>
<td><form:input type="text" path="name" value="${producteur.name}"/></td>
</tr>
<tr>
<td>Description</td>
<td><form:input type="text" path="description" value="${producteur.description}"/></td>
</tr>
<tr>
<td>Disabled</td>
<td><form:input type="text" path="country" value="${producteur.disabled}"/></td>
</tr>

<tr>
<td>Produits</td>
<td>
<form:checkboxes items="produits" path="produit" >
<form:option value="produit.id">"${produit.name}"</form:option>
</form:checkboxes>

<form:input type="text" path="city" value="${producteur.produits}"/>
</td>
</tr>

<tr>
<td><button type="submit">SAUVER</button></td>
</tr>
</table>



</pre>
</form:form>
	
	${msg}
<a href="toutProducteurs">Voir PRODUCTEURS</a>
</body>
</html>