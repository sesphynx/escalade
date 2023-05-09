<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREER USER</title>
<%@include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@include file="/WEB-INF/jsps/fragments/menu.html" %>
<form:form method="POST" commandName="sauvegarderUser">
<table>
    <tr>
        <td>Nom :</td>
        <td><form:input path="firstName" /></td>
    </tr>
    <tr>
        <td>Prénom :</td>
        <td><form:password path="lastName" /></td>
    </tr>
    <tr>
        <td>Email :</td>
        <td><form:password path="lastName" /></td>
    </tr>
    
    <tr>
        <td>Password :</td>
        <td><form:password path="lastName" /></td>
    </tr>
    
    <tr>
        <td>Email :</td>
        <td><form:password path="lastName" /></td>
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
<td><form:input type="text" path="user.addresse.addresseLine1"/></td>
</tr>


<tr>
<td>         </td>
<td><form:input type="text" path="user.addresse.addresseLine2"/></td>
</tr>


<tr>
<td>Ville</td>
<td><form:input type="text" path="user.addresse.ville"/></td>
</tr>


<tr>
<td>Pays </td>
<td><form:input type="text" path="user.addresse.country"/></td>
</tr>
    
    <tr>
        <td colspan="2"><input type="submit" value="Register"></td>
    </tr>
</table>
</form:form>
<%@include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>