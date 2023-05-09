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
<title>Categorys</title>


</head>
<body>

<h2>Categories</h2>
	
	<table class="table table-dark">
		<tr>
			<th>DisplayOrder</th>
			<th>Description</th>
			<th>Disabled</th>
			<th>name</th>
			<th>Produits</th>
		</tr>

		<c:forEach items="${categories}" var ="category">
			<tr>
				
				<td>${category.displayOrder}</td>
				<td>${category.description}</td>
				<td>${category.disabled}</td>
				<td>${category.name}</td>
				<td><a href="#">Produits</a></td>
				<td><a href="showUpdateCategory?categoryId=${category.id}">Select</a></td>
			</tr>
		</c:forEach>

	</table>
	

</body>
</html>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       