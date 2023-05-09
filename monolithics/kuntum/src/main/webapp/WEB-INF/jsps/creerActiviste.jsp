<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Activiste</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>


<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>

	<div id="inscription">
	<p> Inscrivez vous pour la constitution du "FORT NOMBRE " à même de soulever des montagnes , afin de mettre
	les choses à l'endroit </p>
	
	<form action="/nioun/activiste/sauvegarderActiviste" method="post" modelAttribute="activiste">
	<div clas ="form-group row">
<div class="form-group col-md-4">
<LABEL for="nom">Nom</LABEL>
<input type="text" class="form-control" id="nom" placeholder=" nom">
</div> 

<div class="form-group col-md-4">
<LABEL for="prenom">Prenom</LABEL>
<input type="text" class="form-control" id="prenom"
						placeholder=" prenom">
</div> 

</div>


<div clas ="form-group row">

<div class="form-group col-md-4">
<LABEL for="addresse">Addresse</LABEL>
<input type="text" class="form-control" id="addresse"
						placeholder=" addresse">
</div>
 
<div class=" form-group col-md-4">
<label for="mail">Email:</label> 
<input type="email" id="mail" class="form-control" placeholder="email ">
</div>

</diV>


<div clas ="form-group row">


<div class="form-group col-md-4">
<label for="numTel">Numero:</label>
<input type="number" id="numtel" class="form-control"
						placeholder="numero telephone" />
</div>
  
  <div class="form-group col-md-4">
    <label for="organisation">Organisation</label>
    <select class="form-control" id="organisation">
      <option>Y' en a Marre</option>
      <option>FRAPP</option>
      <option>Aar Lii Nu Book</option>
      <option>No Lank</option>
      <option>Gilets Rouges</option>
      <option>Non Aligné</option>
    </select>
  </div>
  
 <div class="form-group col-md-4">
 <label>  </label>
<button type="submit" class="btn btn-primary">SAUVER</button>
</div>

</div>

</form>
		${msg} <a href="listeActiviste">Voir la liste des Activistes</a>
	</div>
	


<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>	
</body>
</html>