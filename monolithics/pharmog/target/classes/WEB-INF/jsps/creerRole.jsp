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
<title>CREER ROLE</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsps/fragments/menuBar.html"></jsp:include>

<form:form action="sauvegarderRole" method="post" modelAttribute="role">
<pre>

<table class="table table-dark">
<tr>
<td>NOM</td>
<td><form:input type="text" path="name"/></td>
</tr>
 <tr><button type="submit">SAUVER</button></tr>
</table>
</pre>
</form:form>
	
	${msg}
<a href="toutRoles">Voir ROLES</a>
</body>
</html>