<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Quartier</title>
</head>
<body>
<form:form action="saveQuartier" method="post" modelAttribute="quartier">
<pre>
Id:<input type="text" name="id" value="${quartier.id}" />
Commune:<form:select  items="${communes}"  path="${commune}">
<form:option value="${commune.id}">"${commune.nom}"</form:option>
</form:select>
Nom:<input type="text" name="name"  value="${quartier.nom}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayQuartiers">View All Quartiers</a>
</body>
</html>