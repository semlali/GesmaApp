<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css">
<title>Modification d'une vehicule </title>
</head>
<body>
<fieldset>
    <legend> Modification  d'une vehicule : </legend>

<f:form action="Modifier" modelAttribute="vehicule"  method="POST">
	<table>
	<tr>
	<td> Numéro d'immatriculation : </td><td><input type="text"  value="${vehicule.numImmatriculation}" name="numImmatriculation"/></td>
	</tr>
	<tr>
   <td> La date de mise en service : </td><td><input type="text"  value="${vehicule.dateMiseEnService}"  name="dateMiseEnService" /></td>
	</tr>
	<tr>
    <td> Nombre des années de service : </td><td><input type="text"  value="${vehicule.nbreAnneeService}"  name="nbreAnneeService"/></td>
    </tr>
    <tr>
    <td> Le poids total  :</td><td> <input type="text"  value="${vehicule.poids_total}" name="poids_total" /> </td>
    </tr>
    <tr>
       <td><input type='hidden' id="id" name="id_vehicule" value="${vehicule.id_vehicule}"/></td>
    	<td><input type="submit" value="modifier" class="button"> </td>
	</tr>
	</table>
</f:form>
 </fieldset>


</body>
</html>