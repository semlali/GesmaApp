
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>

<html lang="fr">
    <head>        
   <!-- META SECTION -->
        <title>Gestion des chauffeurs</title>            
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        
        <link rel="icon" href="favicon.ico" type="image/x-icon" />
        <!-- END META SECTION -->
        
        <!-- CSS INCLUDE -->        
        <link rel="stylesheet" type="text/css" id="theme" href="resources/css/theme-default.css"/>
        <!-- EOF CSS INCLUDE -->                                    
    </head>
    <body onload="initialize()" onunload="GUnload()">
        <!-- START PAGE CONTAINER -->
        <div class="page-container">
            
            <!-- START PAGE SIDEBAR -->
            <div class="page-sidebar">
                <!-- START X-NAVIGATION -->
                <ul class="x-navigation">
                    <li class="xn-logo">
                        <a href="">GESMA</a>
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
                                <div class="profile-data-name">Client</div>
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
                        <a href=" "><span class="fa fa-road"></span> <span class="xn-text">Transport</span></a>
                        <ul>
                             <li class="xn-openable">
                             <a href=""><span class="fa fa-car"></span>Gestion des Vehicules</a>
                                 <ul>
                                 <li><a href="GestionVehicules"><span class="fa fa-car"></span>Consulter les vehicules </a></li>
                                    <li><a href="AjouterVehicule"><span class="fa fa-plus"></span>Ajouter un vehicule </a></li>
                                    <li><a href="chercherVehicule"><span class="fa fa-search"></span>Chercher un vehicule</a></li>
                                </ul>
                                </li>
                                     <li class="xn-openable">
                              <a href="GestionEtablissements"><span class="fa fa-building-o"></span> Gestion des �tablissements </a>
                             
                              </li>
                              <li class="xn-openable">
                              <a href="GestionChauffeurs"><span class="fa fa-users"></span> Gestion des Chauffeurs</a>
                              
                              </li>
                              
                               <li class="xn-openable">
                               <a href="pages-address-book.html"><span class="fa fa-users"></span> Gesiton des �tudiants</a>
                                <ul>
                                 <li><a href="GestionEtudiants"><span class="fa fa-users"></span>Afficher tous les �tudiants </a></li>
                                    
                                </ul>
                               </li>
                                
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-road"></span>Gestion des circuits</a>
                                <ul>
                                    <li><a href="pages-timeline.html"><span class="fa fa-align-center"></span></a></li>
                                    <li><a href="pages-timeline-simple.html"><span class="fa fa-align-justify"></span> Full Width</a></li>
                                </ul>
                            </li>
                            <li class="xn-openable">
                                <a href="#"><span class="fa fa-minus-circle"></span>  Gestion des arr�ts </a>  
                            </li>
                           
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
                        <a href="#"><span class="fa fa-files-o"></span> <span class="xn-text">Paie</span></a>
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
                    <li><a href="#">Transport</a></li>                    
                    <li class="active">Gestion des chauffeurs</li>
                </ul>
                <!-- END BREADCRUMB -->                       
                
                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">
                <div class="row">
                                             
                        <div class="col-md-12">
                            <div class="panel panel-default">
                     
                                <div class="panel-heading">
                           <h3 class="panel-title">La liste de tous les chauffeurs de l'�tablissement :</h3>
                                </div>

                                <div class="panel-body panel-body-table">

                                    <div class="table-responsive">
                                        <table class="table table-bordered table-striped table-actions">
                                            <thead>
                                                <tr>
                                                    <th width="50">id</th>
                                                
                                                    <th width="200">Nom </th>
                                                    <th width="300">Pr�nom </th>
                                                    <th width="200">t�l�phone  </th>
                                                  
                                                    <th>actions</th>
                                                </tr>
                                            </thead>
                                            <tbody> 
                                            <c:forEach  items="${chauffeurs}" var="c">        

                                   
                                                <tr>
                                                  
                                                    <td><strong>${c.n_fonc}</strong></td>
                                                    <td>${c.nom_fonc}</td>
                                                    <td>${c.prenom_fonc}</td> 
                                                    <td>${c.telephone}</td>
                                                    
                                                   
                                                    <td>      
                                                         <a class="btn btn-default btn-rounded btn-sm"  data-toggle="modal" id="${c.n_fonc}" data-target="#edit-modal" ><span class="fa fa-pencil"></span></a>
                                                         <a href="SupprimerFonc?id_fonc=${c.n_fonc}" class="btn btn-danger btn-rounded btn-sm" onclick="return confirm('Are you sure you want to delete?')"><span class="fa fa-times"></span></a>
                                                         <a class="btn btn-default btn-rounded btn-sm"  data-toggle="modal" id="${c.n_fonc}" data-target="#affectation-modal" >affecter une v�hicule </a>
                                                           
                                                    </td>
                                                </tr>
                                               </c:forEach>
                                         </tbody>
                                     </table>
                        </div>
                </div>
                </div>
                </div>
                </div>
                <!-- END PAGE CONTENT WRAPPER -->                                
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
                        <p>Press No if you want to continue work. Press Yes to logout current user.</p>
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
        <audio id="audio-alert" src="audio/alert.mp3" preload="auto"></audio>
        <audio id="audio-fail" src="audio/fail.mp3" preload="auto"></audio>
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
          <!-- modal update -->
         <div id="edit-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Modifier les informations d'un v�hicule : </label></h4>
                        <f:form action="Modifier" modelAttribute="vehicule"  method="POST"  class="form-horizontal">
          
                             
                        
                      <div class="panel-body form-group-separated">
                            <div class="form-group" >
                                        <label class="col-md-3 col-xs-12 control-label">Num�ro d'immatriculation :</label>
                                        <div class="col-md-6 col-xs-12">                                            
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                <input type="text" class="form-control" name="numImmatriculation" id="numI"/>
                                            </div>                                            
                                         
                                        </div>
                                    </div>
                                   <div class="form-group">                                        
                                       <label class="col-md-3 col-xs-12 control-label">La date de mise en service :</label>
                                        <div class="col-md-6 col-xs-12">
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                
                                                <input type="text" class="form-control datepicker" name="dateMiseEnService" id="dateM" />                                               
                                            </div>
                                       
                                        </div>
                                    </div>
                                       <div class="form-group">
                                      <label class="col-md-3 col-xs-12 control-label">Nombre des ann�es de service :</label>
                                        <div class="col-md-6 col-xs-12">                                            
                                            <div class="input-group">
                                                <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                               <input type="text" class="form-control" name="nbreAnneeService" id="nbreA"/>
                                            </div>                                            
                                         
                                        </div>
                                    </div>
                                   <div class="form-group">
                                        <label class="col-md-3 col-xs-12 control-label">Le poids total  :</label>
                                        <div class="col-md-6 col-xs-12">                                            
                                            <div class="input-group">
                                               <span class="input-group-addon">
                                             <span class="fa fa-pencil"></span></span>
                                               <input type="text" class="form-control" name="poids_total" id="poi"/>
                                            </div>                                            
                                         
                                        </div>
                                    </div>

 
                               <div class="form-group">
                                <label class="col-md-3 col-xs-12 control-label">Roue  :</label>
                                 <div class="col-md-6 col-xs-12">                                            
                                            <div class="input-group">
                                             
                                           
                                          <select  name="etat_roue" id="etatR">
                                            <option id="1">Neuf</option>
                                            <option id="2">moyen</option>
                                            <option id="3">mauvais</option>
                                            </select>
                                            </div>                                            
                                         
                                        </div>
                               
                               </div>
                               <div class="form-group">
                                        <label class="col-md-3 col-xs-12 control-label">Vitre</label>
                                        <div class="col-md-6 col-xs-12">                     

                                                                       
                                            <select  name="etat_vitre" id="etatV">
                                            <option id="1">Neuf</option>
                                            <option id="2">moyen</option>
                                            <option id="3">mauvais</option>
                                            </select>
                                           
                                        </div>
                                    </div>
 
                                    <div class="form-group">
                                        <label class="col-md-3 col-xs-12 control-label">Siege</label>
                                        <div class="col-md-6 col-xs-12">                     

                                                                       
                                            <select  name="etat_siege" id="etatS">
                                            <option id="1">Neuf</option>
                                            <option id="2">moyen</option>
                                            <option id="3">mauvais</option>
                                            </select>
                                           
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 col-xs-12 control-label">Carosserie</label>
                                        <div class="col-md-6 col-xs-12">                     

                                                                       
                                            <select   name="etat_carosserie" id="etatC">
                                            <option id="1">Neuf</option>
                                            <option id="2">moyen</option>
                                            <option id="3">mauvais</option>
                                            </select>
                                           
                                        </div>
                                    </div>
 
                                   <div class="form-group">
                                        <label class="col-md-3 col-xs-12 control-label">Remarques :</label>
                                        <div class="col-md-6 col-xs-12">                     

                       
                                            <textarea class="form-control" rows="5" name="remarques" id="rem"></textarea>
                                        
                                        </div>
                                    </div>
                                   <td><input type='hidden' id="id" name="id_vehicule"/></td>
 
          <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Annuler</button>
                    <button type="submit" class="btn btn-primary">Enregistrer</button>
                </div>
                            </div>
       </f:form>
                </div>
                
            </div>
        </div>
    </div>
    <!-- end modal update -->
