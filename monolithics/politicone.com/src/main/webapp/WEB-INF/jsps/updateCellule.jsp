<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Cellule</title>
</head>
<body>
<form:form action="saveCellule" method="post" modelAttribute="cellule">
<pre>
Id:<input type="text" name="id" value="${cellule.id}" />
Quartier:<form:select  items="${communes}"  path="${commune}">
<form:option value="${commune.id}">"${commune.nom}"</form:option>
</form:select>
Numero:<input type="text" name="name"  value="${cellule.numero}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayCellules">View All Cellules</a>
</body>
</html>