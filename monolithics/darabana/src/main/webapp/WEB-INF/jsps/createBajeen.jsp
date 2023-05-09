<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CREER BAJEEN</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>

<form:form action="saveBajeen" method="post" modelAttribute="bajeen">
<table>
<tr>
<td> <form:label path="commune" cssClass="label">Commune</form:label></td>
<td>
<form:select path="commune"  cssClass="select-picker">
<form:option value=" " label="Selectionner"></form:option>
<form:options items="${communes}"   itemValue="id" itemLabel="nom" ></form:options>
</form:select>
</td>
</tr>

<tr>
<td><form:label path="nom" cssClass="label">NOM</form:label></td>
<td> <form:input type="text" path="nom" cssClass="input"/></td>
</tr>

<tr>
<td><form:label path="prenom" cssClass="label">PRENOM </form:label></td>
<td><form:input type="text" path="prenom" cssClass="input"/></td>
</tr>

<tr>
<td><form:label path="addresse" cssClass="label">ADDRESSE</form:label></td>
<td> <form:input type="text" path="addresse" cssClass="input"/></td>
</tr>

<tr>
<td><form:label path="email" cssClass="label">EMAIL</form:label></td>
<td> <form:input type="text" path="email" cssClass="input"/></td>
</tr>

</table>




<button type="submit">SAUVER</button>

</pre>
</form:form>
	
	${msg}
<a href="displayBajeens">Voir Bajeens</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>