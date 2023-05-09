<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
	
<!DOCTYPE html>
<html lang="en" xml:lang="en" >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Daara</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
	
</head>
<body>

<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>

<form:form  action="savedaara" method="post" modelAttribute="daara">
<table>
<tr> 
<td> <form:label for="daara-localisation" path="localisation">Localisation</form:label> </td> 
<td> </td>
<td>
<form:select  path="localisation" cssClass="select-picker">
<form:option value="" label="Choisir Localisation"/>
<form:options items="${localisations}"   itemLabel="adresse" itemValue="id"/>
</form:select>
</td> 
</tr>


<tr>
<td> <form:label path="nom"> Nom </form:label>  </td>
<td> </td>
<td> <form:input type="text" path="nom"/> </td>
</tr>

<tr>
<td> <form:label path="nbreEnfants"> Nombre Enfants </form:label>  </td>
<td> </td>
<td> <form:input type="text" path="nbreEnfants"/> </td>
</tr>

<tr>
<td> <form:label path="nbrePieces"> Nombre Pieces </form:label>  </td>
<td> </td>
<td> <form:input type="text" path="nbrePieces"/> </td>
</tr>

<tr>
<td><form:label path="couvertureMedicale">Couverture Medicale</form:label> </td>
<td> </td>
<td> <form:radiobutton path="couvertureMedicale" label="OUI" value="TRUE"/> </td>
<td> <form:radiobutton path="couvertureMedicale" label="NON" value="FALSE"/> </td>
</tr>
<tr>
<td> </td>
<td><input type="submit" value="sauver"></td>
<td> </td>
<td><input type="reset" value="reset"></td>
</tr>

</table>
	</form:form>
${msg}
<a href="displayDaaras">View All Daaras</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>

</body>
</html>