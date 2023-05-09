<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>INSERER POINT</title>
</head>
<body>

<form:form action="savePoint" method="post" modelAttribute="point">
<table>

<tr> <td> </td>   <td>ID POINT:</td> <td> </td> <td><form:input type="text" path="pointId"/></td></tr> 

<tr>  <td> </td> <td>ADDRESSE : </td>  <td> </td> <td><form:input type="number" path="addresse"/></td></tr>

<tr>  <td> </td> <td>TELEPHONE: </td>  <td> </td>  <td><form:input type="number" path="phone"/></td></tr>

<tr><td></td> <td>  <td> </td>  <td> </td> <input type="submit" value="save"/></td></tr>

</table>
</form:form>
${msg}

<a href="displayPoints">AFFICHER LES POINTS</a>

</body>
</html>