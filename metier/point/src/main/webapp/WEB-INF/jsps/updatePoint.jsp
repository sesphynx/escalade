<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MISE A JOUR POINT </title>
</head>
<body>

<form action="updatePoint" method="post" >
<table>

<tr> <td> POINT ID: </td> <td><input type="text" name="id" value="${point.pointId}" readonly/> </td>    </tr>

<tr> <td> NOM: </td> <td> <input type="text" name="name" value="${point.nom}"/></td>   </tr>

<tr> <td> PRENOM: </td> <td> <input type="text" name="description" value="${point.prenom}"/></td>    </tr>

<tr> <td> EMAIL: </td> <td><input type="text" name="quantit" value="${point.email}"/> </td>    </tr>

<tr> <td> ADDRESSE:  </td> <td><input type="text" name="price" value="${point.addresse}"/> </td>    </tr>

<tr> <td> TELEPHONE: </td> <td><input type="text" name="prixTotal" value="${cmmande.phone}"/> </td> </tr> 

<input type="submit" value="save"/>

</table>
</form>

</body>
</html>