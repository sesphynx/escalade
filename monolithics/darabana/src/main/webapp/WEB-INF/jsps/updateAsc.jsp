<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer Asc</title>
</head>
<body>
<form action="saveAsc" method="post">
<pre>
Id:<input type="text" name="id" value="${asc.id}"/>
Commune:<form:select  items="${communes}"  path="${commune}">
<form:option value="${commune.id}">"${commune.nom}"</form:option>
</form:select>
Nom:<input type="text" name="name"  value="${asc.name}"/>
Type Parrainage<input type="text" name="name"  value="${asc.typeParrainage}"/>
	<input type="text" value="save">
	</pre>
</form>
${msg}
<a href="displayAscs">View All Ascs</a>
</body>
</html>