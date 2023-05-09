<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5 Transitional//EN" "http://www.w3.org/TR/html5/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer Offre</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>	
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
	<form action="enregistrerOffre" method="post">
		<pre>
Duree Mini:<input type="text" name="dureeMini" />
Nom Offre:<input type="text" name="nomOffre" />
Operateur:<select name="operateur">
 <c:forEach items="${allOperateurs}" var="operateur" >
 <option value="${operateur.id}">"${operateur.nom}"</option>
 </c:forEach>
 </select> 
Tarif:<input type="text" name="tarif" />
<input type="submit" value="submit">
</pre>
	</form>
	${msg}
	<a href="afficherAllOffres">Offres Enregistrés</a>
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</body>
</html>