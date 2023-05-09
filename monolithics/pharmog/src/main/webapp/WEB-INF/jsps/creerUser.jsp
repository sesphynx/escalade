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
<title>CREER USER</title>

<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
	
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>

<form:form action="sauvegarderUser" method="post" modelAttribute="user">
<pre>
<table class="table table-dark">
<tr>
<td>PRENOM</td>
<td><form:input type="text" path="firstName"/></td>
</tr>
 
<tr>
<td>NOM </td>
<td><form:input type="text" path="lastName"/></td>
</tr>

<tr>
<td>EMAIL </td>
<td><form:input type="text" path="email"/></td>
</tr>

<tr>
<td>PASSWORD </td>
<td><form:input type="password" path="password"/></td>
</tr>

<tr>
<td>TELEPHONE </td>
<td><form:input type="text" path="telephone"/></td>
</tr>

<tr>
        <td>Genre :</td>
        <td>
            <form:radiobutton path="genre" value="M" label="M" /> 
            <form:radiobutton path="genre" value="F" label="F" />
        </td>
    </tr>
    
    
<tr>
<td>Addresse </td>
<td><form:input type="text" path="addresse.addresseLine1"/></td>
</tr>


<tr>
<td>         </td>
<td><form:input type="text" path="addresse.addresseLine2"/></td>
</tr>


<tr>
<td>Ville</td>
<td><form:input type="text" path="addresse.ville"/></td>
</tr>


<tr>
<td>Pays </td>
<td><form:input type="text" path="addresse.country"/></td>
</tr>
    
    <tr>
        <td colspan="2"><input type="submit" value="S'INSCRIRE"></td>
    </tr>


</table>


</pre>
</form:form>
	
	${msg}
<a href="toutUsers">Voir USERS</a>

<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>