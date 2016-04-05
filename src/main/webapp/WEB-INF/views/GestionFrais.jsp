<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des frais</title>
<script type="text/javascript">
</script>
</head>

<body>
<div align="center">
 <h1>Gestion des frais</h1>
<fieldset> <legend><h3>Tous les Frais de prestations</h3></legend>
               <table border="1">
                     <th>Niveau</th><th>Frais</th><th>prix</th><th>réduction</th><th></th><th></th>
                     <c:forEach items="${niveauFrais}" var="nf">
                     <tr> 
                         
                         <td> ${nf.niveau.niveau_scolaire}</td>
                         <td> ${nf.frais.nom}</td>
                         <td> ${nf.prix}</td>
                         <td> ${nf.reduction}</td>
                         <td><a href="update?getId=${nf.id_frais_niveau}" role="button">update</a></td>
                         <td><a href="delete?getId=${nf.id_frais_niveau}" role="button">delete</a></td>
                     </tr>
                     </c:forEach>
               </table>
</fieldset>
</div>


<div align="center" id="dcacl">
   
       <f:form method="post" name="form" action="addFrais" modelAttribute="GestionFraisFormulaire">
          <fieldset> <legend><h3>Ajouter des nouveaux frais</h3></legend>
               <table>
                     <tr>
                     <td>Choisissez un niveau</td>
                     <td>
                     <select path="niveau" name="niveau">
                                     <c:forEach items="${niveaux}" var="n">
                                                <option value="${n.id_niveau}" > 
                                                   ${n.niveau_scolaire} </option>
                                     </c:forEach>
                     </select>
                              </td>
                     </tr>
                      <tr>
                     <td>Choisissez le type de frais</td>
                     <td>
                     <select path="frais" name="frais">
                                     <c:forEach items="${frais}" var="f">
                                                <option value="${f.id_frais}" > 
                                                   ${f.nom} </option>
                                     </c:forEach>
                     </select>
                              </td>
                     </tr>
                     <tr>
                     <td>Prix</td>
                     <td><input type="text" path="prix" name="prix"/></td>
                     </tr>
                     <tr>
                     <td>Reduction</td>
                     <td><input type="text" path="reduction" name="reduction"/></td>
                     </tr>
                     <tr>
                     <td><input type="submit" value="ok"/> </td>
                     </tr>
                </table>
           </fieldset>
       </f:form>
</div>
<c:if test="${not empty frais_to_update}">
<div align="center" id="dcacl">
   
       <f:form method="post" name="form" action="updateFrais" modelAttribute="updateFraisFormulaire">
          <fieldset> <legend><h3>Modifier un frais de prestation</h3></legend>
               <table>
                     <tr>
                     <td>Choisissez un niveau</td>
                     <td>
                     <input type="hidden" path="niveau"  name="niveau" value="${frais_to_update.niveau.id_niveau}" />
                      <input  value="${frais_to_update.niveau.niveau_scolaire}"/>              
                    
                              </td>
                     </tr>
                      <tr>
                     <td>Choisissez le type de frais</td>
                     <td>
                     <input type="hidden" path="frais"  name="frais" value="${frais_to_update.frais.id_frais}" />
                     <input value="${frais_to_update.frais.nom}"/>                
                              </td>
                     </tr>
                     <tr>
                     <td>Prix</td>
                     <td><input type="text"   name="prix"  value="${frais_to_update.prix}"></td>
                     </tr>
                     <tr>
                     <td>Reduction</td>
                     <td><input type="text"  name="reduction" value="${frais_to_update.reduction}"></td>
                     </tr>
                     <tr>
                     <td><input type="submit" value="ok"/> </td>
                     </tr>
                </table>
           </fieldset>
       </f:form>
</div>
</c:if>
                     
</body>
</html>