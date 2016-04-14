<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <button class="dropbtn">Salarié</button>
  <div class="dropdown-content">
    <a href="formSalarie">Ajouter salarié</a>
    <a href="AfficherSalarie">Afficher tout les salariés</a>
  </div>
</div>


<div class="dropdown">
  <button class="dropbtn">Ancienneté</button>
  <div class="dropdown-content">
    <a href="formAncienete">Modifier les paramètres</a>
    
  </div>
  </div>
  
  
<div class="dropdown">
  <button class="dropbtn">Barème IGR</button>
  <div class="dropdown-content">
    <a href="formIR">Modifier les paramètres</a>
    
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">Fiche de PAIE</button>
  <div class="dropdown-content">
    <a href="formFichePaie">Génerer</a>
    
  </div>
</div>


     <fieldset>
    <legend>Fiche de Paie :</legend>

<f:form action="calculerFichePaie" method="GET">
  
  <table>
  <tr> 
  <td> <label>Selectionner un employé:  </label></td>
  <td> 
  <select name="salarie" id ="salarie" >
        <c:forEach items="${listeSalaries}" var="s" >
        <option value="${s.n_fonc}">
        ${s.nom_fonc} ${s.prenom_fonc}
        </option>
        </c:forEach>
  </select>
  </td>
  <td>
        <input path="submit" type="submit" value="Calculer"/>
 </td>
  </tr>
  
  </table>
 
<table border="" width="100%">

        <tr> 
        <td ROWSPAN=2 > <label path="debutTranche" >Rubriques  </label></td>
        <td colspan=2> <label  path="debutTranche" >Part salariale   </label></td>
        <td> <label path="debutTranche" >Part Patronales   </label></td>
        
        </tr>
        <tr> 
        <td> <label path="debutTranche" >Gains   </label></td>
        <td> <label path="debutTranche" >Retenues  </label></td>
        <td> <label path="debutTranche" >Montant  </label></td>
        
        </tr>
        
        <tr>
        
        <td><label path="debutTranche" >Salaire de base   </label></td>
        <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        
        
        </tr>
         <tr>
         
         <td><label path="debutTranche"> Primes et indemnietés  </label></td>
        <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
         
         </tr>
         <tr>
         
          <td><label path="debutTranche" >CNSS  </label></td>
        <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        </tr>
         <tr>
         
          <td><label path="debutTranche" >AMO  </label></td>
        <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        </tr>
        
         <tr>
         
          <td><label path="debutTranche" >CIMR   </label></td>
        <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        </tr>

         <tr>
          <td><label path="debutTranche" >IR   </label></td>
         <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
         </tr>
        
        <tr>
          
          <td><label path="debutTranche" >Mutuelle   </label></td>
        <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        </tr>
         <tr>
          
          <td><label path="debutTranche" >Taux   </label></td>
         <td> <label path="debutTranche" >--   </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        <td> <label path="debutTranche" >--  </label></td>
        </tr>
         <tr>
          
        <td><label path="debutTranche" >Salaire Net   </label></td>
        <td colspan=2> <label path="debutTranche" > --  </label></td>
       
        </tr>
</table>
</f:form>

</fieldset>

</center>

</body>
</html>