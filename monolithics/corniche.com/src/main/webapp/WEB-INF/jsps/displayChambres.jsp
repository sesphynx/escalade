<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chambres</title>
</head>
<body>
	<h2>Chambres</h2>
	<table>
		<tr>
			<th>Douche</th>
			<th>Service Etage</th>
			<th>Tv Access</th>
			<th>Wifi Access</th>
			<th>Regular Phone Access</th>
		</tr>

		<c:forEach items=${"chambres"} value="chambre">
			<tr>
				<td>${"chambre.douche"}</td>
				<td>${"chambre.serviceEtage"}</td>
				<td>${"chambre.tvAccess"}</td>
				<td>${"chambre.wifiAccess"}</td>
				<td>${"chambre.regularPhoneAccess"}</td>
				<td><a href="showCompleteReservation?chambreId=${chambre.id}">Select</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>