<!-- start modal d'affectation de vehicule -->
<div id="affectation-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Veuillez choisir une v�hicule </h4>
                     <div class="panel-body" align="center"> 
                     <f:form action="AffecterVehicule"  method="POST"  >
                     <select id="vehicules"  name="numImmatriculation">
                     </select>
                     <br><br>
                     <input type='hidden' id="idFonc" name="n_fonc"/>
                     <button type="submit" class="btn btn-primary">Enregistrer</button>
                     </f:form>
                     </div> 
                     </div>
                     </div>
                     </div>
                     </div>
<!-- end of modal de v�rification -->

 <script>
          
        $('#affectation-modal').on('show.bs.modal', function(e) {
        	  var $modal = $(this),
              IdFonc = e.relatedTarget.id;
       $.ajax({
         cache: false,
         type: 'POST',
         url: 'affectationVehicule',
         data: 'EID='+IdFonc,
         success:  function(data) {
        	 
        	 var html= ' <option value=""> veuiller choisir le num�ro immatriculation</option>';
        	 var len = data.length;
        	 for ( var i = 0; i < len; i++) {
        	 html += '<option value="' +data[i].numImmatriculation + '">'
        	 +  data[i].numImmatriculation + '</option>';
        	 }
        	 html += '</option>';
        	 $('#vehicules').html(html);
        	$('#idFonc').val(IdFonc);
         }
       });
       
        })
    
    </script> 

     <script>
          
        $('#edit-modal').on('show.bs.modal', function(e) {
      var $modal = $(this),
                esseyId = e.relatedTarget.id;
           
       $.ajax({
         cache: false,
         type: 'POST',
         url: 'ModifierVehicule',
         data: 'EID='+esseyId,
         success: function(data) 
         {
   
              $modal.find("#numI").val(data.numImmatriculation);
              $("#nbreA").val(data.nbreAnneeService);
              $("#poi").val(data.poids_total);
              $("#etatR").val(data.etat_roue);
              $("#etatS").val(data.etat_siege);
              $("#etatV").val(data.etat_vitre);
              $("#etatC").val(data.etat_carosserie);
              $("#rem").val(data.remarques);
              $("#id").val(data.id_vehicule);
              $("#dateM").val((data.dateMiseEnService).toString('M-d-yyyy'));
           
          
         }
       });
      })
     
    </script>      
    <!-- END SCRIPTS -->         
    </body>
</html>





