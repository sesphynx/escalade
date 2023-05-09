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
<pre>
PRENOM <form:input type="text" path="firstName"/>
NOM <form:input type="text" path="lastName"/>
EMAIL <form:input type="text" path="email"/>
PASSWORD <form:input type="password" path="password"/>
NUMERO TELPHONE <form:input type="text" path="numTel"/>
NUMERO CARTE ELECTEUR <form:input type="text" path="numCarteElecteur"/>
NUMERO IDENTIFICATION NATIONALE <form:input type="text" path="nin"/>
<button type="submit">SAUVER</button>

</pre>
</form:form>
	
	${msg}
<a href="displayUsers">Voir USERS</a>
<hr></hr>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>