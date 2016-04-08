<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des comptes bancaire</title>
</head>
<body>
<div align="center">
 <h1>Gestion des comptes bancaire</h1>
<fieldset> <legend><h3>Tous les comptes</h3></legend>
               <table border="1">
                     <th>Code compte</th><th>Date création</th><th>Solde</th><th>Responsable de création de compte</th><th></th><th></th>
                     <c:forEach items="${comptes}" var="c">
                     <tr> 
                         
                         <td> ${c.codeCompte}</td>
                          <td> ${c.dateCreation}</td>
                           <td> ${c.solde}</td>
                         <td> ${c.fonctionnaire.nom_fonc}</td>
                         <td><a href="updateCompte?getId=${c.codeCompte}" role="button">update</a></td>
                         <td><a href="deleteCompte?getId=${c.codeCompte}" role="button">delete</a></td>
                     </tr>
                     </c:forEach>
               </table>
</fieldset>
</div>
<c:if test="${not empty compte_to_update}">
<div align="center">
   
       <f:form method="post" name="form" action="updateCompteFormulaire" modelAttribute="addCompteFormulaire">
          <fieldset> <legend><h2>Modifier un Compte</h2></legend>
               <table>
                      <tr>
                     <td>Code du compte</td>
                     <td>
                     <input  type="text" disabled  value="${compte_to_update.codeCompte}"/>
                     <input  type="hidden" path="codeCompte" name="codeCompte" value="${compte_to_update.codeCompte}"/></td>
                     </tr>
                     <tr>
                     <td>Date de création</td>
                     <td><input disabled type="text" path="dateCreation" name="dateCreation" value="${compte_to_update.dateCreation}"/></td>
                     </tr>
                     <tr>
                     <td>Solde</td>
                     <td><input type="text" path="solde" name="solde" value="${compte_to_update.solde}"/></td>
                     </tr>
                      <tr>
                     <td><input type="submit" value="ok"/> </td>
                     </tr>
                </table>
           </fieldset>
       </f:form>
</div>
</c:if>
<div align="center" >
   
       <f:form method="post" name="form" action="addCompte" modelAttribute="addCompteFormulaire">
          <fieldset> <legend><h3>Ajouter nouveau compte</h3></legend>
               <table>
                      <tr>
                     <td>Code du compte</td>
                     <td><input type="text" path="codeCompte" name="codeCompte"/></td>
                     </tr>
                     <tr>
                     <td>Date de création</td>
                     <td><input type="date" path="dateCreation" name="dateCreation"/></td>
                     </tr>
                     <tr>
                     <td>Solde</td>
                     <td><input type="text" path="solde" name="solde"/></td>
                     </tr>
                      <tr>
                     <td><input type="submit" value="ok"/> </td>
                     </tr>
                </table>
           </fieldset>
       </f:form>
</div>

</body>
</html>