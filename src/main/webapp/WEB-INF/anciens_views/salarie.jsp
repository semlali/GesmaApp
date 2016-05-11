<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Gesma</title>

<script type="text/javascript" >

function changeChauffeurProfesseur(obj) {
	var selectBox = obj;
    var selected = selectBox.options[selectBox.selectedIndex].value;
    var zone1 = document.getElementById("permis");
    var zone2 = document.getElementById("permis2");
    var zone3 = document.getElementById("echel1");
    var zone4 = document.getElementById("echel2");
    
    if(selected == '3'){
   	 zone1.disabled = false;
   	 zone2.disabled = false;
   	 zone3.disabled = true;
     zone4.disabled = true;
   }
    else if(selected == '4'){
       zone3.disabled = false;
       zone4.disabled = false;
       zone1.disabled = true;
       zone2.disabled = true;
   }
   else {
	   
	   zone3.disabled = true;
       zone4.disabled = true;
       zone1.disabled = true;
       zone2.disabled = true;
   }
}
function changeContrat(obj) {
	var selectBox = obj;
    var selected = selectBox.options[selectBox.selectedIndex].value;
    var zone7 = document.getElementById("dateSortie");
    
    if(selected == '1'){
        zone7.disabled = false;
        
    }
    if(selected == '2'){
        zone7.disabled = true;
        
    }
}

