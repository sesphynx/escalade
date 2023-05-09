<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html >
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER CATEGORIE</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
 
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<form action="/nioun/category/sauvegarderCategory" method="post">


<div class="form-group row"></div>
<div class="form-group col-md-6">
<label for="description">Description:</label><INPUT type="text" id="description" class="form-control" />
</div>
<div class="form-group col-md-6">
    <label for="disabled">Disabled</label>
    <select class="form-control" id="disabled">
      <option>OUI</option>
      <option>NON</option>
    </select>
  </div>
</div>  

<DIV class="form-group row">
  <div class="form-group col-md-4">
<label for="name">Nom</label>
<INPUT type="text" id="name" class="form-control" />
</div>


<BUTTON type="submit" class="btn btn-primary"> Enregistrer</BUTTON>
</div>
</div>
</form>
<br>
 <a href="toutCategorys">Voir  toutes les Catégories inscrits:</a>
 


<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>