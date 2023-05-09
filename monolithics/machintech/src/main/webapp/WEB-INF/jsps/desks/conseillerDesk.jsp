<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TRAITEMENT</title>
</head>
<body>

<div  id="menu"  >
<ul> 
<li> CODIFICATION</li>
<li> PROSPECTS </li>
<li> STATS </li>
</ul>
</div>

<div>
<div id="userImageProfile"></div>
<div id="entrepriseLogo"></div>
<div id="userDetailsProfile"></div>
</div>

<div id="leftPane">
<form action="creerRappel" method="post" title="RAPPEL">

<pre>
N° Prospect <input type="text">
Date Rappel<input type="datetime-local">
Etat:GRILL<input type="radio"  name="etat" value="GRILL">
	CLOS<input type="radio"  name="etat" value = "CLOS">

<input type="hidden" name="userId"  value= ${"user.Id"} >
<input type="hidden" name="prospectId"  value=${"prospect.Id "}>
<input type="submit" value="creerRappel">
<input type="reset" value="reset">

</pre>
</form>

</div>

<div id="centerPane">
<div id="topCenterPane"></div>
<div id="bottomCenterPane"></div>
</div>

</body>
</html>