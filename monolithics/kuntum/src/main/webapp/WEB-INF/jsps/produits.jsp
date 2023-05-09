<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Produits</title>
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


<link href="/nioun/css/niounCss.css" rel="stylesheet" type="text/css" />

</head>
<body>

<h2>Produits</h2>
	
	<table class="table table-dark">
		<tr>
			<th>Category</th>
			<th>Created On</th>
			<th>Description</th>
			<th>Image</th>
			<th>Disable</th>
			<th>name</th>
			<th>price</th>
			<th>producteur</th>
			<th>sku</th>
		</tr>

		<c:forEach items="${produits}" var ="produit">
			<tr>
				<td >${produit.category.name}</td>
				<td> <img src="data:image/jpeg;base64,${image}" alt="..." width="200" height="200"> </td>
				<td>${produit.createdOn}</td>
				<td>${produit.description}</td>
				<td >${produit.imgUrl}</td>
				<td>${produit.disable}</td>
				<td>${produit.price}</td>
				<td>${produit.producteur}</td>
				<td>${produit.sku}</td>
				<td><a href="showUpdateProduit?produitId=${produit.id}">Select</a></td>
			</tr>
		</c:forEach>

	</table>
	

</body>
</html>