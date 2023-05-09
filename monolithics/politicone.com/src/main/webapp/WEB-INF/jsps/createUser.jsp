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

<form:form action="saveUser" method="post" modelAttribute="user">

<table>
<tr> 
<td>PRENOM</td>  <td> </td> <td><form:input type="text" path="firstName"/></td>
</tr>
<br></br>
<tr> 
<td>NOM</td>  <td> </td>  <td><form:input type="text" path="lastName"/></td>
</tr>
 <br></br>
<tr> 
<td>EMAIL</td>  <td> </td>  <td><form:input type="text" path="email"/></td>
</tr>
<br></br>
<tr> 
<td>PASSWORD</td>  <td> </td>  <td><form:input type="password" path="password"/></td>
</tr>
<br></br>
<tr> 
<td>NUMERO TELPHONE</td>  <td> </td>  <td><form:input type="text" path="numTel"/></td>
</tr>
<br></br>
<tr> 
<td>NUMERO CARTE ELECTEUR </td>  <td> </td>  <td><form:input type="text" path="numCarteElecteur"/></td>
</tr>
<br></br>
<tr> 
<td>NUMERO IDENTIFICATION NATIONALE </td>  <td> </td>  <td><form:input type="text" path="nin"/></td>
</tr>
<br></br>
<tr> 
<td></td>  <td> <input type="submit" value="SAUVER"/> </td>  <td></td>
</tr>
</table>
</form:form>
${msg}
<a href="displayUsers">Voir USERS</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>