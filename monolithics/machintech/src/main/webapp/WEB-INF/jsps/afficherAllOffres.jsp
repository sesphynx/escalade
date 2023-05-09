<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Offres</title>
<%@ include file="/WEB-INF/jsps/fragments/header.html" %>
</head>
<body>
<%@ include file="/WEB-INF/jsps/fragments/menuBar.html" %>
<h2>Offres</h2>
	<table>
		<tr>
			<th>nom offre</th>
			<th>operateur</th>
			<th>duree mini</th>
			<th>tarif</th>
		</tr>
		<tr>
			<c:forEach items="${offres}" var="offre">
				<td>${offre.nomOffre}</td>
				<td>${offre.operateur}</td>
				<td>${offre.dureeMini}</td>
				<td>${offre.tarif}</td>
				<td><a href="editerOffre?offreId=${offre.id}">editer</a></td>
				<td><a href="effacerOffre?offreId=${offre.id}">effacer</a></td>
			</c:forEach>
		</tr>
	</table>

<div id="footer">
<%@ include file="/WEB-INF/jsps/fragments/footer.html" %>
</div>
</body>
</html>