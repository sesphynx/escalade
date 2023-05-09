<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Offre</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>	
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
	<form:form action="enregistrerOffre" method="post" 
	modelAttribute="offre">
		<br>
<table>		
<tr>   
<td>Duree Mini:</td><td> </td><td><form:input type="text" path="dureeMini" /></td>
</tr>
<tr>
<td>Nom Offre:</td> <td> </td> <td><form:input type="text" path="nomOffre" /></td>
</tr>
<tr>
<td>Operateur:</td> <td> </td> <td><form:select path="operateur">
 <form:option value="-" label="Choisir Operateur"></form:option>
 <form:options items="${allOperateurs}" itemLabel="nom" itemValue="id"></form:options>
 </form:select> </td>
</tr>

<tr>
<td>Tarif:</td><td></td><td><from:input type="text" path="tarif" /></td>
</tr>
<tr>
<td></td><td><form:input type="submit" value="submit"/></td>
</tr>
<br>
	</form:form>
	${msg}
	</table>
	<a href="afficherAllOffres">Offres Enregistrés</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>