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
<title>CREER CATEGORIE PRODUITS</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
	
</head>

<body>
<%@include file="/WEB-INF/jsps/fragments/menuBar.html"%>



<form:form action="sauvegarderCategory" method="post" modelAttribute="category">
<h2>Categorys</h2>
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
<td><form:radiobuttons   path="disabled" items="${listDisabledOptions}" /></td>
</tr>

<tr>
<td>Produits</td>

</tr>
<tr>
<td><button type="submit">SAUVER</button></td>
</tr>
</table>
</form:form>
${msg}
<a href="toutCategorys">Voir CATEGORYS</a>

<%@include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>