<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
   <title>Gesma</title>
    
        
        <!-- META SECTION -->
        <title>Gesma</title>            
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        
        <link rel="icon" href="favicon.ico" type="resources/image/x-icon" />
        <!-- END META SECTION -->
        
        <!-- CSS INCLUDE -->        
        <link rel="stylesheet" type="text/css" id="theme" href="resources/css/theme-default.css"/>
        <!-- EOF CSS INCLUDE -->    
      <script src="script.js"></script> 
       <script data-require="jquery@*" data-semver="2.0.3" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
      <script data-require="bootstrap@*" data-semver="3.1.1" src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
                              
    </head>

<body>

  <!-- START PAGE CONTAINER -->
        <div class="page-container">
            
            <!-- START PAGE SIDEBAR -->
            <div class="page-sidebar">
                <!-- START X-NAVIGATION -->
                <ul class="x-navigation">
                    <li class="xn-logo">
                        <a href="index.html">ATLANT</a>
                        <a href="#" class="x-navigation-control"></a>
                    </li>
                    <li class="xn-profile">
                        <a href="#" class="profile-mini">
                            <img src="resources/assets/images/users/avatar.jpg" alt="John Doe"/>
                        </a>
                        <div class="profile">
                            <div class="profile-image">
                                <img src="resources/assets/images/users/avatar.jpg" alt="John Doe"/>
                            </div>
                            <div class="profile-data">
                                <div class="profile-data-name">John Doe</div>
                                <div class="profile-data-title">Web Developer/Designer</div>
                            </div>
                            <div class="profile-controls">
                                <a href="pages-profile.html" class="profile-control-left"><span class="fa fa-info"></span></a>
                                <a href="pages-messages.html" class="profile-control-right"><span class="fa fa-envelope"></span></a>
                            </div>
                        </div>                                                                        
                    </li>
                    <li class="xn-title">Navigation</li>
                    <li class="active">
                        <a href="index.html"><span class="fa fa-desktop"></span> <span class="xn-text">Dashboard</span></a>                        
                    </li>        
                                        <li class="xn-openable">
                        <a href="#"><span class="fa fa-files-o"></span> <span class="xn-text">Transport</span></a>
                        <ul>
                            <li><a href="pages-gallery.html"><span class="fa fa-image"></span> Gallery</a></li>
                            <li><a href="pages-profile.html"><span class="fa fa-user"></span> Profile</a></li>
                            <li><a href="pages-address-book.html"><span class="fa fa-users"></span> Address Book</a></li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-clock-o"></span> Timeline</a>
                                <ul>
                                    <li><a href="pages-timeline.html"><span class="fa fa-align-center"></span> Default</a></li>
                                    <li><a href="pages-timeline-simple.html"><span class="fa fa-align-justify"></span> Full Width</a></li>
                                </ul>
                            </li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-envelope"></span> Mailbox</a>
                                <ul>
                                    <li><a href="pages-mailbox-inbox.html"><span class="fa fa-inbox"></span> Inbox</a></li>
                                    <li><a href="pages-mailbox-message.html"><span class="fa fa-file-text"></span> Message</a></li>
                                    <li><a href="pages-mailbox-compose.html"><span class="fa fa-pencil"></span> Compose</a></li>
                                </ul>
                            </li>
                            <li><a href="pages-messages.html"><span class="fa fa-comments"></span> Messages</a></li>
                            <li><a href="pages-calendar.html"><span class="fa fa-calendar"></span> Calendar</a></li>
                            <li><a href="pages-tasks.html"><span class="fa fa-edit"></span> Tasks</a></li>
                            <li><a href="pages-content-table.html"><span class="fa fa-columns"></span> Content Table</a></li>
                            <li><a href="pages-faq.html"><span class="fa fa-question-circle"></span> FAQ</a></li>
                            <li><a href="pages-search.html"><span class="fa fa-search"></span> Search</a></li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-file"></span> Blog</a>
                                
                                <ul>                                    
                                    <li><a href="pages-blog-list.html"><span class="fa fa-copy"></span> List of Posts</a></li>
                                    <li><a href="pages-blog-post.html"><span class="fa fa-file-o"></span>Single Post</a></li>
                                </ul>
                            </li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-sign-in"></span> Login</a>
                                <ul>                                    
                                    <li><a href="pages-login.html">App Login</a></li>
                                    <li><a href="pages-login-website.html">Website Login</a></li>
                                    <li><a href="pages-login-website-light.html"> Website Login Light</a></li>
                                </ul>
                            </li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-warning"></span> Error Pages</a>
                                <ul>                                    
                                    <li><a href="pages-error-404.html">Error 404 Sample 1</a></li>
                                    <li><a href="pages-error-404-2.html">Error 404 Sample 2</a></li>
                                    <li><a href="pages-error-500.html"> Error 500</a></li>
                                </ul>
                            </li>                            
                        </ul>
                    </li>            
                                        <li class="xn-openable">
                        <a href="#"><span class="fa fa-files-o"></span> <span class="xn-text">Paiement</span></a>
                        <ul>
                            <li><a href="pages-gallery.html"><span class="fa fa-image"></span> Gallery</a></li>
                            <li><a href="pages-profile.html"><span class="fa fa-user"></span> Profile</a></li>
                            <li><a href="pages-address-book.html"><span class="fa fa-users"></span> Address Book</a></li>
                            <li class="xn-openable">
                                <ul>
                                    <li><a href="pages-timeline.html"><span class="fa fa-align-center"></span> Default</a></li>
                                    <li><a href="pages-timeline-simple.html"><span class="fa fa-align-justify"></span> Full Width</a></li>
                                </ul>
                            </li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-envelope"></span> Mailbox</a>
                                <ul>
                                    <li><a href="pages-mailbox-inbox.html"><span class="fa fa-inbox"></span> Inbox</a></li>
                                    <li><a href="pages-mailbox-message.html"><span class="fa fa-file-text"></span> Message</a></li>
                                    <li><a href="pages-mailbox-compose.html"><span class="fa fa-pencil"></span> Compose</a></li>
                                </ul>
                            </li>
                            <li><a href="pages-messages.html"><span class="fa fa-comments"></span> Messages</a></li>
                            <li><a href="pages-calendar.html"><span class="fa fa-calendar"></span> Calendar</a></li>
                            <li><a href="pages-tasks.html"><span class="fa fa-edit"></span> Tasks</a></li>
                            <li><a href="pages-content-table.html"><span class="fa fa-columns"></span> Content Table</a></li>
                            <li><a href="pages-faq.html"><span class="fa fa-question-circle"></span> FAQ</a></li>
                            <li><a href="pages-search.html"><span class="fa fa-search"></span> Search</a></li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-file"></span> Blog</a>
                                
                                <ul>                                    
                                    <li><a href="pages-blog-list.html"><span class="fa fa-copy"></span> List of Posts</a></li>
                                    <li><a href="pages-blog-post.html"><span class="fa fa-file-o"></span>Single Post</a></li>
                                </ul>
                            </li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-sign-in"></span> Login</a>
                                <ul>                                    
                                    <li><a href="pages-login.html">App Login</a></li>
                                    <li><a href="pages-login-website.html">Website Login</a></li>
                                    <li><a href="pages-login-website-light.html"> Website Login Light</a></li>
                                </ul>
                            </li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-warning"></span> Error Pages</a>
                                <ul>                                    
                                    <li><a href="pages-error-404.html">Error 404 Sample 1</a></li>
                                    <li><a href="pages-error-404-2.html">Error 404 Sample 2</a></li>
                                    <li><a href="pages-error-500.html"> Error 500</a></li>
                                </ul>
                            </li>                            
                        </ul>
                    </li>
                    <li class="xn-openable">
                        <a href="#"><span class="fa fa-files-o"></span> <span class="xn-text">Paie</span></a>
                        <ul>
                            <li><a href="formBanque"><span class="fa fa-bank"></span> Gestion des Banques</a></li>
                            <li><a href="pages-profile.html"><span class="fa fa-user"></span> Gestion des Profession</a></li>
                            <li><a href="pages-address-book.html"><span class="fa fa-tie"></span> Gestion des Salariés</a></li>
                          
                            
                          <li class="xn-openable">
                                <a href="#"><span class="fa fa-tasks"></span> Gestion des Paramètres Salariales et Patronales </a>
                                
                                <ul>                                    
                                    <li><a href="pages-blog-list.html"><span class="fa fa-copy"></span> AMO</a></li>
                                    <li><a href="pages-blog-post.html"><span class="fa fa-file-o"></span>IGR</a></li>
                                    <li><a href="pages-blog-post.html"><span class="fa fa-file-o"></span>Ancienneté</a></li>
                                    
                                </ul>
                          </li>
                      <li><a href="pages-address-book.html"><span class="fa fa-certificate"></span> Générer fiche de Paie</a></li>
                         
                         
                          
                           
                                                    
                        </ul>
                    </li>
                    
                </ul>
                <!-- END X-NAVIGATION -->
            </div>
            <!-- END PAGE SIDEBAR -->
            
            <!-- PAGE CONTENT -->
            <div class="page-content">
                
                <!-- START X-NAVIGATION VERTICAL -->
                <ul class="x-navigation x-navigation-horizontal x-navigation-panel">
                    <!-- TOGGLE NAVIGATION -->
                    <li class="xn-icon-button">
                        <a href="#" class="x-navigation-minimize"><span class="fa fa-dedent"></span></a>
                    </li>
                    <!-- END TOGGLE NAVIGATION -->
                    <!-- SEARCH -->
                    <li class="xn-search">
                        <form role="form">
                            <input type="text" name="search" placeholder="Search..."/>
                        </form>
                    </li>   
                    <!-- END SEARCH -->
                    <!-- SIGN OUT -->
                    <li class="xn-icon-button pull-right">
                        <a href="#" class="mb-control" data-box="#mb-signout"><span class="fa fa-sign-out"></span></a>                        
                    </li> 
                    <!-- END SIGN OUT -->
                    <!-- MESSAGES -->
                    <li class="xn-icon-button pull-right">
                        <a href="#"><span class="fa fa-comments"></span></a>
                        <div class="informer informer-danger">4</div>
                        <div class="panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging">
                            <div class="panel-heading">
                                <h3 class="panel-title"><span class="fa fa-comments"></span> Messages</h3>                                
                                <div class="pull-right">
                                    <span class="label label-danger">4 new</span>
                                </div>
                            </div>
                            <div class="panel-body list-group list-group-contacts scroll" style="height: 200px;">
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-online"></div>
                                    <img src="assets/images/users/user2.jpg" class="pull-left" alt="John Doe"/>
                                    <span class="contacts-title">John Doe</span>
                                    <p>Praesent placerat tellus id augue condimentum</p>
                                </a>
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-away"></div>
                                    <img src="assets/images/users/user.jpg" class="pull-left" alt="Dmitry Ivaniuk"/>
                                    <span class="contacts-title">Dmitry Ivaniuk</span>
                                    <p>Donec risus sapien, sagittis et magna quis</p>
                                </a>
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-away"></div>
                                    <img src="assets/images/users/user3.jpg" class="pull-left" alt="Nadia Ali"/>
                                    <span class="contacts-title">Nadia Ali</span>
                                    <p>Mauris vel eros ut nunc rhoncus cursus sed</p>
                                </a>
                                <a href="#" class="list-group-item">
                                    <div class="list-group-status status-offline"></div>
                                    <img src="assets/images/users/user6.jpg" class="pull-left" alt="Darth Vader"/>
                                    <span class="contacts-title">Darth Vader</span>
                                    <p>I want my money back!</p>
                                </a>
                            </div>     
                            <div class="panel-footer text-center">
                                <a href="pages-messages.html">Show all messages</a>
                            </div>                            
                        </div>                        
                    </li>
                    <!-- END MESSAGES -->
                    <!-- TASKS -->
                    <li class="xn-icon-button pull-right">
                        <a href="#"><span class="fa fa-tasks"></span></a>
                        <div class="informer informer-warning">3</div>
                        <div class="panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging">
                            <div class="panel-heading">
                                <h3 class="panel-title"><span class="fa fa-tasks"></span> Tasks</h3>                                
                                <div class="pull-right">
                                    <span class="label label-warning">3 active</span>
                                </div>
                            </div>
                            <div class="panel-body list-group scroll" style="height: 200px;">                                
                                <a class="list-group-item" href="#">
                                    <strong>Phasellus augue arcu, elementum</strong>
                                    <div class="progress progress-small progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%;">50%</div>
                                    </div>
                                    <small class="text-muted">John Doe, 25 Sep 2014 / 50%</small>
                                </a>
                                <a class="list-group-item" href="#">
                                    <strong>Aenean ac cursus</strong>
                                    <div class="progress progress-small progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">80%</div>
                                    </div>
                                    <small class="text-muted">Dmitry Ivaniuk, 24 Sep 2014 / 80%</small>
                                </a>
                                <a class="list-group-item" href="#">
                                    <strong>Lorem ipsum dolor</strong>
                                    <div class="progress progress-small progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="95" aria-valuemin="0" aria-valuemax="100" style="width: 95%;">95%</div>
                                    </div>
                                    <small class="text-muted">John Doe, 23 Sep 2014 / 95%</small>
                                </a>
                                <a class="list-group-item" href="#">
                                    <strong>Cras suscipit ac quam at tincidunt.</strong>
                                    <div class="progress progress-small">
                                        <div class="progress-bar" role="progressbar" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">100%</div>
                                    </div>
                                    <small class="text-muted">John Doe, 21 Sep 2014 /</small><small class="text-success"> Done</small>
                                </a>                                
                            </div>     
                            <div class="panel-footer text-center">
                                <a href="pages-tasks.html">Show all tasks</a>
                            </div>                            
                        </div>                        
                    </li>
                    <!-- END TASKS -->
                </ul>
                <!-- END X-NAVIGATION VERTICAL -->                     

                <!-- START BREADCRUMB -->
                <ul class="breadcrumb">
                    <li><a href="home">Home</a></li>                    
                    <li class="active">Géstion des primes et des heures suplémentaires</li>
                </ul>
                <!-- END BREADCRUMB -->  
                
                
                  <!-- Menu of search  -->
                
                
                <div class="page-content-wrap">
                
                    <div class="row">
                        <div class="col-md-12">
                            
                            <f:form class="form-horizontal" action="chercherPrimes">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title"><strong>Gérer les primes et les heures suplémentaires </strong> </h3>
                                    <ul class="panel-controls">
                                        <li><a href="#" class="panel-remove"><span class="fa fa-times"></span></a></li>
                                    </ul>
                                </div>
                      
                               
                                <div class="panel-body">                                                                        

                                 <div class="form-group">
                                                <label class="col-md-3 control-label">Profession</label>
                                                <div class="col-md-9">                                                                                            
                                                    
                                                       <select class="form-control select" path="profession" name="profession" id ="profession" >
												       <option value="">Choisir une Profession
												       </option>
												        <c:forEach items="${listeProfession}" var="p" >
												        <option value="${p.idProfession}">
												        ${p.nomProfession}</option>
												        </c:forEach>
												        </select>
												        <span class="help-block">Profession du salarié</span>
                                                </div>
                                   </div>
                                    
                              
                                </div>
                                <div class="panel-footer">
                                    <button class="btn btn-primary pull-right">Chercher</button>
                                </div>
                            </div>
                            </f:form>
                            
                        </div>
                    </div>                    
                    
                </div>
                
                
                <!-- End of menu search -->
                     
                
                
              <!-- My table -->    
                                    <c:if test="${not empty  modelSalarie}" >

              <!-- START RESPONSIVE TABLES -->
                    <div class="row">
                        <div class="col-md-12">
                            <div class="panel panel-default">

                                <div class="panel-heading">
                                    <h3 class="panel-title">Modifier les primes et les heures suplementaires des ${professionChoisie}s</h3>
                                    <ul class="panel-controls">
                                        <li><a href="#myModaltwo" data-toggle="modal" id="myBtn" data-target="#add-modal"><span class="fa fa-plus-square"></span></a></li>
                                        <li><a href="#" class="panel-collapse"><span class="fa fa-angle-down"></span></a></li>
                                        <li><a href="#" class="panel-refresh"><span class="fa fa-refresh"></span></a></li>
                                    </ul>  
                                </div>

                                <div class="panel-body panel-body-table">

                                    <div class="table-responsive">
                                    
                                        <table class="table table-bordered table-striped table-actions">
                                            <thead>
                                                <tr>
                                                    <th >Salariés</th>
                                                    
                                                    <th >Primes</th>
                                                </tr>
                                            </thead>
                                            <tbody>                                            
                                           
                                           
                                           <!-- Je me suis arrte ici -->       
                                                    
                                                    <c:forEach  items="${modelSalarie}" var="i" >
        												<tr>
       
														     <td><label path="nomSalarie" value="${i.n_fonc}" >${i.nom_fonc} ${i.prenom_fonc}</label></td>
														    
															 <td><a class="btn btn-default btn-rounded btn-sm"  data-toggle="modal" id="${i.n_fonc}" data-target="#edit-modal" ><span class="fa fa-pencil"></span></a>
														   
														     
														     </td>
														    
														    
													  </tr>
													  
													  </c:forEach>
													  
													 
                                      
                                            </tbody>
                                        </table>
                                       
                                       
                                       
             
    <!-- update 2 -->
    
    
    
        <!-- update 2 -->
    
    
    
    <div id="edit-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Modifier les heures supplémentaires et les primes :</h4>
                </div>          
              
              
              
              
              
                   <f:form method="post" name="form" action="validerUpdatePrimesSalarie" class="form-horizontal" >
       
       <table>
                                          <tr>
                                          <td>
						                 Mr/Mme <label id="nom" name="nom"/> 
						                  </td>		
						                  							
						                  </tr>
						                  
						                    <tr>
										    
										   <td>Nombre des heures supplémentaires lors des journées Feriés (Matin) :</td>
										      <td>
										    
										     <input type="text"  name="nombreHeureFerierMatin" id="nombreHeureFerierMatin" path="nombreHeureFerierMatin" class="form-control" />
										  </td>
										   
										   
										   </tr>
										   
										   <tr>
										    <tr>
										   
										   <td>Nombre des heures supplémentaires lors des journées Feriés (Soir) :</td>
										      <td>
										    
										     <input type="text"  name="nombreHeureFerierSoir" id="nombreHeureFerierSoir" path="nombreHeureFerierSoir" class="form-control" />
										  </td>
										   
										   
										   </tr>
										   <tr>
										   <td>Nombre des heures supplémentaires lors des journées Normaux (Matin) :</td>
										      <td>
										    
										     <input type="text"  name="nombreHeureNormalMatin" id="nombreHeureNormalMatin" path="nombreHeureNormalMatin" class="form-control" />
										  </td>
										   
										   
										   </tr>
										     <tr>
										   <td>Nombre des heures supplémentaires lors des journées  Normaux (Soir) :</td>
										      <td>
										    
										     <input type="text"  name="nombreHeureNormalSoir" id="nombreHeureNormalSoir" path="nombreHeureNormalSoir" class="form-control" />
										  </td>
										   
										   
										   </tr>
										  
										 <tr> 
										 <td> Primes: </td>
										 </tr>
							 
							      
										  <c:forEach items="${listePrimes}" var="i">
										  <tr>
										  <td>
										<!--  <input type="checkbox" path="items[${i.nomPrimeVariable}].selected" /> -->
										 
										  
										
										
										 <input  class="icheckbox" type="checkbox"   value="${i.idPrimeVariable}" name="primesv[]"  id="primesv[]"  path="primesv[]"/>
										 <c:out value='${i.nomPrimeVariable}' />
										
										
										</td>
										 </tr>
									
									 </c:forEach>
										 
   
                                         
                                       
										
										 <tr>
										    <td>
										    
										    
										            <input type="hidden" id="id" name="id" path="id"/>
										            <input type="submit" value="Valider"  class="btn btn-primary"/>
										            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
										   </td>
										    </tr>
										    </table>
		
       </f:form>
                     <!-- end my form -->
       
            </div>
        </div>
    </div>
			
			    
    <!-- end update  -->
        
			    
  
    						
                                       
                                    </div>                                

                                </div>
                            </div>                                                

                        </div>
                    </div>
                    <!-- END RESPONSIVE TABLES -->
              <!-- End of my table -->
                                                        </c:if>
                
            </div>            
            <!-- END PAGE CONTENT -->
        </div>
        <!-- END PAGE CONTAINER -->
        
        

        <!-- MESSAGE BOX-->
        <div class="message-box animated fadeIn" data-sound="alert" id="mb-signout">
            <div class="mb-container">
                <div class="mb-middle">
                    <div class="mb-title"><span class="fa fa-sign-out"></span> Log <strong>Out</strong> ?</div>
                    <div class="mb-content">
                        <p>Are you sure you want to log out?</p>                    
                        <p>Press No if youwant to continue work. Press Yes to logout current user.</p>
                    </div>
                    <div class="mb-footer">
                        <div class="pull-right">
                            <a href="pages-login.html" class="btn btn-success btn-lg">Yes</a>
                            <button class="btn btn-default btn-lg mb-control-close">No</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END MESSAGE BOX-->

        <!-- START PRELOADS -->
        <audio id="audio-alert" src="resources/audio/alert.mp3" preload="auto"></audio>
        <audio id="audio-fail" src="resources/audio/fail.mp3" preload="auto"></audio>
        <!-- END PRELOADS -->                  
        
    <!-- START SCRIPTS -->
        <!-- START PLUGINS -->
        <script type="text/javascript" src="resources/js/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="resources/js/plugins/jquery/jquery-ui.min.js"></script>
        <script type="text/javascript" src="resources/js/plugins/bootstrap/bootstrap.min.js"></script>        
        <!-- END PLUGINS -->

        <!-- START THIS PAGE PLUGINS-->        
        <script type='text/javascript' src='resources/js/plugins/icheck/icheck.min.js'></script>        
        <script type="text/javascript" src="resources/js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js"></script>
        <script type="text/javascript" src="resources/js/plugins/scrolltotop/scrolltopcontrol.js"></script>
        
        <script type="text/javascript" src="resources/js/plugins/morris/raphael-min.js"></script>
        <script type="text/javascript" src="resources/js/plugins/morris/morris.min.js"></script>       
        <script type="text/javascript" src="resources/js/plugins/rickshaw/d3.v3.js"></script>
        <script type="text/javascript" src="resources/js/plugins/rickshaw/rickshaw.min.js"></script>
        <script type='text/javascript' src='resources/js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js'></script>
        <script type='text/javascript' src='resources/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js'></script>                
        <script type='text/javascript' src='resources/js/plugins/bootstrap/bootstrap-datepicker.js'></script>                
        <script type="text/javascript" src="resources/js/plugins/owl/owl.carousel.min.js"></script>                 
        
        <script type="text/javascript" src="resources/js/plugins/moment.min.js"></script>
        <script type="text/javascript" src="resources/js/plugins/daterangepicker/daterangepicker.js"></script>
        <!-- END THIS PAGE PLUGINS-->        

        <!-- START TEMPLATE -->
        <script type="text/javascript" src="resources/js/settings.js"></script>
        
        <script type="text/javascript" src="resources/js/plugins.js"></script>        
        <script type="text/javascript" src="resources/js/actions.js"></script>
        
        <script type="text/javascript" src="resources/js/demo_dashboard.js"></script>
        <!-- END TEMPLATE -->
    <!-- END SCRIPTS -->    





