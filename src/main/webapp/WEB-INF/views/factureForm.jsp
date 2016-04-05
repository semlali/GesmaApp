<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recherche Facture</title>
</head>
<body>
<div align="center">
   <h1>Facture</h1>
       <f:form method="post" action="ChargerFacture" modelAttribute="factureFormulaire">
          <fieldset> <legend><h3>Recherche Facture</h3></legend>
               <table>
                     <tr>
                         <td>Entrer Num de Facture</td>
                         <td><f:input path="numFacture"/> </td>
                         <td><f:errors path="numFacture"></f:errors> </td>
                         <td><input type="submit" value="ok"/> </td>
                     </tr>
                   
                         
                     
               </table>
           </fieldset>
       </f:form>
</div>
<c:if test="${not empty factureFormulaire.facture}">

<div align="center">
<h3>Coordonnées Facture</h3>
    <table border="1">
        <tr>
            <td>Date de création:</td>
            <td>${factureFormulaire.facture.date_facture}</td>
        </tr>
        <tr>
            <td>Nom de l'étudiant:</td>
            <td>${etudiant.nom_etudiant}</td>
        </tr>
        <tr>
            <td>Niveau de l'étudiant:</td>
            <td>${niveau.niveau_scolaire}</td>
        </tr>
        <tr>
            <td>Frais de facture:</td>
            <td>${frais.nom}</td>
        </tr>
        <tr>
            <td>Avance:</td>
            <td>${factureFormulaire.facture.avance}</td>
        </tr>
        <tr>
            <td>Etat:</td>
            <td>${factureFormulaire.facture.etat}</td>
        </tr>
        <tr>
            <td>Montant:</td>
            <td>${factureFormulaire.facture.prix}</td>
        </tr>
    </table>
</div>
</c:if>
</body>
</html>