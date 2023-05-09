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
<title>CREER CATEGORIE PREPAS</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
	
</head>

<body>
<%@include file="/WEB-INF/jsps/fragments/menuBar.html"%>



<form:form action="sauvegarderCategoryPrepa" method="post" modelAttribute="categoryPrepa">
<h2>CategoryPrepas</h2>
<table class="table">
<tr>
<td>NOM</td>
<td><form:input type="text" path="name" value="${categoryPrepa.name}"/></td>
</tr>
<tr>
<td>Description</td>
<td><form:input type="text" path="description" value="${categoryPrepa.description}"/></td>
</tr>
<tr>
<td>Disabled</td>
<td><form:input type="text" path="disabled" value="${categoryPrepa.disabled}"/></td>
</tr>

<tr>
<td>Prepas</td>
<td>
<form:select path="prepas">
<form:option value="" label="Choisir Plusieurs Prepas"/>
<form:options items=${prepas} itemLabel="name" itemValue="id" multiple="true"/>
</form:select>

</td>
</tr>
<tr>
<td><button type="submit">SAUVER</button></td>
</tr>
</table>
</form:form>
${msg}
<a href="toutCategoryPrepas">Voir PREPA CATEGORYS</a>

<%@include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>