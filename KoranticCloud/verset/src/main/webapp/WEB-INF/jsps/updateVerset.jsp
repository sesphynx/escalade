<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CREATE SURAT</title>
</head>
<body>

<form action="updateVerset" method="post">
<table>
<tr>   <td> </td>  <td> Verset Id: </td> <td></td> <td><input type="text" name="versetId" value="${verset.versetId}" readonly/></td>   </tr>

<tr>   <td> </td>  <td> Surat Id: </td> <td></td> <td><input type="text" name="suratId" value="${verset.suratId}" readonly/></td>   </tr>
 
<tr>   <td> </td>  <td> ORDRE:  </td> <td></td> <td><input type="text" name="ordre" value="${verset.ordre}"/></td>   </tr>

<tr>   <td> </td>  <td> TOUR: </td> <td></td> <td><input type="text" name="tour" value="${verset.tour}"/></td>   </tr>
  
<tr>   <td> </td>  <td> LIBELLE: </td> <td> </td> <td><input type="text" name="price" value="${verset.libelle}"/></td>   </tr>
  
<tr>   <td> </td>  <td> EXTRACTION: </td> <td></td> <td><input type="text" name="prixTotal" value="${verset.extraction}"/></td>   </tr>
 
<tr>   <td> </td>  <td>  </td> <td></td> <td><input type="submit" value="save"/></td>   </tr>

</table>
</form>

</body>
</html>