<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>la liste des véhicules </title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
   <script src="<c:url value="/resources/js/script.js" />"></script>
</head>
<body>
<h2><center>La liste de tous les véhicules de l'établissement :</center></h2><br><br>
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
     <td><a href="ModifierVehicule?id_vehicule=${v.id_vehicule}" class="button" >Modiffier</a> </td>
 <td><a href="SupprimerVehicule?id_vehicule=${v.id_vehicule}" class="button" onclick="return confirm('Are you sure you want to delete?')" >Supprimer</a> </td>
 <td><a href="VerifierEtatVehicule?id_vehicule=${v.id_vehicule}"  class="button">Vérifier son état </a> </td>
 <td><a href="newfile">newpage</a></td>
  </tr>
  <tr>
</c:forEach>
</table>  
<center> <a href="AjouterVehicule" class="button">Ajouter une Véhicule</a> </center>

 
</body>
