<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
    background-color: lightgrey;
}

</style>
<title>Ajout d'un chauffeur</title>
</head>
<body>
<fieldset>
    <legend> Ajout d'un chauffeur : </legend>

<f:form action="addChauffeur" modelAttribute="chauffeur"  method="post">
	<table >
	<tr>
	<td> Nom : </td><td><input type="text" name="nom_fonc"/></td>
	</tr>
	<tr>
	<td> Prénom :</td><td> <input type="text" name="prenom_fonc"  /></td>
	</tr>
	<tr>
    <td> Matricule :</td><td><input type="text"  name="matricule"/></td>
    </tr>
    <tr>
    <td> CIN :</td><td> <input type="text" name="cin" /> </td>
    </tr>
    <tr>
    <td> Lieu de naissance :</td><td> <input type="text" name="lieu_naissance" /></td>
    </tr>
    <tr>
    <td> Date de naissance :</td><td> <input type="text" name="date_naissance"  /></td>
    </tr>
    <tr>
    <td>sexe  :</td>
    <td><select size="1" name="sexe">
        <option value ="1">Homme</option>
        <option value ="2">Femme</option>
   </select></td>
    </tr>
    <tr><td>situation familiale : </td> <td> <input type="text" name="situation_familiale"/></td></tr>
    <tr><td>le nombre des enfants : </td><td><input type="text" name="nbr_enfants" /></td></tr>
    <tr><td>Adresse : </td><td> <input type="text" name="adresse"/></td></tr>  
    <tr><td>Numéro de permis : </td> <td><input type="text" name="num_permis"/></td></tr> 
    <tr>
    	<td><input type="submit" value="ajouter"> </td>
	</tr>
	</table>
</f:form>
 </fieldset>


</body>
</html>