function changeNationalite(obj) {


    var selectBox = obj;
    var selected = selectBox.options[selectBox.selectedIndex].value;
   
    var zone3 = document.getElementById("cin1");
    var zone4 = document.getElementById("cin2");
    var zone5 = document.getElementById("carte_sejour1");
    var zone6 = document.getElementById("carte_sejour2");
    if(selected == 'm'){
        zone3.disabled = false;
        zone4.disabled = false;
        zone5.disabled = true;
        zone6.disabled = true;
    }
    if(selected == 'e'){
        zone5.disabled = false;
        zone6.disabled = false;
        zone3.disabled = true;
        zone4.disabled = true;

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
  <button class="dropbtn">Salari�</button>
  <div class="dropdown-content">
    <a href="formSalarie">Ajouter salari�</a>
    <a href="AfficherSalarie">Afficher tout les salari�s</a>
  </div>
</div>


<f:form method="POST" action="ajoutSalarie" modelAttribute="salarieModel">
 <fieldset>
<legend>Donn�es personnelles :</legend>
<table>
    
    <tr>
	
        <td><label path="matricule">Matricule</label></td>
        <td><input path="matricule" name="matricule" required="required"/></td>
        <td><label path="nom">Nom</label></td>
        <td><input path="nom" name="nom_fonc" required="required"/></td>
        <td><label >Pr�nom</label></td>
        <td><input path="prenom_fonc"  name="prenom_fonc" required="required"/></td>
        <td><label>Nom arabe </label></td>
        <td><input path="nom_fonc_ara" name="nom_fonc_ara" required="required"/></td>
         <td><label >Pr�nom arabe </label></td>
         <td><input path="prenom_fonc_ara" name="prenom_fonc_ara" required="required" /></td>
         
    </tr>
     
    <tr>       
       
         <td><label path="sexe">Sexe</label></td>
        <td>
        <select name="sexe" id = "sexe" required="required">
        <option value="f">Feminin</option>
        <option value="m">Masculin</option>
        </select>
        </td>
        <td><label path="telephone">Telephone</label></td>
        <td><input  path="telephone" name="telephone" required="required" /></td>
        <td><label path="email">E-mail</label></td>
        <td><input type="email" path="email"  name="email" required="required"/></td>
         <td><label path="date">Date Naissance:</label></td>  
        <td><input type="date" path="date" name="date_naissance" required="required"/></td>  
        <td><label path="lieu">Lieu Naissance</label></td>
        <td><input path="lieu_naissance" name="lieu_naissance" required="required" /></td>
        
   </tr>
        
   <tr>
        
        <td><label >Nationalit�:</label></td>
        <td>
         <select name="nationalite" id = "nationalite" onchange="changeNationalite(this)" required="required">
        <option value="m">Marocain(e)</option>
        <option value="e">Etrang�re</option>
        </select>
        </td>
        <td><label id="cin1" >CIN</label></td>
        <td><input path="cin" name="cin" id="cin2" required="required" /></td>
        <td><label id="carte_sejour1">N� carte s�jour:</label></td>
        <td><input path="carte_sejour" name="carte_sejour"  id="carte_sejour2" required="required"/></td>
        
        <td><label >Ville</label></td>
        <td><input path="ville" name="ville" required="required"/></td>
        <td><label >Adresse</label></td>
        <td><input path="adresse" name="adresse" required="required"/></td>
        
     
  </tr>
  <tr>
     
         <td><label >Login</label></td>
        <td><input path="login" name="login" required="required"/></td>
        <td><label >Password </label></td>
        <td><input path="pass" name="pass" required="required"/></td>
        <td><label >Confirmation de password  </label></td>
        <td><input path="pass" name="pass" required="required"/></td>
  </tr>
  
 </table>
 </fieldset>
 
 <fieldset><legend>Donn�es de paie :</legend>
 
 <table>
     <tr>
        <td><label >Situation</label></td>
        <td> <select name="situation_familiale" id = "situation_familiale">
        <option value="v">Veuve</option>
        <option value="m">Mari�(e)</option>
       <option value="c">Celibataire</option>
       <option value="d">Divorc�(e)</option>
        
        </select></td>
        <td><label >Nbr Enfants :</label></td>
        <td><input path="nbr_enfants" name="nbr_enfants" /></td>
       
        <td><label path="cnss">N� CNSS : </label></td>
        <td><input path="cnss"  name="numCnss"/></td>
        <td><label path="numCimr">N� CIMR : </label></td>
        <td><input path="numCimr"  name="numCimr"/></td>
    </tr>
    <tr>
   
        <td><label path="ppr">N� Mutuelle :</label></td>
        <td><input path="ppr" name="numMutuelle" /></td>
       <td><label path="contrat">Type contrat:</label></td>
        <td>       
         <select name="idTypeContrat" id ="idTypeContrat"  onchange="changeContrat(this)">
        <c:forEach items="${listeTypeContrat}" var="c" >
        <option value="${c.idTypeContrat}">
        ${c.nomType}</option>
        </c:forEach>
        </select>
        </td>
        <td><label path="dateEntree">Date Entr�e :</label></td>
        <td><input type="date" path="dateEntree"  name="dateEntree"/></td>
        <td><label path="dateSortie">Date Sortie :</label></td>
        <td><input type="date" path="dateSortie" name="dateSortie" id="dateSortie"/></td>  
        
    </tr>
    
     <tr>
          
        <td><label path="fonction">Fonction : </label></td>
		<td>
        <select name="idProfession" id = "fonction" onchange="changeChauffeurProfesseur(this)" >
        <c:forEach items="${listeProfession}" var="p" >
        <option value="${p.idProfession}">
        ${p.nomProfession}</option>
        </c:forEach>
        </select>
        </td>
        <td>
       <label id="permis" id="permis1"> N� Permis de conduite </label> 
       </td>
       <td> <input name="numero_de_permis" type="text" id="permis2"> </input></td>
       <td>
       <label id="echel1"> Echel: </label> 
       </td>
       <td> <input name="echel" id="echel2" type="text" > </input></td>
    
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
        </select>
        </td>
        <td><label path="salaireBase">Salaire de base :</label></td>
        <td><input path="salaireBase" name="salaireBase" /></td>
         <td><label >Taux frais Professionnels:</label></td>
        <td><input path="frais_professionnels" name="frais_professionnels"/></td>
        <td><label path="modeRegelement">Mode r�glement:</label></td>
        <td>
        
        <select name="modeRegelement" id = "modeRegelement">
        <option value="v">Virement</option>
        <option value="c">Ch�que</option>
        <option value="e">Esp�ce</option>
        
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
         <td><label >N� de compte:</label></td>
        <td><input path="compteBancaire" name="compteBancaire" /></td>
     </tr>
</table>
 </fieldset>

 <fieldset>
      <legend>Exoneration :</legend>
 <table>

  
    <tr>
         <td><input type= "checkbox" name="amo" value="amo"/>Exon�r� AMO </td>
         <td><input type= "checkbox" name="cnss" value="cnss"/>Exon�r� CNSS </td>
         <td> <input type= "checkbox" name="ir" value="ir"/>Exon�r� IR</td>
           
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