<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER PROJET</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>

<link href="/nioun/css/niounCss.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>

>
			<th>Budget</th>
			<th>Devise</th>
			<th>Resume</th>
			<th>seuilDeRentabilite</th>
			<th>uniteTempsRentabilite</th>
			<th>Acquisitions</th>
			<th>Produits</th>

<form:form action="/projet/sauvegarderProjet" method="post">

<div class="form-group row">

<div class="form-group col-md-6" >
<label for="description">Budget</label><INPUT type="text" id="budget" class="form-control" />
</div>

<div class="form-group col-md-6" >
<label for="description">Devise</label><INPUT type="text" id="devise" class="form-control" />
</div>

<div class="form-group col-md-6" >
<label for="description">Resume</label><INPUT type="text" id="resume" class="form-control" />
</div>
<div class="form-group col-md-6" >
<label for="description">seuilDeRentabilite</label><INPUT type="text" id="seuilDeRentabilite" class="form-control" />
</div>
<div class="form-group col-md-6" >
<label for="description">uniteTempsRentabilite</label><INPUT type="text" id="uniTempsRentabilite" class="form-control" />
</div>
</div> 
 
 <div class="form-group row">
  <div class="form-group col-md-4">
<label for="name">Nom</label><INPUT type="text" id="name" class="form-control" />
</div>


<div class="form-group col-md-3">
<label>  </label>
<BUTTON type="submit" class="btn btn-primary"> Enregistrer</BUTTON>
</div>

</div>
</form:form>

<a href="toutProjets">Voir  tous les Projets inscrits:</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>



</body>
</html>