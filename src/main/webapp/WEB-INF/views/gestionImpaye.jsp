<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Les impayés</title>
<script type="text/javascript"
	src="<c:url value="/resources/jquery/1.6/jquery-1.6.1.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/jquery-ui/jquery-ui-1.8.10.custom.min.js" />"></script>	
<script type="text/javascript">
	window.scrollTo(0, 1);
</script>


<c:url var="findBranchClasseURL" value="/classes" />
<c:url var="findStateCitiesURL" value="/cities" />
<c:url var="findStatesURL" value="/states" />

<!-- http://forum.springsource.org/showthread.php?110258-dual-select-dropdown-lists -->
<!-- http://api.jquery.com/jQuery.getJSON/ -->



<script type="text/javascript">
$(document).ready(function() { 
	$('#city').change(
			function() {
				$.getJSON('${findBranchClasseURL}', {
					stateName : $(this).val(),
					ajax : 'true'
				}, function(data) {
					var i=0;
					var html = '<option value="'+i+'">tous les classes</option>';
					var len = data.length;
					for ( var i = 0; i < len; i++) { 
						html += '<option value="' + data[i].id_classe + '">'
								+ data[i].nom_classe + '</option>';
					}
					html += '</option>';

					$('#classe').html(html);
				});
			});
});
</script>

<script type="text/javascript">
$(document).ready(function() { 
	$('#usStates').change(
			function() {
				$.getJSON('${findStateCitiesURL}', {
					stateName : $(this).val(),
					ajax : 'true'
				}, function(data) {
					var html = '<option value="">Branche</option>';
					var len = data.length;
					for ( var i = 0; i < len; i++) {
						html += '<option value="' + data[i].nom_branche + '">'
								+ data[i].nom_branche + '</option>';
					}
					html += '</option>';

					$('#city').html(html);
				});
			});
});
</script>

<script type="text/javascript">
	$(document).ready(
			function() {
				$.getJSON('${findStatesURL}', {
					ajax : 'true'
				}, function(data) {
					var html = '<option value="">Niveau</option>';
					var len = data.length;
					for ( var i = 0; i < len; i++) {
						html += '<option value="' + data[i].niveau_scolaire + '">'
								+ data[i].niveau_scolaire + '</option>';
					}
					html += '</option>';

					$('#usStates').html(html);
				});
			});
</script>

<script type="text/javascript">
	$(document).ready(function(){
		$("#city").change(onSelectChange);
	});

	function onSelectChange() {
		var selected = $("#city option:selected");		
		var output = "";
		if(selected.val() != 0){
			output = "You selected branche " + selected.text();
		}
		$("#output").html(output);
	}
</script>
</head>
<body>

<div align="center">
 <h1>Recherche des impayés</h1>  
       <f:form method="get" action="rechercheParEtudiant" >
          <fieldset> <legend><h3>Recherche état d'etudiant</h3></legend>
               <table>
                     <tr>
                         <td>Entrer le nom de l'étudiant</td>
                         <td><input path="nomEtu" name="nomEtu"/> </td>
                         <td>Entrer le prenom de l'étudiant</td>
                         <td><input path="prenomEtu" name="prenomEtu"/> </td>
                         <td><input type="submit" value="ok"/> </td>
                     </tr>
                   
                         
                     
               </table>
           </fieldset>
       </f:form>
</div>

<c:if test="${not empty EtudiantOne}">
<div align="center">

    <table border="1">
    <th>Nom Etudiant<th>Transport<th>Inscription
        
             
             <tr>
                  <td>${EtudiantOne.nom_etudiant}</td>
                  <td>${EtudiantOne.etat_transport}</td>
                  <td>${EtudiantOne.etat_inscription}</td> 
                      
             </tr>                                
             
     </table>
</div>
</c:if>
<br><br><br>
<div align="center">
   
       <f:form method="get" action="impayeAction" modelAttribute="impayeFormulaire">
          <fieldset> <legend><h3>Recherche par classe</h3></legend>
               <table>
                     
                       <tr>
	<td>Choisissez les coordonnées de l'étudiant
	<td><select id="usStates" path="niveau" name="niveau">
	</select> 
	
	<td><select id="city" path="branche" name="branche">
		<option value="">Branche</option>
	</select>
	
	<td><select id="classe" path="classe" name="classe">
		<option value="">Classe</option>
	</select>
	
	
	</tr>
                      
                       <tr>
                         <td><input type="submit" value="ok"/> </td>
                       </tr>
                   
                         
                     
               </table>
           </fieldset>
       </f:form>
</div>

<c:if test="${not empty Etudiant}">

<div align="center">
<h3>L'état des etudiants de la classe ${Classe.nom_classe}</h3> 
    <table border="1">
    <th>Nom Etudiant<th>Transport<th>Inscription
        
             <c:forEach items="${Etudiant}" var="e">
             <tr>
                  <td>${e.nom_etudiant}</td>
                  <td>${e.etat_transport}</td>
                  <td>${e.etat_inscription}</td> 
                      
             </tr>                                
             </c:forEach>
     </table>
     
</div>
</c:if>
<br><br>
<div align="center"><button>Edition des lettres de rappel aux règlements</button></div>


</body>
</html>