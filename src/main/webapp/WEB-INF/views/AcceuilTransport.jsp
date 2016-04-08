<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Transport Gesma</title>

  <style type="text/css">
      html, body { height: 100%;  background-color: lightgrey; margin: 0; padding: 0; }
      #map { height: 100%; }
     
    </style>
  <style>
.dropbtn {
    background-color: grey;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    right: 0;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
    background-color: grey;
}
</style>
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
<table align="center">
<tr><td>
<div   id="map" style="height:300px; width:500px; align:center" ></div>
</td>
</tr>
</table>

</body>
</html>