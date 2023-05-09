<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib  uri="http://www.springframework.org/tags"  prefix="spring"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Find Chambres</title>
</head>
<body>
<spring:url value="/chambre/find" var="formUrl"></spring:url>
<form:form  action="${formUrl }" method="post" modelAttribute="chambre">
<pre>
douche:<form:input path="douche" type="text" name="chambre-douche"/>
Service Etage:<form:input path="serviceEtage" type="text" name="chambre-serviceEtage"/>
Regular Phone Access:<form:input path="regularPhoneAccess" type="text" name="chambre-regularPhoneAccess"/>
TV Access:<form:input path="tvAccess" type="text" name="chambre-tvAccess"/>
WiFi Access:<form:input path="wifiAccess" type="text" name="chambre-wifiAccess"/>
<input type="submit"  value="search">
</pre>
</form:form>
</body>
</html>