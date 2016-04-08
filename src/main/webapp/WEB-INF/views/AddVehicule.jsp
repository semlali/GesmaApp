<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
   ;
}

</style>
<title>Ajout d'une vehicule </title>
</head>
<body>
<fieldset>
    <legend> Ajout d'une vehicule : </legend>

<f:form action="Ajouter" modelAttribute="vehicule"  method="post">
	<table >
	<tr>
	<td> Numéro d'immatriculation : </td><td><input type="text" name="numImmatriculation"/></td>
	</tr>
	<tr>
 <td> La date de mise en service :</td><td> <input type="text" name="DateMiseEnService"  /></td>
	</tr>
	<tr>
    <td> Nombre des années de service :</td><td><input type="text"  name="nbreAnneeService"/></td>
    </tr>
    <tr>
    <td> Le poids total  :</td><td> <input type="text" name="poids_total" /> </td>
    </tr>
    <tr>
    	<td><input type="submit" value="ajouter"> </td>
	</tr>
	</table>
</f:form>
 </fieldset>


</body>
</html>