<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


    		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER PRODUIT</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>
	<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>
	
	
	<form:form action="/nioun/produit/sauvegarderProduit" method="post"	modelAttribute="produit" enctype="multipart/form-data">
		<div class="form-group row">


			<div class="form-group col-md-6">
				<form:label for="category" cssClass="select-picker">Category</form:label> 
				<form:SELECT
					name="categoryId">
					<form:option   value="" label="Choisir Category" class="form-control" placeholder="categorie"/>
					<form:options  items="${categories}" itemValue="id" itemLabel="name" />
				</form:SELECT>
			</div>

			<div class="form-group col-md-6">
				<LABEL for="createdOn">Created On:</LABEL><input type="date"
					class="form-control" id="createdOn" placeholder="creer le">
			</div>

		</div>
		<div class="custom-file col-md-6">
			<label class="custom-file-label" for="image">Image :</label> <input
				type="multipart/data-file" class="custom-file-input " id="image">
		</div>



		<div class="form-group row">


			<div class="form-group col-md-6">
				<label for="name">Name:</label><INPUT type="text"
					class="form-control" id="name" placeholder="nom produit" />
			</div>

			<div class="form-group col-md-6">
				<label for="price">Prix:</label><INPUT type="text" id="price"
					class="form-control" placeholder="prix" />
			</div>


		</div>

		<div class="form-group row">

			<div class="form-group col-md-4">
				<form:LABEL for="producteur" path="producteur">Producteur</form:LABEL>
				
				<form:select path="producteur" cssClass="select-picker">
				<form:option value="" label="Choisir Producteur" />
				<form:options items="${producteurs}"  itemValue="id" itemLabel="name"  class="form-control"	placeholder="producteur"/>
				</form:select>

			</div>
			
			
			<tr> 
<td> <form:label for="daara-localisation" path="localisation">Localisation</form:label> </td> 
<td> </td>
<td><form:select  path="localisation" cssClass="select-picker">
<form:option value="" label="Choisir Localisation"/>
<form:options items="${localisations}"   itemLabel="adresse" itemValue="id"/>
</form:select></td> 
</tr>

			<div class="form-group col-md-4">
				<LABEL for="sku"> SKU:</LABEL><INPUT type="text" id="sku"
					class="form-control" placeholder="s k u " />
			</div>

		</div>

		<div class="form-group col-md-3">
			<LABEL> </LABEL>
			<button type="submit" class="btn btn-primary ">enregistrer</button>
		</div>

		${message}

		</pre>
	</form:form>

<a href="toutProduits">Voir  tous les Produits disponibles:</a>



</body>
</html>