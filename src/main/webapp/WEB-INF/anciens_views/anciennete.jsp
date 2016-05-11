<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<h2>Ancienneté:</h2>


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


     <fieldset>
    <legend>Update les Taux d'ancienneté :</legend>

<f:form action="validerUpdateAnciennete" modelAttribute="ancienneteModel" method="GET">

<table border="1" width="100%">

        <th><label path="debutTranche" >Du </label></th>
        <th><label path="finTranche" >Fin</label></th>
        <th><label path="taux" >Taux(%) </label></th>
        <th><label path="miseAjour" >Mettre a jour </label></th>
        
     <c:forEach items="${anciennete}" var="a" >
        <tr>
     <td><label path="debutTranche" value="${a.debutTranche}" >${a.debutTranche}</label></td>
     <td><label path="finTranche" value="${a.finTranche}" >${a.finTranche}</label></td>
     <td><label path="taux" value="${a.tauxAnciennete}" >${a.tauxAnciennete}</label></td>
     <td><a href="updateAnciennete?getId=${a.idAnciennete}" role="button">update</a></td>
     
         </tr>
     
     </c:forEach>

     
     
     </table> 
     
     
     
     <c:if test="${not empty ancienneteToUpdate }">
     <table border="1" width="100%">
     
     <tr>
     <td> <input name="idAnciennete" path="idAnciennete" value="${ancienneteToUpdate.idAnciennete}"/></td>
     <td><input name="debutTranche" path="debutTranche" value="${ancienneteToUpdate.debutTranche}" /></td>
     <td><input name="finTranche"  path="finTranche" value="${ancienneteToUpdate.finTranche}" /></td>
     <td><input name="taux"  path="taux" value="${ancienneteToUpdate.tauxAnciennete}" /></td>
     
     </tr>
      <tr>
        <td colspan="2">
            <input type="submit" value="Valider"/>
        </td>
    </tr>
    </table> 
     </c:if>
 
    </f:form>

</fieldset>




</center>


</body>
</html>