<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Paie Gesma</title>

<style>
.dropbtn {
    background-color: #4CAF50;
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
    background-color: #3e8e41;
}
</style>
</head>


<body>


<center>
<h2>Gestion de Paie et personnel :</h2>


<div class="dropdown">
  <button class="dropbtn">Banque</button>
  <div class="dropdown-content">
    <a href="formBanque">Ajouter une Banque</a>
    <a href="AfficherBanque">Afficher tout les Banques</a>
    
  </div>
</div>


<div class="dropdown">
  <button class="dropbtn">Fonction</button>
  <div class="dropdown-content">
    <a href="formFonction">Ajouter une Fonction</a>
    <a href="AfficherFonction">Afficher tout les fonctions</a>
  </div>
</div>



<div class="dropdown">
  <button class="dropbtn">Salari�</button>
  <div class="dropdown-content">
    <a href="formSalarie">Ajouter salari�</a>
    <a href="AfficherSalarie">Afficher tout les salari�s</a>
  </div>
</div>


<div class="dropdown">
  <button class="dropbtn">Anciennet�</button>
  <div class="dropdown-content">
    <a href="formAncienete">Modifier les param�tres</a>
    
  </div>
  
  </div>
  
  
<div class="dropdown">
  <button class="dropbtn">Bar�me IGR</button>
  <div class="dropdown-content">
    <a href="formIR">Modifier les param�tres</a>
    
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">Fiche de PAIE</button>
  <div class="dropdown-content">
    <a href="formFichePaie">G�nerer</a>
    
  </div>
</div>


</center>

</body>
</html>