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
<title>CREER REGION</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<hr></hr>
<form:form action="saveRegion" method="post" modelAttribute="region">
<pre>

<tr>
<td>Pays</td>  <td> </td> <td><form:select    path="pays">
<form:option value="0" label="selectionner" ></form:option>
<form:options items="${payss}" itemLabel="nom" itemValue="id"></form:options>
</form:select>
</td>
</tr>
<tr><td>NOM </td>  <td> </td> <td><form:input type="text" path="nom"/></td></tr>
<tr><td><button type="submit">SAUVER</button></td></tr>


</pre>
</form:form>
	
	${msg}
<a href="displayRegions">Voir REGIONS</a>
<br></br>
<hr></hr>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>

</body>
</html>