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
<title>CREER BENEVOLE</title>
<%@  include file="/WEB-INF/jsps/fragments/header.html" %>	
</head>
<body>
<%@  include file="/WEB-INF/jsps/fragments/menuBar.html" %>

<form:form action="saveBenevole" method="post" modelAttribute="benevole">
<table>
<tr> <td> <form:label path="commune">Commune</form:label> </td> 
<td>:<form:select    path="commune" class="select-picker">
<form:option value=" " label="-Choisir Commune-"/>
<form:options items="${communes}" itemValue="id" itemLabel="nom"/>
</form:select></td> 
</tr>

<tr> <td>  <form:label path="asc" >ASC:</form:label> </td> 
<td><form:select   path="${asc}" cssClass="select-picker">
<form:option value="" label="-Choisir ASC -"/>
<form:options items="${ascs}"  itemLabel="nom" itemValue="id" />
</form:select>
</td>
 </tr>
 <tr> <td>  <form:label path="nom">NOM </form:label> </td> 
 <td><form:input type="text" path="nom"/></td>
  </tr>

<tr> <td>  <form:label path="prenom">PRENOM</form:label> </td> 
<td><form:input type="text" path="prenom"/></td>
 </tr>
 

<tr> <td>  <form:label path="addresse">ADDRESSE </form:label> </td> 
<td><form:input type="text" path="addresse"/></td>
</tr>


<tr> <td>  <form:label path="email">EMAIL </form:label> </td>
 <td><form:input type="text" path="email"/></td> 
</tr>


<tr> <td> 	 </td> 
<td><form:button type="submit" >SAUVER</form:button></td> 
</tr>




</table>
</form:form>

${msg}
<br>
<br>
	<hr></hr>
	
<a href="displayBenevoles">Voir BENEVOLES</a>

<%@  include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>