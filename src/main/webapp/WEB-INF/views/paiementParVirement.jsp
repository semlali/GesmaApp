<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- META SECTION -->
        <title>Atlant - Front-End Template</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!-- END META SECTION -->
        
        <link rel="stylesheet" type="text/css" href="resources/front-end/css/styles.css" media="screen" />
        
    </head>
    <script type="text/javascript"
	src="<c:url value="/resources/jquery/1.6/jquery-1.6.1.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/jquery-ui/jquery-ui-1.8.10.custom.min.js" />"></script>	
<script type="text/javascript">
	window.scrollTo(0, 1);
</script>

<c:url var="findTypeURL" value="/findType" />
<c:url var="findCategoriePaiementURL" value="/categorie" />
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
				$.getJSON('${findCategoriePaiementURL}', {
					ajax : 'true'
				}, function(data) {
					var html = '<option value="">Catégorie</option>';
					var len = data.length;
					for ( var i = 0; i < len; i++) {
						html += '<option value="' + data[i].id_categoriePaiement + '">'
								+ data[i].categorie + '</option>';
					}
					html += '</option>';

					$('#categorie').html(html);
				});
			});
</script>


<script type="text/javascript">
 
$(document).ready(function() {
	
	$('#check1').click(function() {
		
		  if($(this).is(':checked')) {
			
            $.getJSON('${findTypeURL}', {                                           
			getId : 1,
			stateId : $('#usStates').val(),
			categorieId : $('#categorie').val(),
			ajax : 'true'
		},  function(data) {
			//$('#prixLabel').html(data.prix);
			$('#Label1').val(data.prix);
			$('#reduction1').val(data.reduction);
			$('#prix').val(data.id_frais_niveau);
			//$('#prixLabel').val(document.getElementById("Label1").value+document.getElementById("Label2").value);
			var x=$('#Label1').val();
			var y=$('#Label2').val();
			
			var xx=$('#reduction1').val();
			var yy=$('#reduction2').val();
			
			$('#prixLabel').val(+x + +y);
			$('#prixLabelTotal').val(+x*xx + +y*yy);
			
			
		});
			}
			
		 else {
				$('#Label1').val('');
	            //alert('unchecked');
				//$('#prixLabel').val(document.getElementById("Label1").value+document.getElementById("Label2").value);  
				var x=$('#Label1').val();
				var y=$('#Label2').val();
				
				var xx=$('#reduction1').val();
				var yy=$('#reduction2').val();
				
				$('#prixLabel').val(+x + +y);
				$('#prixLabelTotal').val(+x*xx + +y*yy);
	        }
			
			
			//$('#prixLabel').val($('#Label1').val()+$('#Label2').val());
	    });
	    
	 
	$('#check2').click(
	    		function() {
	      if($(this).is(':checked')) {
	    			
	            $.getJSON('${findTypeURL}', {                                           
					getId : 2,
					stateId : $('#usStates').val(),
					categorieId : $('#categorie').val(),
					ajax : 'true'
				},  function(data) {
					//$('#prixLabel').html(data.prix);
					$('#Label2').val(data.prix);
					$('#reduction2').val(data.reduction);
					$('#prix').val(data.id_frais_niveau);
					//$('#prixLabel').val(document.getElementById("Label1").value+document.getElementById("Label2").value);
					var x=$('#Label1').val();
					var y=$('#Label2').val();
					
					var xx=$('#reduction1').val();
					var yy=$('#reduction2').val();
					
					$('#prixLabel').val(+x + +y);
					$('#prixLabelTotal').val(+x*+xx + +y*+yy);
				});
	    			}
	    			
	       else {
	    				$('#Label2').val('');
	    	            //alert('unchecked');
	    				// $('#prixLabel').val(document.getElementById("Label1").value+document.getElementById("Label2").value); 
	    				var x=$('#Label1').val();
						var y=$('#Label2').val();
						
						var xx=$('#reduction1').val();
						var yy=$('#reduction2').val();
						
						$('#prixLabel').val(+x + +y);
						$('#prixLabelTotal').val(+x*+xx + +y*+yy);
	    	        
	       }
	    		
	    			
	   
	       });
	    
	$('#categorie').change(
			function() {
				$.getJSON('${findFraisNiveauURL}', {                                           
					stateId : $('#usStates').val(),
					fraisId : $('#frais').val(),
					categorieId : $('#categorie').val(),
					ajax : 'true'
				}, function(data) {
					$('#prixLabel').html(data.prix);
					$('#prix').val(data.id_frais_niveau);
					
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

    <body>
        <!-- page container -->
        <div class="page-container">
            
            <!-- page header -->
            <div class="page-header">
                
                <!-- page header holder -->
                <div class="page-header-holder">
                    
                    <!-- page logo -->
                    <div class="logo">
                        <a href="index.html">Atlant - Front-end Template</a>
                    </div>
                    <!-- ./page logo -->
                    

                    <!-- search -->
                    <div class="search">
                        <div class="search-button"><span class="fa fa-search"></span></div>
                        <div class="search-container animated fadeInDown">
                            <form action="#" method="post">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Search..."/>
                                    <div class="input-group-btn">
                                        <button class="btn btn-primary"><span class="fa fa-search"></span></button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <!-- ./search -->

                    <!-- nav mobile bars -->
                    <div class="navigation-toggle">
                        <div class="navigation-toggle-button"><span class="fa fa-bars"></span></div>
                    </div>
                    <!-- ./nav mobile bars -->
                    
                    <!-- navigation -->
                    <ul class="navigation">
                        <li>
                            <a href="#">Home</a>
                            <ul>
                                <li><a href="index.html">With Slider</a></li>
                                <li><a href="index-default.html">Default</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">Pages</a>
                            <ul>
                                <li><a href="about-us.html">About Us</a></li>
                                <li><a href="contacts.html">Contacts</a></li>
                                <li><a href="pricing.html">Pricing</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">Blog</a>
                            <ul>
                                <li><a href="blog-grid.html">Blog Grid</a></li>
                                <li><a href="blog-post.html">Blog Post</a></li>                                
                            </ul>
                        </li>
                        <li>
                            <a href="#">Portfolio</a>
                            <ul>
                                <li><a href="portfolio-with-title.html">Portfolio With Title</a></li>
                                <li><a href="portfolio-2column.html">Portfolio 2 Column</a></li>
                                <li><a href="portfolio-3column.html">Portfolio 3 Column</a></li>
                                <li><a href="portfolio-4column.html">Portfolio 4 Column</a></li>
                            </ul>
                        </li>
                       <li>
                        <a href="#">Payer vos frais</a>
                        <ul>
                                <li><a href="portfolio-with-title.html">Paiement par virement bancaire</a></li>
                                <li><a href="paiementEnLigne">Paiement par carte de crédit</a></li>
                                <li><a href="portfolio-2column.html">Paiement par chèque</a></li>
                        </ul>
                        </li>
                       <li><a href="deconnexion">Déconnexion</a></li>
                    </ul>
                    <!-- ./navigation -->                        

                    
                </div>
                <!-- ./page header holder -->
                
            </div>
            <!-- ./page header -->
            
            <!-- page content -->
            <div class="page-content">
                
                <!-- page content wrapper -->
                <div class="page-content-wrap bg-light">
                    <!-- page content holder -->
                    <div class="page-content-holder no-padding">
                        <!-- page title -->
                        <div class="page-title">                            
                            <h1>Paiement par virement</h1>
                            <!-- breadcrumbs -->
                            <ul class="breadcrumb">
                                <li><a href="index.html">Home</a></li>
                                <li><a href="#">Blog</a></li>
                                <li class="active">Blog Grid</li>
                            </ul>               
                            <!-- ./breadcrumbs -->
                        </div>
                        <!-- ./page title -->
                    </div>
                    <!-- ./page content holder -->
                </div>
                <!-- ./page content wrapper -->
                
                               
                <!-- page content wrapper -->
                <div class="page-content-wrap">                    
                    <!-- page content holder -->
                    <div class="page-content-holder padding-v-30">
                        
                        <div class="block-heading this-animate" data-animate="fadeInLeft">
                            <h2><strong>Payer vos factures en ligne, veuillez remplir ce formulaire:</strong> </h2>
                            <div class="block-heading-text">
                            Après avoir choisir vos frais sur notre site internet et si vous avez choisi le mode paiement « virement bancaire », il vous suffit de procéder au virement du montant à payer figurant sur le total des frais.
<BR>
<table>
<tr><td>Pour le règlement par virement bancaire, merci de communiquer les coordonnées bancaires suivantes à ta banque : 

<tr><td><label>Virements depuis Maroc:</label> <br>
<label>Banque XXXXX</label><br>
<label>Code Banque: XXXXX</label><br>
<label>Code Guichet: XXXXX</label><br>
<label>Numéro de Compte: XXXXX</label><br>
<label>Clé : XXXXX</label><br>	
<tr><td>
</table>
       <strong>Scanez le reçu de votre paiement par virement et envoyez le a l'adresse de l'école</strong>
                            </div>
                        </div>  
                        
                        <!-- FORMULAIRE -->
                       
                            <c:url value="/paiement" var="signupUrl" />
                             <f:form class="form-horizontal" id="signup" action="${signupUrl}" method="post" modelAttribute="paiementFormulaire">
                           
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    
                                    <ul class="panel-controls">
                                        <li><a href="#" class="panel-remove"><span class="fa fa-times"></span></a></li>
                                    </ul>
                                </div>
                                <div class="panel-body">
                                    <h3>Bienvenu <code>${etudiant.nom_etudiant} ! </code> </h3>
                                </div>
                                <div class="panel-body form-group-separated">
                                    <div class="form-group">                                        
                                        <label class="col-md-3 col-xs-12 control-label">Email *</label>
                                        <div class="col-md-6 col-xs-12">
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-unlock-alt"></span></span>
                                                <input name="email" path="email" class="form-control" />
                                            </div>            
                                            <span class="help-block">Email</span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 col-xs-12 control-label">Votre Niveau</label>
                                        <div class="col-md-6 col-xs-12">                                            
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                <select  id="usStates" path="niveau" name="niveau">
	                                            </select>                           
                                    
                                            </div>                                            
                                            <span class="help-block">selectionnez votre niveau</span>
                                        </div>
                                    </div>
                                    
                                    
                                    <div class="form-group">                                        
                                        <label class="col-md-3 col-xs-12 control-label">Catégorie de paiement</label>
                                        <div class="col-md-6 col-xs-12">
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-unlock-alt"></span></span>
                                                <select  id="categorie" path="categorie" name="categorie"></select>
                                            </div>            
                                            <span class="help-block">Choisissez une catégorie</span>
                                        </div>
                                     </div> 
                                    <div class="form-group">
                                        <label class="col-md-3 col-xs-12 control-label">Frais</label>
                                        <div class="col-md-6 col-xs-12">                                                                                                                                        
                                            <input type="checkbox" id="check1" name="frais1" value="frais transport"/> Transport  <br />
                                            <input type="checkbox" id="check2" name="frais2" value="frais inscription" /> Inscription 
                                          <span class="help-block">Selectionnez une catégorie de paiement</span>
                                        </div>
                                        
                                    </div>
                                    
                                    <div class="form-group">                                        
                                        <label class="col-md-3 col-xs-12 control-label">Prix</label>
                                        <div class="col-md-6 col-xs-12">
                                            <div class="input-group">
                                              <table border="1">
                                        <tr><td>Transport: <td>  <input id="Label1"  /><td><input id="reduction1"  />
                                        <tr><td>Inscription: <td><input id="Label2" /><td><input id="reduction2"  />
                                        <tr><td>Total: <td><input id="prixLabel"/><td><input id="prixLabelTotal" />
                                        </table>
                                           </div>            
                                       <span class="help-block">Detail des factures a payer</span>
                                        </div>
                                    </div>
                                   
                                    <div class="form-group">                                        
                                        <label class="col-md-3 col-xs-12 control-label">Réduction</label>
                                        <div class="col-md-6 col-xs-12">
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-unlock-alt"></span></span>
                                                <input name="reduction" path="reduction" class="form-control" />
                                            </div>            
                                            <span class="help-block">La réduction approprié</span>
                                        </div>
                                    </div>
                                    <div class="form-group">                                        
                                        <label class="col-md-3 col-xs-12 control-label">Date Paiement</label>
                                        <div class="col-md-6 col-xs-12">
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-calendar"></span></span>
                                                <input type="date"  value="2016-11-01" name="datePaiement" path="datePaiement">                                            
                                            </div>
                                            <span class="help-block">Click on input field to get datepicker</span>
                                        </div>
                                    </div>
                                    
                                   
                                    
                                   

                                </div>
                                <div class="panel-footer">
                                 
                                    <button class="btn btn-default">Clear Form</button>                                    
                                    <button type="submit" class="btn btn-primary pull-right">Submit</button>
                                </div>
                            </div>
                            </f:form>
                            
                           
                    </div>
                    <!-- ./page content holder -->
                </div>
                <!-- ./page content wrapper -->
                                
            </div>
            <!-- ./page content -->
            
            <!-- page footer -->
            <div class="page-footer">
                
                <!-- page footer wrap -->
                <div class="page-footer-wrap bg-dark-gray">
                    <!-- page footer holder -->
                    <div class="page-footer-holder page-footer-holder-main">
                                                
                        <div class="row">
                            
                            <!-- about -->
                            <div class="col-md-3">
                                <h3>About Template</h3>
                                <p>Lorem ipsum dolor natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec ullamcorper nulla non metus auctor fringilla. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit.</p>
                            </div>
                            <!-- ./about -->
                            
                            <!-- quick links -->
                            <div class="col-md-3">
                                <h3>Quick links</h3>
                                
                                <div class="list-links">
                                    <a href="#">Home</a>                                    
                                    <a href="#">Pages</a>
                                    <a href="#">Portfolio</a>
                                    <a href="#">Shortcodes</a>
                                </div>                                
                            </div>
                            <!-- ./quick links -->
                            
                            <!-- recent tweets -->
                            <div class="col-md-3">
                                <h3>Recent Tweets</h3>
                                
                                <div class="list-with-icon small">
                                    <div class="item">
                                        <div class="icon">
                                            <span class="fa fa-twitter"></span>
                                        </div>
                                        <div class="text">
                                            <a href="#">@JohnDoe</a> Hello, here is my new front-end template. Check it out
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div class="icon">
                                            <span class="fa fa-twitter"></span>
                                        </div>
                                        <div class="text">
                                            <a href="#">@Aqvatarius</a> Release of new update for Atlant is done and ready to use
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div class="icon">
                                            <span class="fa fa-twitter"></span>
                                        </div>
                                        <div class="text">
                                            <a href="#">@Aqvatarius</a> Check out my new admin template Atlant, it's realy awesome template
                                        </div>
                                    </div>
                                </div>
                                
                            </div>
                            <!-- ./recent tweets -->
                            
                            <!-- contacts -->
                            <div class="col-md-3">
                                <h3>Contacts</h3>
                                
                                <div class="footer-contacts">
                                    <div class="fc-row">
                                        <span class="fa fa-home"></span>
                                        000 StreetName, Suite 111,<br/> 
                                        City Name, ST 01234
                                    </div>
                                    <div class="fc-row">
                                        <span class="fa fa-phone"></span>
                                        (123) 456-7890
                                    </div>
                                    <div class="fc-row">
                                        <span class="fa fa-envelope"></span>
                                        <strong>John Doe</strong><br>
                                        <a href="mailto:#">johndoe@domain.com</a>
                                    </div>                                    
                                </div>
                                
                                <h3>Subscribe</h3>
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Your email"/>
                                    <div class="input-group-btn">
                                        <button class="btn btn-primary"><span class="fa fa-paper-plane"></span></button>
                                    </div>
                                </div>
                                
                            </div>
                            <!-- ./contacts -->
                            
                        </div>
                        
                    </div>
                    <!-- ./page footer holder -->
                </div>
                <!-- ./page footer wrap -->
                
                <!-- page footer wrap -->
                <div class="page-footer-wrap bg-darken-gray">
                    <!-- page footer holder -->
                    <div class="page-footer-holder">
                        
                        <!-- copyright -->
                        <div class="copyright">
                            &copy; 2014 Atlant Theme by <a href="#">Aqvatarius</a> - All Rights Reserved                            
                        </div>
                        <!-- ./copyright -->
                        
                        <!-- social links -->
                        <div class="social-links">
                            <a href="#"><span class="fa fa-facebook"></span></a>
                            <a href="#"><span class="fa fa-twitter"></span></a>
                            <a href="#"><span class="fa fa-google-plus"></span></a>
                            <a href="#"><span class="fa fa-linkedin"></span></a>
                            <a href="#"><span class="fa fa-vimeo-square"></span></a>
                            <a href="#"><span class="fa fa-dribbble"></span></a>
                        </div>                        
                        <!-- ./social links -->
                        
                    </div>
                    <!-- ./page footer holder -->
                </div>
                <!-- ./page footer wrap -->
                
            </div>
            <!-- ./page footer -->
            
        </div>        
        <!-- ./page container -->
        
        <!-- page scripts -->
        <script type="text/javascript" src="resources/front-end/js/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="resources/front-end/js/plugins/bootstrap/bootstrap.min.js"></script>
        
        <script type="text/javascript" src="resources/front-end/js/plugins/mixitup/jquery.mixitup.js"></script>
        <script type="text/javascript" src="resources/front-end/js/plugins/appear/jquery.appear.js"></script>
        
        <script type="text/javascript" src="resources/front-end/js/actions.js"></script>                
        <!-- ./page scripts -->
    </body>
</html>