<script>
        $('#edit-modal').on('show.bs.modal', function(e) {
        	
            var $modal = $(this),
                esseyId = e.relatedTarget.id;
            
        //	$modal.find('#idIgr').val('test');

            $.ajax({
                cache: false,
                type: 'GET',
                url: 'updatePrimesHeuresSup',
                data: {getId: esseyId},

                success: function(data) 
                {   
                
                	$modal.find('#id').val(data.n_fonc);
                	$('#prenom').html(data.prenom_fonc);
                	$('#nom').html(data.nom_fonc);
                	$('#nombreHeureFerierMatin').val(data.nombreHeureFerierMatin);
                	$('#nombreHeureFerierSoir').val(data.nombreHeureFerierSoir);
                	$('#nombreHeureNormalMatin').val(data.nombreHeureNormalMatin);
                	$('#nombreHeureNormalSoir').val(data.nombreHeureNormalSoir);
            

                	
                	

                    
                   $.ajax({
                        cache: false,
                        type: 'GET',
                        url: 'listePrimes',
                        success: function(d) 
                        {   

                        	for(var i =0; i<data.primesv.length ; i++)
                    		{
                        	var len = d.length;
                        	for ( var j = 0; j < len; j++)
                        		{

                    if((data.primesv[i].idPrimeVariable)==(d[j].idPrimeVariable)){
                         var k=data.primesv[i].idPrimeVariable;
                    	$('input:checkbox[value="'+k+'"]').attr('checked',true);
                    	

                        
                                                            }
                        		}
                		
                		
                		}
               }});
                		}
                		
                }
            );
            
        })
</script>       
  
</body>
</html>