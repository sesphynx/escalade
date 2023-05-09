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
<title>CREER COMMUNICATION</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html"%>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html"%>
<hr></hr>
<br></br>
<form:form action="saveCommunication" method="post" modelAttribute="communication">
<pre>
Entite<form:select  items="${entites}"  path="${entite}">
<form:option value="${entite.id}">"${entite.nom}"</form:option>
</form:select>
DESCRIPTIF <form:input type="text" path="descriptif"/>
LIBELLE<form:input type="text" path="libelle"/>
<button type="submit">SAUVER</button>

</pre>
</form:form>
	
	${msg}
<a href="displayCommunications">Voir COMMUNICATIONS</a>
<hr></hr>
<br></br>
<%@ include file="/WEB-INF/jsps/fragments/footer.html"%>
<br></br>
<hr></hr>
</body>
</html>