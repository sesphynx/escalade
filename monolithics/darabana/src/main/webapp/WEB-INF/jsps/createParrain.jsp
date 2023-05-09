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
<title>CREER PARRAIN</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>

<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>

<form:form action="saveParrain" method="post"  modelAttribute="parrain">
<table>
<tr>
<td> <form:label path="nom" cssClass="label"> NOM </form:label> </td> 
<td> <form:input type="text" path="nom"  cssClass="input"/>  </td> </tr>

<tr>
 <td> <form:label path="prenom"  cssClass="label">PRENOM</form:label> </td> 
<td><form:input type="text" path="prenom" cssClass="input"/></td> 
</tr> 
<tr>
 <td> <form:label path="addresse" cssClass="label">ADDRESSE</form:label></td> 
<td> <form:input type="text" path="addresse" cssClass="input"/></td> 
</tr>
<tr>
 <td><form:label path="email" cssClass="label">EMAIL</form:label></td> 
<td><form:input type="text" path="email" cssClass="input"/></td>
 </tr>
<tr>
 <td><form:label path="duree" cssClass="label">DUREE</form:label></td> 
<td><form:input type="date" path="duree" cssClass="input"/></td> 
</tr> 
<tr> <td><form:label path="descriptif" cssClass="label">DESCRIPTIF </form:label></td>
 <td><form:input type="text" path="descriptif" cssClass="input"/></td> 
 </tr>
 <tr> 
 <td><form:label path="montant" cssClass="label">MONTANT</form:label> </td>
  <td><form:input type="text" path="montant"  cssClass="input"/></td> 
 </tr>
 
<tr>
 <td><form:label path="" cssClass="label">Type Parrainage</form:label> </td> 
<td><form:input type="text" path="typeParrainage" cssClass="input"/></td>
 </tr>  

<tr><td></td><td><form:button type="submit" cssClass="btn-primary">SAUVER</form:button></td></tr>

</table>
</form:form>
	
	${msg}
<a href="displayParrains">Voir PARRAINS</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
</body>
</html>