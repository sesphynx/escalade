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
<title>CREER  PRODUCTEUR</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html"%>	
</head>

<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>



<form:form action="sauvegarderProducteur" method="post" modelAttribute="producteur">
<h2>Producteurs</h2>
<table class="table">
<tr>
<td>NOM</td>
<td><form:input type="text" path="name" /></td>
</tr>
<tr>
<td>Description</td>
<td><form:input type="text" path="description" /></td>
</tr>
<tr>
<td>Disabled</td>
<td><form:radiobutton  path="disabled" value="Dispo"/>Disponible 	<form:radiobutton  path="disabled" value="Indispo"/>InDisponible</td>
</tr>

<tr>
<td>Produits</td>
<td>
</td>
</tr>
<tr>
<td><button type="submit">SAUVER</button></td>
</tr>
</table>
</form:form>
${msg}
<a href="toutProducteurs">Voir PRODUCTEURS</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>