<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title>Transport Gesma</title>
<script type="text/javascript">
var map;
function initMap() {
  map = new google.maps.Map(document.getElementById('map'), {
    center: {lat: 31.6341600, lng: -7.9999400},
    zoom: 8
  });
}
</script>
<script async defer
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBuIu5Uthbf2UIRJ027BTaNIPgcgbmWwcQ&callback=initMap">
</script>
</head>
<body> 
<table align="center">
<tr>
<td>
<div class="dropdown" >
  <button class="dropbtn">Gestion des chauffeurs</button>
  <div class="dropdown-content" style="left:0;">
    <a href="showChauffeurs">voir tous les chauffeurs</a>
    <a href="searchForADriver">chercher chauffeur</a>
  </div>
</div>
</td>
<td>
<div class="dropdown" >
  <button class="dropbtn">Gestion des etudiants</button>
  <div class="dropdown-content" style="left:0;">
    <a href="#">Ajouter etudiant</a>
    <a href="#">Modifier etudiant</a>
    <a href="#">Chercher etudiant</a>
  </div>
</div>
</td>
<td>
<div class="dropdown" >
  <button class="dropbtn">Gestion des vehicules</button>
  <div class="dropdown-content" style="left:0;">
    <a href="GestionVehicules">afficher tous les vehicules</a>
    <a href="">Vérifier l'état une vehicule</a>
  </div>
</div>
</td>
<td>
<div class="dropdown" >
  <button class="dropbtn">Gestion des routes</button>
  <div class="dropdown-content" style="left:0;">
    <a href="#">Ajouter route</a>
    <a href="#">Modifier route</a>
    <a href="#">Chercher route</a>
  </div>
</div>
</td>
<td>
<div class="dropdown" >
  <button class="dropbtn">Gestion des arrets</button>
  <div class="dropdown-content" style="left:0;">
    <a href="#">Ajouter arret</a>
    <a href="#">Modifier arret</a>
    <a href="#">Chercher arret</a>
  </div>
</div>
</td>
<td>
<div class="dropdown" >
  <button class="dropbtn">Déconnexion</button>
  <div class="dropdown-content" style="left:0;">
    <a href="#">se déconnecter</a>
    </div>
    </div>
</tr>
</table>
<br><br><br>
<table>
<tr><td>
<div   id="map" style="height:300px; width:500px; align:center" ></div>
</td>
</tr>
</table>

</body>
</html>