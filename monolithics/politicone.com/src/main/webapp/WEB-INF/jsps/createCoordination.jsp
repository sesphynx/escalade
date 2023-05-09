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
<title>CREER COORDINATION</title>
<%@include file="/WEB-INF/jsps/fragments/header.html"  %>
</head>
<body>
<%@include file="/WEB-INF/jsps/fragments/menuBar.html"  %>
<br>
</br>
<form:form action="saveCoordination" method="post" modelAttribute="coordination">
<table>
<tr> 
<td>COMMUNE</td> <td> </td> <td><form:select  path="commune">
<form:option value=" " label="SELECT"/>
<form:options items="${communes}"   itemLabel="nom" itemValue="id"/></form:select></td>
</tr>
<br></br>
<tr> 
<td>NUMERO</td>  <td> </td>  <td><form:input type="text" path="numero"/></td>
</tr>
 <br></br>
<tr> 
<td></td>  <td><button type="submit">SAUVER</button></td>  <td></td>
</tr>
</table>

</form:form>
	
	${msg}
<a href="displayCellules">Voir CELLULES</a>

<br>

</br>
<%@include file="/WEB-INF/jsps/fragments/footer.html"  %>
</body>
</html>