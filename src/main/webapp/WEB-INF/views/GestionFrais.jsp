<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion des frais</title>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" media="screen"/>
<script data-require="jquery@*" data-semver="2.0.3" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
    <script data-require="bootstrap@*" data-semver="3.1.1" src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <link data-require="bootstrap-css@*" data-semver="3.1.1" rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
</head>

<body>
 
    <div id="edit-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Modifier le frais de <label id="frais"></label> pour <label id="niveau"></label></h4>
                </div>
                <f:form method="post" name="form" action="updateFrais" modelAttribute="updateFraisFormulaire">
                <input type="hidden" id="idFrais" name="frais"/>
                <input type="hidden" id="idNiveau" name="niveau"/><br>
                Prix: <input id="edit-prix"  name="prix"/><br>
                Reduction: <input id="edit-reduction"  name="reduction"/><br>
               
                
                
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
                </f:form>
            </div>
        </div>
    </div>
    <div id="add-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Modifier le frais de <label id="frais"></label> pour <label id="niveau"></label></h4>
                </div>
                <f:form method="post" name="form" action="addFrais" modelAttribute="GestionFraisFormulaire">
         
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
          
       </f:form>
            </div>
        </div>
    </div>
    <script>
        $('#edit-modal').on('show.bs.modal', function(e) {
            
            var $modal = $(this),
                esseyId = e.relatedTarget.id;
            
            $.ajax({
                cache: false,
                type: 'POST',
                url: 'update',
                data: {getId: esseyId},
                success: function(data) 
                {   
                	
                	$("#idFrais").val(data.frais.id_frais);
                	$("#idNiveau").val(data.niveau.id_niveau);
                	$("#edit-prix").val(data.prix);
                	$("#edit-reduction").val(data.reduction);
                	
                	$modal.find('#frais').html(data.frais.nom);
                	$modal.find('#niveau').html(data.niveau.niveau_scolaire);
                   
                }
            });
            
        })
    </script>
    
<div align="center" id="content">
 <h2>Gestion des frais</h2>
  
 <h3>Tous les Frais de prestations</h3>

               <table class="table3">
                     <thead>
                    <tr>
                        <th></th>
                        <th scope="col" abbr="Starter">Niveau</th>
                        <th scope="col" abbr="Medium">Frais</th>
                        <th scope="col" abbr="Business">prix</th>
                        <th scope="col" abbr="Deluxe">réduction</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th ></th>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    
                </tfoot>     
                     
                     <c:forEach items="${niveauFrais}" var="nf">
                     <tr> 
                         <th></th>
                         <td> ${nf.niveau.niveau_scolaire}</td>
                         <td> ${nf.frais.nom}</td>
                         <td> ${nf.prix}</td>
                         <td> ${nf.reduction}</td>
                         <td>
                         <a href="#myModal" data-toggle="modal" id="${nf.id_frais_niveau}" data-target="#edit-modal">Modifier</a>
                         </td>
                         <td><a href="delete?getId=${nf.id_frais_niveau}" class="blue-pill" >Supprimer</a></td>
                         
                     </tr>
                     </c:forEach>
               </table>
  
                <a href="#myModaltwo" data-toggle="modal" id="myBtn" data-target="#add-modal"><h3>Ajouter nouveau frais</h3></a> 
             
              </div>
           
<c:if test="${error}">
<script type="text/javascript">
var person = confirm("supprimer les factures associés", "ok");
</script>
</c:if>
 
</body>
</html>