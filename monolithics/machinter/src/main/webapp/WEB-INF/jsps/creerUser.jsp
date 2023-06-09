<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Créer User</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
</head>
<body>
	<form:form action="enregistrerUser" method="post" command="User">
		<pre>
Nom:<form:input type="text" path="nom" />
Prenom:<form:input type="text" path="prenom" />
email:<form:input type="text" path="email" />
Addresse:<form:input type="text" path="addresse" />
Numero Tel:<form:input type="text" path="numeroTel" />
Password:<form:input type="password" path="password"
				placeholder="password" />
CONFIRMPASS <form:input type="password" path="confirmPassword"
				placeholder="confirmPassword" />
ROLE
MANAGER <form:input type="radio" path="role" value="MANAGER" />
SUPERVISEUR <form:input type="radio" path="role" value="SUPERVISEUR" />
CONSEILLER <form:input type="radio" path="role" value="CONSEILLER" />
	 
	 Groupe:<form:select path="groupe" >
 <c:forEach items="${allGroupes}" var="groupe">
 <option value="${groupe.id}">${groupe.nom}</option>
 </c:forEach>
  </form:select>
  
<form:input type="submit" value="submit" /> 
		</pre>
	</form:form>
	${msg}
	<a href="afficherAllUsers">Utilisateurs Enregistrés</a>
</body>
</html>