<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer Rappel</title>
</head>
<body>
<form action="enregistrerRappel" method="post">
<pre>

Date Rappel <input type="text" name="dateRappel" />
Etat:GRILL<input type="radio"  name="etat" value="GRILL">
	CLOS<input type="radio"  name="etat" value = "CLOS">
	
<input type="hidden" name="userId"  value= ${"user.Id"} >
<input type="hidden" name="prospectId"  value=${"prospect.Id "}>
<input type="submit" value="creerRappel">
<input type="reset" value="reset">

</pre>
</form>
${msg}
<a href="afficherAllRappels">Rappels Enregistrés</a>
</body>
</html>