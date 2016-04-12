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


     <fieldset>
    <legend>Update les Taux d'IGR :</legend>

<f:form action="validerUpdateIGR" modelAttribute="IGRModel" method="GET">

<table border="1" width="100%">

        <th><label path="debutTranche" >Du </label></th>
        <th><label path="finTranche" >AU</label></th>
        <th><label path="taux" >Taux(%) </label></th>
        <th><label path="montantADeduire" >Montant � d�duire</label></th>
        <th><label path="miseAjour" >Mettre a jour </label></th>
        
     <c:forEach items="${ir}" var="i" >
        <tr>
        
     <td><label path="debutTranche" value="${i.debutTranche}" >${i.debutTranche}</label></td>
     <td><label path="finTranche" value="${i.finTranche}" >${i.finTranche}</label></td>
     <td><label path="taux" value="${i.taux}" >${i.taux}</label></td>
     <td><label path="taux" value="${i.sommeADeduire}" >${i.sommeADeduire}</label></td>
     <td><a href="updateIGR?getId=${i.idIgr}" role="button">update</a></td>
     
         </tr>
     
     </c:forEach>

     
     
     </table> 
     
     
     
     <c:if test="${not empty igrToUpdate }">
     <table border="1" width="100%">
     
     <tr>
     <td> <input name="idIgr" path="idIgr" value="${igrToUpdate.idIgr}"/></td>
     <td><input name="debutTranche" path="debutTranche" value="${igrToUpdate.debutTranche}" /></td>
     <td><input name="finTranche"  path="finTranche" value="${igrToUpdate.finTranche}" /></td>
     <td><input name="taux"  path="taux" value="${igrToUpdate.taux}" /></td>
     <td><input name="sommeADeduire"  path="taux" value="${igrToUpdate.sommeADeduire}" /></td>
     
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