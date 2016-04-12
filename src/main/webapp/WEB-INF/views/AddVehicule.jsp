<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css">
<title>Ajout d'une vehicule </title>
</head>
<body>

<f:form action="Ajouter" modelAttribute="vehicule"  method="post">
<fieldset>
    <legend> Ajout d'une vehicule : </legend>
<table>
	<tr>
	<td> Numéro d'immatriculation : </td><td><input type="text" name="numImmatriculation"/></td>
	</tr>
	<tr>
   <td> La date de mise en service :</td><td> <input type="text" name="dateMiseEnService"  /></td>
	</tr>
	<tr>
    <td> Nombre des années de service :</td><td><input type="text"  name="nbreAnneeService"/></td>
    </tr>
    <tr>
    <td> Le poids total  :</td><td> <input type="text" name="poids_total" /> </td>
    </tr>
     
  <tr>
  <td>Roue</td><td><select name="etat_roue"><option id="1">Neuf</option>
  <option id="2">moyen</option>
  <option id="3">mauvais</option>
  </select></td>
  </tr>
  <tr>
 <td>Vitre</td><td><select name="etat_vitre"><option id="1">Neuf</option>
  <option id="2">moyen</option>
  <option id="3">mauvais</option>
  </select></td>
  </tr>
  <tr>
   <td>Siege</td><td><select name="etat_siege"><option id="1">Neuf</option>
  <option id="2">moyen</option>
  <option id="3">mauvais</option>
  </select></td>
  </tr>
  <tr>
   <td>Carosserie</td><td><select name="etat_carosserie"><option id="1">Neuf</option>
  <option id="2">moyen</option>
  <option id="3">mauvais</option>
  </select></td>
  </tr>
  <tr><td>Remarques : </td><td><input type="text" name="remarques"></td></tr>
  <tr><td><input type="submit" value="ajouter"> </td></tr>
</table>
 </fieldset>
 
 </f:form>
</body>
</html>