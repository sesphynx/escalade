<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create CommuneArrond</title>
</head>
<body>
<form:form action="saveCommuneArrond" method="post" modelAttribute="communeArrond">
<pre>
Id:<input type="text" name="id" value="${communeArrond.id}" />
Departement:<form:select  items="${departements}"  path="${departement}">
<form:option value="${departement.id}">"${departement.nom}"</form:option>
</form:select>
Nom:<input type="text" name="nom"  value="${communeArrond.nom}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayCommuneArronds">View All CommuneArronds</a>
</body>
</html>