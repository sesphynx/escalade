<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Village</title>
</head>
<body>
<form:form action="saveVillage" method="post" modelAttribute="village">
<pre>
Id:<input type="text" name="id" value="${village.id}" />
CommuneArrond
:<form:select  items="${communeArronds}"  path="${communeArrond}">
<form:option value="${communeArrond.id}">"${communeArrond.nom}"</form:option>
</form:select>
Nom:<input type="text" name="name"  value="${village.nom}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayVillages">View All Villages</a>
</body>
</html>