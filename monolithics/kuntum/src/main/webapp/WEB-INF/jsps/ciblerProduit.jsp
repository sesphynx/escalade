<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER PRODUIT</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
	
</head>

<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>



<form:form action="sauvegarderProduit" method="post" modelAttribute="produit">
<pre>

<h2>Produits</h2>
<table class="table table-dark">
<tr>
<td>
<form:select  items="categorys"  path="category" label="Category">
<form:option value="${category.id}">${category.name}</form:option>
</form:select>
</td>
</tr>

<tr>
<td>NOM</td>
<td><form:input type="text" path="name" value="${produit.name}"/></td>
</tr>
<tr>
<td>Description</td>
<td><form:input type="text" path="description" value="${produit.description}"/></td>
</tr>
<tr>
<td>Disabled</td>
<td><form:input type="text" path="country" value="${produit.disabled}"/></td>
</tr>

<tr>
<td>Cree le </td>
<td><form:input type="text" path="createdOn" value="${produit.createdOn}" /></td>
</tr>
<tr>
<td>Prix</td>
<td><form:input type="text" path="price"  value="${produit.price}"/></td>
</tr>
<tr>
<td>Image Produit</td>
<td><form:input type="text" path="imgUrl" value="${produit.imgUrl}" /></td>
</tr>

<tr>
<td>Producteur</td>
<td>
<form:select  path="producteur"  class = "select-picker">
<form:option value=" " label="Choisir Producteur"></form:option>
<form:options items="producteurs" itemLabel="name" itemValue="id" />
</form:select>
</td>
</tr>

<tr>
<td><button type="submit">SAUVER</button></td>
</tr>
</table>
</pre>
</form:form>
${msg}
<a href="toutProduits">Voir PRODUITS</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>