<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>la liste des vehicules </title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>
<h2><center>La liste de tous les vehicules de l'établissement :</center></h2><br><br>
<table> 
  <tr>
    <th>Id</th>
    <th>Numéro d'immatriculation</th>
    <th>Date de mise en service</th>
    <th>Poids total </th>
     <th>Nombre d'années de service </th>
  </tr>

<c:forEach  items="${vehicules}" var="v">
  <tr>
  <td>${v.id_vehicule }</td>
    <td>${v.numImmatriculation}</td>
    <td><fmt:formatDate value="${v.dateMiseEnService}" pattern="yyyy-MM-dd" /> </td>
    <td>${v.poids_total}</td>
    <td>${v.nbreAnneeService}</td> 
     <td><a href="ModifierVehicule" class="button">Modiffier</a> </td>
 <td><a href="SupprimerVehiculet" class="button">Supprimer</a> </td>
  </tr>
  <tr>
</c:forEach>

</table>  
<center> <a href="AjouterVehicule" class="button">Ajouter une Vehicule</a> 
<a href="VerifierEtat" class="button">Vérifier l'état d'une Vehicule</a> </center>
</body>
</html>