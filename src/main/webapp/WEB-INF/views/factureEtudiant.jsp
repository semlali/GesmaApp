<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Factures Etudiant</title>


<script type="text/javascript"
	src="<c:url value="/resources/jquery/1.6/jquery-1.6.1.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/jquery-ui/jquery-ui-1.8.10.custom.min.js" />"></script>	
<script type="text/javascript">
	window.scrollTo(0, 1);
</script>

<c:url var="findEtudiantClasseURL" value="/etudiants" />
<c:url var="findBranchClasseURL" value="/classes" />
<c:url var="findStateCitiesURL" value="/cities" />
<c:url var="findStatesURL" value="/states" />

<!-- http://forum.springsource.org/showthread.php?110258-dual-select-dropdown-lists -->
<!-- http://api.jquery.com/jQuery.getJSON/ -->

<script type="text/javascript">
$(document).ready(function() { 
	$('#classe').change(
			function() {
				$.getJSON('${findEtudiantClasseURL}', {
					stateName : $(this).val(),
					ajax : 'true'
				}, function(data) {
					var html = '<option value="">Etudiant</option>';
					var len = data.length;
					for ( var i = 0; i < len; i++) {
						html += '<option value="' + data[i].n_etudiant + '">'
								+ data[i].nom_etudiant + '</option>';
					}
					html += '</option>';

					$('#etudiant').html(html);
				});
			});
});
</script>


<script type="text/javascript">
$(document).ready(function() { 
	$('#city').change(
			function() {
				$.getJSON('${findBranchClasseURL}', {
					stateName : $(this).val(),
					ajax : 'true'
				}, function(data) {
					var html = '<option value="">Classe</option>';
					var len = data.length;
					for ( var i = 0; i < len; i++) {
						html += '<option value="' + data[i].nom_classe + '">'
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

<div id="test" align="center">

<c:url value="/listefactureEtudiant" var="signupUrl" />
<f:form id="signup" action="${signupUrl}" method="post" modelAttribute="factureEtudiantFormulaire">
	<div class="formInfo">
	<h2>Factures Etudiant</h2>
	
	<p>choisissez les coordonnées de l'étudiant</p>
	</div>


	<fieldset>
	<div class="multiple">
	
	<select id="usStates" path="niveau" name="niveau">
	</select> 
	
	<select id="city" path="branche" name="branche">
		<option value="">Branche</option>
	</select>
	
	<select id="classe" path="classe" name="classe">
		<option value="">Classe</option>
	</select>
	
	<select id="etudiant" path="n_etudiant" name="n_etudiant">
		<option value="">Etudiant</option>
	</select>
	
	</div>
	</fieldset>


	<p>
	<button type="submit">Chercher</button>
	</p>
</f:form>

	<div id="output">
		
	</div>

</div>

<div align="center">
<c:if test="${not empty factures}">
<table border="1"><th>Numero de Facture<th>Frais de prestation<th>Date de facture<th>Etat<th>Caisse<th>prix
                               <c:forEach items="${factures}" var="f">
                                     <tr>
                                         <td>${f.numFacture}</td>
                                         <td>${f.frais_niveau.frais.nom}</td>
                                         <td>${f.date_facture}</td>
                                         <td>${f.etat}</td>
                                         <td>${f.caisse.nom_caisse}</td>
                                         <td>${f.prix}</td>   
                                     </tr>
                                    
                               </c:forEach>
</table>
</c:if>
</div>
</body>
</html>