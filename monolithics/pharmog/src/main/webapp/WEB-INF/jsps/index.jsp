<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        		
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>

<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pharmog Acceuil</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<%@ include file="/WEB-INF/jsps/fragments/menuConnexion.html" %><a href="<c:url value="/logout" />">Logout</a>

</body>
</html>