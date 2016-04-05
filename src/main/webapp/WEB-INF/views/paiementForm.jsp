<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Paiement</title>
</head>
<body>
<div align="center">
   <h1>Paiement</h1>
       <f:form method="post" action="CreerFacture" modelAttribute="paiementFormulair">
          <fieldset> <legend><h3>Paiement</h3></legend>
               <table>
                     <tr>
                         <td>Choisissez votre niveau</td>
                         <td><select path="niveau" name="niveau">
                                     <c:forEach items="${niveaux}" var="n">
                                                <option value="${n.id_niveau}" > 
                                                   ${n.niveau_scolaire} </option>
                                     </c:forEach>
                              </select>
                          </td>
                        </tr>
                        <tr>
                          <td>Choisissez votre branche</td>
                          <td>
                          <select path="niveau" name="niveau">
                                     <c:forEach items="${branches}" var="b">
                                                <option value="${b}" > 
                                                   ${b} </option>
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