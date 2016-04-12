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

<script >
function change(obj) {


    var selectBox = obj;
    var selected = selectBox.options[selectBox.selectedIndex].value;
    var zone1 = document.getElementById("permis");
    var zone2 = document.getElementById("permis2");
    var zone3 = document.getElementById("cin1");
    var zone4 = document.getElementById("cin2");
    var zone5 = document.getElementById("carte_sejour1");
    var zone6 = document.getElementById("carte_sejour2");
    var zone7 = document.getElementById("dateSortie");


    if(selected === 'chauffeur'){
        zone1.disabled = false;
        zone2.disabled= false;

    }
    else if(selected=='m'){
        zone3.disabled = false;
        zone4.disabled = false;
        zone5.disabled  = true;
        zone6.disabled = true;

    }
    else if(selected=='e'){
    	 zone3.disabled= true;
         zone4.disabled= true;
         zone5.disabled= false;
         zone6.disabled = false;
    	
    }
    else if(selected=='CDI'){
    	
        zone7.disabled = true;

    }
    else if(selected=='CDD'){
    	
        zone7.disabled = false;

    }
    else{
        zone1.disabled = true;
        zone2.disabled = true;

    }
}
</script>
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


<f:form method="POST" action="ajouterSalarie" modelAttribute="salarie">
 <fieldset>
<legend>Données personnelles :</legend>
<table>
    
    <tr>
	
	
	
        <td><label path="matricule">Matricule</label></td>
        <td><input path="matricule" name="matricule" /></td>
        <td><label path="nom">Nom</label></td>
        <td><input path="matricule" /></td>
        <td><label path="nom">Prénom</label></td>
        <td><input path="prenom_fonc"  name="prenom_fonc"/></td>
        <td><label>Nom arabe: </label></td>
        <td><input path="nom_fonc_ara" name="nom_fonc_ara" /></td>
         <td><label >Prénom arabe: </label></td>
         <td><input path="prenom_fonc_ara" name="prenom_fonc_ara" /></td>
         
    </tr>
     
    <tr>       
       
         <td><label path="sexe">Sexe</label></td>
        <td>
        <select name="sexe" id = "sexe">
        <option value="f">Feminin</option>
        <option value="m">Masculin</option>
        </select>
        </td>
        <td><label path="telephone">Telephone</label></td>
        <td><input  path="telephone" name="telephone" /></td>
        <td><label path="email">E-mail</label></td>
        <td><input type="email" path="email"  name="email"/></td>
        <td><label path="date">Date Naissance:</label></td>
        <td><input type="date" path="date" name="date_naissance" /></td>
        <td><label path="lieu">Lieu Naissance</label></td>
        <td><input path="lieu_naissance" name="lieu_naissance" /></td>
        
   </tr>
        
   <tr>
        
        <td><label >Nationalité:</label></td>
        <td> <select name="nationalite" id = "nationalite" onchange="change(this)">
        <option value="m">Marocain(e)</option>
        <option value="e">Etrangère</option>
        </select>
        </td>
        <td><label id="cin1" >CIN</label></td>
        <td><input path="cin" name="cin" id="cin2" /></td>
        <td><label id="carte_sejour1">N° carte séjour:</label></td>
        <td><input path="carte_sejour" name="carte_sejour"  id="carte_sejour2"/></td>
        
        <td><label >Ville</label></td>
        <td><input path="ville" name="ville"/></td>
        <td><label >Adresse</label></td>
        <td><input path="adresse" name="adresse"/></td>
        
     
    </tr>
  <tr>
     
         <td><label >Login</label></td>
        <td><input path="login" name="login"/></td>
        <td><label >Password </label></td>
        <td><input path="pass" name="pass"/></td>
        <td><label >Confirmation de password  </label></td>
        <td><input path="pass" name="pass"/></td>
  </tr>
  
 </table>
 </fieldset>
 
 <fieldset><legend>Données de paie :</legend>
 
 <table>
     <tr>
        <td><label >Situation</label></td>
        <td> <select name="situation_familiale" id = "situation_familiale">
        <option value="v">Veuve</option>
        <option value="m">Marié(e)</option>
       <option value="c">Celibataire</option>
       <option value="d">Divorcé(e)</option>
        
        </select></td>
        <td><label >Nbr Enfants :</label></td>
        <td><input path="nbr_enfants" name="nbr_enfants" /></td>
       
        <td><label path="cnss">N° CNSS : </label></td>
        <td><input path="cnss"  name="cnss"/></td>
        <td><label path="numCimr">N° CIMR : </label></td>
        <td><input path="numCimr"  name="numCimr"/></td>
    </tr>
    <tr>
   
        <td><label path="ppr">N° Mutuelle :</label></td>
        <td><input path="ppr" name="numMutuelle" /></td>
       <td><label path="contrat">Type contrat:</label></td>
        <td>       
         <select name="idTypeContrat" id ="idTypeContrat"  onchange="change(this)">
        <c:forEach items="${listeTypeContrat}" var="c" >
        <option value="${c.idTypeContrat}">
        ${c.nomType}</option>
        </c:forEach>
        </select>
        </td>
        <td><label path="dateEntree">Date Entrée :</label></td>
        <td><input type="date" path="dateEntree"  name="dateEntree"/></td>
        <td><label path="dateSortie">Date Sortie :</label></td>
        <td><input type="date" path="dateSortie"  id="dateSortie"/></td>  
    </tr>
    
     <tr>
          
        <td><label path="fonction">Fonction : </label></td>
		<td>
        <select name="idProfession" id = "fonction" onchange="change(this)" >
        <c:forEach items="${listeProfession}" var="p" >
        <option value="${p.idProfession}">
        ${p.nomProfession}</option>
        </c:forEach>
        </select>
        </td>
        <td>
       <label id="permis"> N° Permis de conduite </label> 
       </td>
       <td> <input name="numero_de_permis" type="text" id="permis2"> </input></td>
     
    </tr>
    
 </table>
 
 </fieldset>
 
  <fieldset>
