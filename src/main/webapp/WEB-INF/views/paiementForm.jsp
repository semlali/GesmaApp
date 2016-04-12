<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Paiement</title>


<script type="text/javascript"
	src="<c:url value="/resources/jquery/1.6/jquery-1.6.1.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/jquery-ui/jquery-ui-1.8.10.custom.min.js" />"></script>	
<script type="text/javascript">
	window.scrollTo(0, 1);
</script>

<c:url var="findFraisNiveauURL" value="/fraisNiveau" />
<c:url var="findFraisURL" value="/frais" />
<c:url var="findEtudiantClasseURL" value="/etudiants" />
<c:url var="findBranchClasseURL" value="/classes" />
<c:url var="findStateCitiesURL" value="/cities" />
<c:url var="findStatesURL" value="/states" />

<!-- http://forum.springsource.org/showthread.php?110258-dual-select-dropdown-lists -->
<!-- http://api.jquery.com/jQuery.getJSON/ -->

<script type="text/javascript">
	$(document).ready(
			function() {
				$.getJSON('${findFraisURL}', {
					ajax : 'true'
				}, function(data) {
					var html = '<option value="">Frais</option>';
					var len = data.length;
					for ( var i = 0; i < len; i++) {
						html += '<option value="' + data[i].id_frais + '">'
								+ data[i].nom + '</option>';
					}
					html += '</option>';

					$('#frais').html(html);
				});
			});
</script>

<script type="text/javascript">
$(document).ready(function() { 
	$('#frais').change(
			function() {
				$.getJSON('${findFraisNiveauURL}', {
					stateId : $('#usStates').val(),
					fraisId : $('#frais').val(),
					ajax : 'true'
				}, function(data) {
					var html;
					var len = data.length;
					
						html += '<option value="' + data[0].id_frais_niveau + '">'
								+ data[0].prix + '</option>';
					
					html += '</option>';
					
					$('#prix').html(html);
				});
			});
});
</script>
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

<c:url value="/paiementAdd" var="signupUrl" />
<f:form id="signup" action="${signupUrl}" method="post" modelAttribute="paiementFormulaire">
	<div class="formInfo">
	<h2>Factures Etudiant</h2>
	<h3>Paiement</h3>
	
	</div>


	<fieldset>
	<div class="multiple">
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
	
	<td><select id="etudiant" path="n_etudiant" name="n_etudiant">
		<option value="">Etudiant</option>
	</select>
	</tr>
	<tr>
	<td>Frais de prestation<td><select id="frais" path="id_frais" name="id_frais"></select>
	</tr>
	<tr>
	<td>Prix</td><td><select id="prix" path="id_fraisNiveau" name="id_fraisNiveau" ></select> </td>
	</tr>
	<tr><td>Reduction<td><input name="reduction" path="reduction" value="${reduction}"/></td></tr>
	<tr><td>Caisse
	<td><select path="id_caisse" name="id_caisse">
	       <option value="">Caisse</option>
                                     <c:forEach items="${caisses}" var="c">
                                                <option value="${c.id_caisse}" > 
                                                   ${c.nom_caisse} </option>
                                     </c:forEach>
         </select></td>
	</tr>
	<tr><td>Avance </td><td><input name="avance" path="avance"  /></td></tr>
	<tr><td>Date Paiement<td><input type="date" name="datePaiement" path="datePaiement" /></tr>
	<tr><td>Type de Paiement<td><select  name="typePaiement" path="typePaiement" >
	        <option value="cache" >Cache</option>
            <option value="cheque" >Chéque</option>                         
	</select></tr>
	</table>
	</div>
	</fieldset>


	<p>
	<button type="submit">Valider</button>
	</p>
</f:form>
<c:if test="${not empty facture}">
<div id="fac">
<fieldset><legend>Votre Facture</legend>
<table > 
        <tr>
            <td>Numero de Facture:</td>
            <td>${facture.numFacture}</td>
        </tr>
        <tr>
            <td>Date de Facture:</td>
            <td>${facture.date_facture}</td>
        </tr>
        <tr>
            <td>Caisse:</td>
            <td>${facture.caisse.nom_caisse}</td>
        </tr>
        <tr>
            <td>Nom de l'étudiant:</td>
            <td>${facture.etudiant.nom_etudiant}</td>
        </tr>
        <tr>
            <td>Niveau de l'étudiant:</td>
            <td>${facture.frais_niveau.niveau.niveau_scolaire}</td>
        </tr>
        <tr>
            <td>Frais de facture:</td>
            <td>${facture.frais_niveau.frais.nom}</td>
        </tr>
        <tr>
            <td>Avance:</td>
            <td>${facture.avance}</td>
        </tr>
        <tr>
            <td>Etat:</td>
            <td>${facture.etat}</td>
        </tr>
         <tr>
            <td>Type de paiement:</td>
            <td>${facture.typePaiement}</td>
        </tr>
        <tr>
            <td>Montant:</td>
            <td>${facture.prix}</td>
        </tr>
       
    </table></fieldset>
</div>
</c:if>
    
	<div id="imprimer">
		<button type="button" >Imprimer Facture</button>
	</div>

</div>

</body>
</html>