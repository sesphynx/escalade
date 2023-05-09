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
<title>CREER PAYS</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>
<hr></hr>
<br></br>

<div id="central">
<form:form action="savePays" method="post" modelAttribute="pays">
<pre>

<tr>
<td>NOM</td>  <td> </td> <td><form:input type="text" path="nom"/></td></tr>
 <br></br>
 <tr><td colspan="2"><input type="submit" value="SAUVER"></td><td></td></tr>


</pre>
</form:form>
	
	${msg}
<a href="displayPayss">Voir PAYS</a>
</div>

<br></br>
<hr></hr>
<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
<hr></hr>
<br></br>
</body>
</html>