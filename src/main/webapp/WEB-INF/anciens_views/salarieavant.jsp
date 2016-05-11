<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<body>



<f:form method="POST" action="ajoutSalarie">
 <fieldset>
<legend>Données personnelles :</legend>
<table>
    
    <tr>
        <td><label path="matricule">Matricule</label></td>
        <td><input path="matricule" /></td>
        <td><label path="nom">Nom</label></td>
        <td><input path="matricule" /></td>
        <td><label path="nom">Prénom</label></td>
        <td><input path="matricule" /></td>
        <td><label path="sexe">Sexe</label></td>
        <td>
        <select name="sexe" id = "sexe">
        <option value="f">Feminin</option>
        <option value="m">Masculin</option>
        </select>
        </td>
    </tr>
     
    <tr>
        <td><label path="age">CIN</label></td>
        <td><input path="age" /></td>
        <td><label path="age">N° carte séjour:</label></td>
        <td><input path="age" /></td>
        <td><label path="age">Adresse</label></td>
        <td><input path="age" /></td>
    </tr>
    <tr>
        <td><label path="tel">Telephone</label></td>
        <td><input  path="tel" /></td>
          <td><label path="email">E-mail</label></td>
        <td><input type="email" path="email" /></td>
          <td><label path="date">Date Naissance:</label></td>
        <td><input type="date" path="date" /></td>
          <td><label path="lieu">Lieu Naissance</label></td>
        <td><input path="lieu" /></td>
    </tr>
  
 </table>
 </fieldset>
 
 <fieldset><legend>Données de paie :</legend>
<table>

    
     <tr>
        <td><label path="id">Situation</label></td>
        <td> <select name="sexe" id = "sexe">
        <option value="v">Veuve</option>
        <option value="m">Marié(e)</option>
       <option value="c">Celibataire</option>
       <option value="d">Divorcé(e)</option>
        
        </select></td>
        <td><label path="nbrEnfant">Nbr Enfant :</label></td>
        <td><input path="nbrEnfant" /></td>
        <td><label path="contrat">Type contrat:</label></td>
        <td>
        <select name="contrat" id = "contrat">
        <option value="cdi">CDI</option>
        <option value="cdd">CDD</option>
        </select>
        </td>
          
    </tr>
    <tr>
        <td><label path="cnss">N° CNSS : </label></td>
        <td><input path="cnss"  name="cnss"/></td>
        <td><label path="ppr">N° PPR :</label></td>
        <td><input path="ppr" name="ppr" /></td>
        <td><label path="dateEntree">Date Entrée :</label></td>
        <td><input type="date" path="dateEntree" /></td>
        <td><label path="dateSortie">Date Sortie :</label></td>
        <td><input type="date" path="dateSortie" /></td>
        <td><label path="fonction">Fonction : </label></td>
               <td><input path="id" /></td>
        <select name="fonction" id = "fonction" >
        <c:forEach items="${listeProfession}" var="p" >
        <option value="${p.nomProfession}">${p.nomProfession}</option>
        </c:forEach>
        </select>
          
    </tr>
    
      <tr>
        <td><label path="age">N° PPR :</label></td>
        <td><input path="age" /></td>
        <td><label path="age">Date Entrée :</label></td>
        <td><input path="age" /></td>
        <td><label path="age">Date Sortie :</label></td>
        <td><input path="age" /></td>
          
    </tr>
    
 </table>
 
 </fieldset>
 
  <fieldset>
<legend>Salaire :</legend>
 <table>

    
     <tr>
        <td><label path="id">Categorie du salaire :</label></td>
        <td><input path="id" /></td>
        <td><label path="age">Salaire de base :</label></td>
        <td><input path="age" /></td>
         <td><label path="age">Taux frais Professionnels:</label></td>
        <td><input path="age" /></td>
        <td><label path="age">Mode réglement:</label></td>
        <td><input path="age" /></td>
          
    </tr>
    
     <tr>
        <td><label path="id">Banque :</label></td>
        <td><input path="id" /></td>
        <td><label path="age">Agence :</label></td>
        <td><input path="age" /></td>
         <td><label path="age">N° de compte:</label></td>
        <td><input path="age" /></td>
     </tr>
</table>
 </fieldset>

 <fieldset>
      <legend>Exoneration :</legend>
 <table>

  
    <tr>
        <td><label path="id">Avec AMO:</label></td>
        <td><input path="id" /></td>
        <td><label path="age">Exonéré CNSS :</label></td>
        <td><input path="age" /></td>
         <td><label path="age">Exonéré IR:</label></td>
        <td><input path="age" /></td>
           
    </tr>
    
    
     </table>
      
     </fieldset>
     
     <table>
    <tr>
        <td colspan="2">
     <!--    <input path="submit" type="submit" value="Valider"/>
        <input path="reset" type="reset" value="Annuler"/>
        
         -->
        </td>
    </tr>
        </table> 
    
    
     
</f:form>

</center>

</body>
</html>