<legend>Salaire :</legend>
 <table>

    
     <tr>
        <td><label path="id">Categorie du salaire :</label></td>
        <td>
        <select name="categorieSalaire" id = "categorieSalaire">
        <option value="m">Mensuel</option>
        
        </td>
        <td><label path="salaireBase">Salaire de base :</label></td>
        <td><input path="salaireBase" name="salaireBase" /></td>
         <td><label >Taux frais Professionnels:</label></td>
        <td><input path="frais_professionnels" name="frais_professionnels"/></td>
        <td><label path="modeRegelement">Mode réglement:</label></td>
        <td>
        
        <select name="modeRegelement" id = "modeRegelement">
        <option value="v">Virement</option>
        <option value="c">Chèque</option>
        <option value="e">Espèce</option>
        
        </select>
     
        
        </td>
          
    </tr>
    
     <tr>
        <td><label path="banque">Banque :</label></td>
        <td>
        <select name="idbanque" id ="banque" >
        <c:forEach items="${listeBanque}" var="b" >
        <option value="${b.idBanque}">
        ${b.nomBanque}</option>
        </c:forEach>
        </select>
        </td>
        <td><label >Agence :</label></td>
        <td><input path="agenceBancaire" name="agenceBancaire"/></td>
         <td><label >N° de compte:</label></td>
        <td><input path="compteBancaire" name="compteBancaire" /></td>
     </tr>
</table>
 </fieldset>

 <fieldset>
      <legend>Exoneration :</legend>
 <table>

  
    <tr>
         <td><input type= "radio" name="amo" value="amo"/>Exonéré AMO </td>
         <td><input type= "radio" name="cnss" value="cnss"/>Exonéré CNSS </td>
         <td> <input type= "radio" name="ir" value="ir"/>Exonéré IR</td>
           
    </tr>
    
    
     </table>
      
     </fieldset>
     
     <table>
    <tr>
        <td colspan="2">
        <input path="submit" type="submit" value="Valider"/>
        <input path="reset" type="reset" value="Annuler"/>
        
    
        </td>
    </tr>
        </table> 
    
    
     
</f:form>

</center>

</body>
</html>