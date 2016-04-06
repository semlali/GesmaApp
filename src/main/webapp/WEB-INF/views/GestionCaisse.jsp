<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des caisses</title>
</head>
<body>
<div align="center">
 <h1>Gestion des caisses</h1>
<fieldset> <legend><h3>Tous les caisses</h3></legend>
               <table border="1">
                     <th>nom de caisse</th><th>Fonctionnaire</th><th></th><th></th>
                     <c:forEach items="${caisses}" var="c">
                     <tr> 
                         
                         <td> ${c.nom_caisse}</td>
                         <td> ${c.fonctionnaire.nom_fonc}</td>
                         <td><a href="updateCaisse?getId=${c.id_caisse}" role="button">update</a></td>
                         <td><a href="deleteCaisse?getId=${c.id_caisse}" role="button">delete</a></td>
                     </tr>
                     </c:forEach>
               </table>
</fieldset>
</div>
<c:if test="${not empty caisse_to_update}">
<div align="center" >
   
       <f:form method="post" name="form" action="updateCaisseForm" modelAttribute="GestionCaisseFormulaire">
          <fieldset> <legend><h3>Modifier la caisse</h3></legend>
               <table>
                      <tr>
                    
                     <td>Nom caisse</td>
                     <td>
                       <input type="hidden" path="idcaisse" name="idcaisse" value="${caisse_to_update.id_caisse}"/>
                     <input  path="nom"  name="nom" value="${caisse_to_update.nom_caisse}" />
                      </td>
                     </tr>
                     
                     <tr>
                     <td>Affecter un nouveau fonctionnaire</td>
                     <td>
                      <select path="n_fonc" name="n_fonc">
                      <option value="${caisse_to_update.fonctionnaire.n_fonc}">
                          ${caisse_to_update.fonctionnaire.nom_fonc} </option>
                                     <c:forEach items="${fonctionnaires}" var="f">
                                                <option value="${f.n_fonc}" > 
                                                   ${f.nom_fonc} </option>
                                     </c:forEach>
                     </select>
                     </td>
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
   
       <f:form method="post" name="form" action="addCaisse" modelAttribute="GestionCaisseFormulaire">
          <fieldset> <legend><h3>Ajouter nouvelle caisse</h3></legend>
               <table>
                      <tr>
                     <td>Nom caisse</td>
                     <td><input type="text" path="nom" name="nom"/></td>
                     </tr>
                     
                     <tr>
                     <td>Affecter un fonctionnaire a une caisse</td>
                     <td>
                     <select path="n_fonc" name="n_fonc">
                                     <c:forEach items="${fonctionnaires}" var="f">
                                                <option value="${f.n_fonc}" > 
                                                   ${f.nom_fonc} </option>
                                     </c:forEach>
                     </select>
                     </td>
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