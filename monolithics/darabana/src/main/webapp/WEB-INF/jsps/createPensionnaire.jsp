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
<title>CREER PENSIONNAIRE</title>
<%@include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>

<form:form action="savePensionnaire" method="post" modelAttribute="pensionnaire">
<pre>
<table>
<tr>
<td> <form:label path="daara" cssClass="select-picker">Daara</form:label> </td>
<td>		</td>
<td> <form:select    path="daara" cssClass="select-picker">
<form:option value=" " label="Choisir Daara" />
<form:options items="${daaras}" itemLabel="localisation" itemValue="id"/>
</form:select> </td>
</tr>

<tr>
<td> <form:label path="nom">NOM </form:label> </td>
<td>		</td>
<td><form:input type="text" path="nom"/></td>
</tr>
<tr>
<td> <form:label path="prenom">PRENOM </form:label> </td>
<td>   		</td>
<td><form:input type="text" path="prenom"/></td>
</tr>

</table>
<form:button type="submit" cssClass="btn-primary">SAUVER</form:button>

</pre>
</form:form>
	
	${msg}
<a href="displayPensionnaires">Voir Pensionnaires</a>

<hr></hr>
<%@include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>