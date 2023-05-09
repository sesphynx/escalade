<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edite Commission</title>
</head>
<body>
<form:form action="saveCommission" method="post" modelAttribute="commission">
<pre>
Id:<input type="text" name="id" value="${commission.id}" />
Region
:<form:select  items="${regions}"  path="${region}">
<form:option value="${region.id}">"${region.nom}"</form:option>
</form:select>
Numero:<input type="text" name="name"  value="${commission.numero}"/>
	<input type="text" value="save">
	</pre>
</form:form>
${msg}
<a href="displayCommissions">View All Commissions</a>
</body>
</html>