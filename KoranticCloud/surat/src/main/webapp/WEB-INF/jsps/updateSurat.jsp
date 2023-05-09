<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>METTRE SURAT A JOUR </title>
</head>
<body>
<form action="updateSurat" method="post">
<table>

<tr>   <td> </td>  <td> Surat Id: </td> <td></td> <td><input type="text" name="id" value="${surat.suratId}" readonly/></td>   </tr>
 
<tr>   <td> </td>  <td> ORDRE:  </td> <td></td> <td><input type="text" name="ordre" value="${surat.ordre}"/></td>   </tr>

<tr>   <td> </td>  <td> TOUR: </td> <td></td> <td><input type="text" name="tour" value="${surat.tour}"/></td>   </tr>
   
<tr>   <td> </td>  <td>  </td> <td></td> <td><input type="submit" value="save"/></td>   </tr>

</table>
</form>

</body>
</html>