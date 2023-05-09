<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BAJEENS</title>
</head>
<body>
<h2>MedicalActors</h2>
<table>
<tr>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>ADDRESSE</th>
</tr>
<c:forEach  items="${medicalActors}" var="medicalActor">
<tr>
<td>${medicalActor.nom}</td>
<td>${medicalActor.prenom}</td>
<td>${medicalActor.email}</td>
<td>${medicalActor.addresse}</td>
<td><a href="deleteMedicalActor?id=${medicalActor.id}"></a></td>
</tr>
</c:forEach>

</table>
<a href="/showCreateMedicalActor"> Ajouter Acteur Medical</a>

</body>
</html>