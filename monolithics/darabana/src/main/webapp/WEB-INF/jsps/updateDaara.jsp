<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EDITER DAARA</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<hr>

<form:form action="saveDaara" method="post" modelAttribute="daara">
<table>

<tr> 
<td> <form:label for="id" path="id">Id:</form:label> </td> 
<td> </td>
<td><form:input type="text" path="id" value="${daara.id}"/></td> 
</tr>

<tr> 
<td> <form:label  path="localisation">Localisation</form:label> </td> 
<td> </td>
<td><form:select  path="localisation" cssClass="select-picker">
<form:option value="" label="Choisir Localisation"/>
<form:options items="${localisations}"   itemLabel="adresse" itemValue="id"/>
</form:select></td> 
</tr>

<tr> 
<td> <form:label  path="nom">Nom:</form:label> </td> 
<td> </td>
<td><form:input type="text" path="id" value="${daara.nom}"/></td> 
</tr>


<tr> 
<td> <form:label  path="nbreEnfants">Nombre Enfants:</form:label> </td> 
<td> </td>
<td><form:input type="text" path="nbreEnfants" value="${daara.nbreEnfants}"/></td> 
</tr>

<tr> 
<td> <form:label  path="nbrePieces">Nombre Pieces</form:label> </td> 
<td> </td>
<td><form:input type="text" path="nbrePieces" value="${daara.nbrePieces}"/></td> 
</tr>

<tr>
<td><form:label path="couvertureMedicale">Couverture Medicale</form:label> </td>
<td> </td>
<td> <form:radiobutton path="couvertureMedicale" label="OUI" value=value="${daara.couvertureMedicale}"/> </td>
<td> <form:radiobutton path="couvertureMedicale" label="NON" value="${daara.couvertureMedicale}"/> </td>
</tr>
<tr>
<td> </td>
<td><form:button type="text"> Sauvegarder</form:button></td>
<td> </td>
<td><form:button type="reset" value="reset"></td>
</tr>

	</table>
</form:form>
${msg}
<a href="displayDaaras">View All Daaras</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>