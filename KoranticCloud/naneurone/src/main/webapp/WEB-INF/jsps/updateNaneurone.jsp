<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MISE A JOUR NANEURONE</title>
</head>
<body>

<form action="updateNaneurone" method="post">
<table>

<tr>   <td> </td>  <td> Naneurone Id: </td> <td></td> <td><input type="text" name="naneuroneId" value="${naneurone.naneuroneId}" readonly/></td>   </tr>

<tr>   <td> </td>  <td> Verset Id: </td> <td></td> <td><input type="text" name="naneuroneId" value="${naneurone.naneuroneId}" readonly/></td>   </tr>

<tr>   <td> </td>  <td> Surat Id: </td> <td></td> <td><input type="text" name="suratId" value="${naneurone.suratId}" readonly/></td>   </tr>
 
<tr>   <td> </td>  <td> ORDRE:  </td> <td></td> <td><input type="text" name="ordre" value="${naneurone.ordre}"/></td>   </tr>

<tr>   <td> </td>  <td> TOUR: </td> <td></td> <td><input type="text" name="tour" value="${naneurone.tour}"/></td>   </tr>
  
<tr>   <td> </td>  <td> LIBELLE: </td> <td> </td> <td><input type="text" name="price" value="${naneurone.libelle}"/></td>   </tr>
  
<tr>   <td> </td>  <td> EXTRACTION: </td> <td></td> <td><input type="text" name="prixTotal" value="${naneurone.extraction}"/></td>   </tr>

<tr>   <td> </td>  <td> Valeur: </td> <td></td> <td><input type="text" name="naneuroneId" value="${naneurone.valeur}" readonly/></td>   </tr> 

<tr>   <td> </td>  <td>  </td> <td></td> <td><input type="submit" value="save"/></td>   </tr>

</table>
</form>

</body>
</html>