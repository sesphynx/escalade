<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Region</title>
</head>
<body>
<form:form action="saveRegion" method="post" modelAttribute="region">
<pre>
Id:<input type="text" name="id" value="${region.id}" />
Pays:<form:select  items="${payss}"  path="${pays}">
<form:option value="${pays.id}">"${pays.nom}"</form:option>
</form:select>
Nom:<input type="text" name="name"  value="${region.nom}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayRegions">View All Regions</a>
</body>
</html>