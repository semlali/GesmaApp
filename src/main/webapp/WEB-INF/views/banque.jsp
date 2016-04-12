<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Paie</title>


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
    <a href="AjouterFonction">Ajouter une Fonction</a>
    <a href="AfficherFonction">Afficher tout les fonctions</a>
  </div>
</div>




<div class="dropdown">
  <button class="dropbtn">Salari�</button>
  <div class="dropdown-content">
    <a href="AjouterSalarie">Ajouter salari�</a>
    <a href="AfficherSalarie">Afficher tout les salari�s</a>
  </div>
</div>
<f:form method="POST" action="AjouterBanque" modelAttribute="banqueModel">
     <fieldset>
    <legend>Ajout d'une banque :</legend>

<table>

    <tr>
        <td><f:label path="nomBanque" >Nom Banque :</f:label></td>
        <td><f:input path="nomBanque" name="nomBanque" /></td>
        <td><f:label path="adresseBanque" >Adresse :</f:label></td>
        <td><f:input path="adresseBanque" name="adresseBanque"/></td>
        <td><f:label path="faxeBanque" >Faxe: </f:label></td>
        <td><f:input path="faxeBanque" name="faxeBanque" /></td>
        <td><f:label path="telBanque">T�l�phone :</f:label></td>
        <td><f:input path="telBanque" name="telBanque" /></td>
        
    </tr>
     
     <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
    
</table> 
         </fieldset>

</f:form>

</center>
</body>
</html>