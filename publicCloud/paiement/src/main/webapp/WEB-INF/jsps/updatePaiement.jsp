<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MISE A JOUR PAIEMENT </title>
</head>
<body>

<form action="updatePaiement" method="post" >
<table>

<tr>  <td>   </td> <td> PAIEMENT ID: </td> <td>   </td> <td><input type="text" name="id" value="${paiement.paiementId}" readonly/> </td>    </tr>

<tr>  <td>   </td> <td> CLIENT ID: </td>  <td>   </td> <td><input type="text" name="id" value="${paiement.clientId}" readonly/> </td>    </tr>

<tr>  <td>   </td> <td> NOM: </td>  <td>   </td> <td> <input type="text" name="name" value="${paiement.firstName}"/></td>   </tr>

<tr>  <td>   </td><td> PRENOM: </td>   <td>   </td>  <td> <input type="text" name="description" value="${paiement.lastName}"/></td>    </tr>

<tr> <td>   </td> <td> EMAIL: </td>     <td>   </td> <td><input type="text" name="quantit" value="${paiement.email}"/> </td>    </tr>

<tr> <td>   </td> <td> ADDRESSE:  </td>  <td>   </td> <td><input type="text" name="price" value="${paiement.addresse}"/> </td>    </tr>

<tr> <td>   </td> <td> TELEPHONE: </td>  <td>   </td> <td><input type="text" name="prixTotal" value="${paiement.phone}"/> </td> </tr> 

<tr> <td>   </td> <td> COMMANDE ID: </td>  <td>   </td> <td><input type="text" name="id" value="${paiement.commandeId}" readonly/> </td>    </tr>
   
<tr> <td>   </td> <td> NAME:    </td>   <td>   </td>   <td><input type="text" name="name" value="${paiement.name}"/></td></tr>

<tr> <td>   </td> <td> DESCRIPTION:</td>  <td>   </td> <td><input type="text" name="description" value="${paiement.description}"/></td></tr> 

<tr> <td>   </td> <td> QUANTITE: </td>  <td>   </td>   <td><input type="text" name="quantite" value="${paiement.quantite}"/></td></tr>

<tr> <td>   </td> <td> PRICE:    </td>  <td>   </td>   <td><input type="text" name="price" value="${paiement.price}"/></td></tr> 

<tr> <td>   </td> <td> TOTAL:    </td>   <td>   </td>  <td><input type="text" name="prixTotal" value="${paiement.prixTotal}"/></td></tr> 

<tr> <td>   </td> <td> ENVIRONMENT:</td>  <td>   </td> <td><input type="text" name="prixTotal" value="${paiement.env}"/></td></tr> 

<tr> <td>   </td>  <td>   </td>   <td>   </td>    <td> <input type="submit" value="save"/>  </td></tr>

</table>
</form>

</body>
</html>