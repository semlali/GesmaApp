<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Gesma</title>


<script type="text/javascript">
	function changeChauffeurProfesseur(obj) {
		var selectBox = obj;
		var selected = selectBox.options[selectBox.selectedIndex].value;
		var zone1 = document.getElementById("permis1");
		var zone2 = document.getElementById("permis2");
		var zone3 = document.getElementById("echel1");
		var zone4 = document.getElementById("echel2");

		if (selected == '3') {
			zone1.disabled = false;
			zone2.disabled = false;
			zone3.disabled = true;
			zone4.disabled = true;
		} else if (selected == '4') {
			zone3.disabled = false;
			zone4.disabled = false;
			zone1.disabled = true;
			zone2.disabled = true;
		} else {

			zone3.disabled = true;
			zone4.disabled = true;
			zone1.disabled = true;
			zone2.disabled = true;
		}
	}
	function changeContrat(obj) {
		var selectBox = obj;
		var selected = selectBox.options[selectBox.selectedIndex].value;
		var zone7 = document.getElementById("dateSortie");

		if (selected == '1') {
			zone7.disabled = false;

		}
		if (selected == '2') {
			zone7.disabled = true;

		}
	}

	function changeNationalite(obj) {

		var selectBox = obj;
		var selected = selectBox.options[selectBox.selectedIndex].value;

		var zone3 = document.getElementById("cin1");
		var zone4 = document.getElementById("cin2");
		var zone5 = document.getElementById("carte_sejour1");
		var zone6 = document.getElementById("carte_sejour2");
		if (selected == 'marocain(e)') {
			zone3.disabled = false;
			zone4.disabled = false;
			zone5.disabled = true;
			zone6.disabled = true;
		}
		if (selected == 'etrangere') {
			zone5.disabled = false;
			zone6.disabled = false;
			zone3.disabled = true;
			zone4.disabled = true;

		}

	}
</script>

<!-- META SECTION -->
<title>Atlant - Responsive Bootstrap Admin Template</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<link rel="icon" href="favicon.ico" type="resources/image/x-icon" />
<!-- END META SECTION -->

<!-- CSS INCLUDE -->
<link rel="stylesheet" type="text/css" id="theme"
	href="resources/css/theme-default.css" />
<!-- EOF CSS INCLUDE -->

</head>
<body>

	<!-- START PAGE CONTAINER -->
	<div class="page-container">

		<!-- START PAGE SIDEBAR -->
		<div class="page-sidebar">
			<!-- START X-NAVIGATION -->
			<ul class="x-navigation">
				<li class="xn-logo"><a href="">Gesma</a> <a href="#"
					class="x-navigation-control"></a></li>
				<li class="xn-profile"><a href="#" class="profile-mini"> <img
						src="resources/assets/images/users/avatar.jpg" alt="John Doe" />
				</a>
					<div class="profile">
						<div class="profile-image">
							<img src="resources/assets/images/users/avatar.jpg"
								alt="John Doe" />
						</div>
						<div class="profile-data">
							<div class="profile-data-name">John Doe</div>
							<div class="profile-data-title">Web Developer/Designer</div>
						</div>
						<div class="profile-controls">
							<a href="pages-profile.html" class="profile-control-left"><span
								class="fa fa-info"></span></a> <a href="pages-messages.html"
								class="profile-control-right"><span class="fa fa-envelope"></span></a>
						</div>
					</div></li>
				<li class="xn-title">Navigation</li>
				<li class="active"><a href="index.html"><span
						class="fa fa-desktop"></span> <span class="xn-text">Dashboard</span></a>
				</li>
				<li class="xn-openable"><a href="#"><span
						class="fa fa-files-o"></span> <span class="xn-text">Transport</span></a>
					<ul>
						<li><a href="pages-gallery.html"><span
								class="fa fa-image"></span> Gallery</a></li>
						<li><a href="pages-profile.html"><span class="fa fa-user"></span>
								Profile</a></li>
						<li><a href="pages-address-book.html"><span
								class="fa fa-users"></span> Address Book</a></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-clock-o"></span> Timeline</a>
							<ul>
								<li><a href="pages-timeline.html"><span
										class="fa fa-align-center"></span> Default</a></li>
								<li><a href="pages-timeline-simple.html"><span
										class="fa fa-align-justify"></span> Full Width</a></li>
							</ul></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-envelope"></span> Mailbox</a>
							<ul>
								<li><a href="pages-mailbox-inbox.html"><span
										class="fa fa-inbox"></span> Inbox</a></li>
								<li><a href="pages-mailbox-message.html"><span
										class="fa fa-file-text"></span> Message</a></li>
								<li><a href="pages-mailbox-compose.html"><span
										class="fa fa-pencil"></span> Compose</a></li>
							</ul></li>
						<li><a href="pages-messages.html"><span
								class="fa fa-comments"></span> Messages</a></li>
						<li><a href="pages-calendar.html"><span
								class="fa fa-calendar"></span> Calendar</a></li>
						<li><a href="pages-tasks.html"><span class="fa fa-edit"></span>
								Tasks</a></li>
						<li><a href="pages-content-table.html"><span
								class="fa fa-columns"></span> Content Table</a></li>
						<li><a href="pages-faq.html"><span
								class="fa fa-question-circle"></span> FAQ</a></li>
						<li><a href="pages-search.html"><span
								class="fa fa-search"></span> Search</a></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-file"></span> Blog</a>

							<ul>
								<li><a href="pages-blog-list.html"><span
										class="fa fa-copy"></span> List of Posts</a></li>
								<li><a href="pages-blog-post.html"><span
										class="fa fa-file-o"></span>Single Post</a></li>
							</ul></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-sign-in"></span> Login</a>
							<ul>
								<li><a href="pages-login.html">App Login</a></li>
								<li><a href="pages-login-website.html">Website Login</a></li>
								<li><a href="pages-login-website-light.html"> Website
										Login Light</a></li>
							</ul></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-warning"></span> Error Pages</a>
							<ul>
								<li><a href="pages-error-404.html">Error 404 Sample 1</a></li>
								<li><a href="pages-error-404-2.html">Error 404 Sample 2</a></li>
								<li><a href="pages-error-500.html"> Error 500</a></li>
							</ul></li>
					</ul></li>
				<li class="xn-openable"><a href="#"><span
						class="fa fa-files-o"></span> <span class="xn-text">Paiement</span></a>
					<ul>
						<li><a href="pages-gallery.html"><span
								class="fa fa-image"></span> Gallery</a></li>
						<li><a href="pages-profile.html"><span class="fa fa-user"></span>
								Profile</a></li>
						<li><a href="pages-address-book.html"><span
								class="fa fa-users"></span> Address Book</a></li>
						<li class="xn-openable">
							<ul>
								<li><a href="pages-timeline.html"><span
										class="fa fa-align-center"></span> Default</a></li>
								<li><a href="pages-timeline-simple.html"><span
										class="fa fa-align-justify"></span> Full Width</a></li>
							</ul>
						</li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-envelope"></span> Mailbox</a>
							<ul>
								<li><a href="pages-mailbox-inbox.html"><span
										class="fa fa-inbox"></span> Inbox</a></li>
								<li><a href="pages-mailbox-message.html"><span
										class="fa fa-file-text"></span> Message</a></li>
								<li><a href="pages-mailbox-compose.html"><span
										class="fa fa-pencil"></span> Compose</a></li>
							</ul></li>
						<li><a href="pages-messages.html"><span
								class="fa fa-comments"></span> Messages</a></li>
						<li><a href="pages-calendar.html"><span
								class="fa fa-calendar"></span> Calendar</a></li>
						<li><a href="pages-tasks.html"><span class="fa fa-edit"></span>
								Tasks</a></li>
						<li><a href="pages-content-table.html"><span
								class="fa fa-columns"></span> Content Table</a></li>
						<li><a href="pages-faq.html"><span
								class="fa fa-question-circle"></span> FAQ</a></li>
						<li><a href="pages-search.html"><span
								class="fa fa-search"></span> Search</a></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-file"></span> Blog</a>

							<ul>
								<li><a href="pages-blog-list.html"><span
										class="fa fa-copy"></span> List of Posts</a></li>
								<li><a href="pages-blog-post.html"><span
										class="fa fa-file-o"></span>Single Post</a></li>
							</ul></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-sign-in"></span> Login</a>
							<ul>
								<li><a href="pages-login.html">App Login</a></li>
								<li><a href="pages-login-website.html">Website Login</a></li>
								<li><a href="pages-login-website-light.html"> Website
										Login Light</a></li>
							</ul></li>
						<li class="xn-openable"><a href="#"><span
								class="fa fa-warning"></span> Error Pages</a>
							<ul>
								<li><a href="pages-error-404.html">Error 404 Sample 1</a></li>
								<li><a href="pages-error-404-2.html">Error 404 Sample 2</a></li>
								<li><a href="pages-error-500.html"> Error 500</a></li>
							</ul></li>
					</ul></li>
				<li class="xn-openable"><a href="#"><span
						class="fa fa-files-o"></span> <span class="xn-text">Paie</span></a>
					<ul>
						<li><a href="formBanque"><span class="fa fa-bank"></span>
								Gestion des Banques</a></li>
						<li><a href="pages-profile.html"><span class="fa fa-user"></span>
								Gestion des Profession</a></li>
						<li><a href="pages-address-book.html"><span
								class="fa fa-tie"></span> Gestion des Salariés</a></li>


						<li class="xn-openable"><a href="#"><span
								class="fa fa-tasks"></span> Gestion des Paramètres Salariales et
								Patronales </a>

							<ul>
								<li><a href="pages-blog-list.html"><span
										class="fa fa-copy"></span> AMO</a></li>
								<li><a href="pages-blog-post.html"><span
										class="fa fa-file-o"></span>IGR</a></li>
								<li><a href="pages-blog-post.html"><span
										class="fa fa-file-o"></span>Ancienneté</a></li>

							</ul></li>
						<li><a href="pages-address-book.html"><span
								class="fa fa-certificate"></span> Générer fiche de Paie</a></li>





					</ul></li>

			</ul>
			<!-- END X-NAVIGATION -->
		</div>
		<!-- END PAGE SIDEBAR -->

		<!-- PAGE CONTENT -->
		<div class="page-content">

			<!-- START X-NAVIGATION VERTICAL -->
			<ul class="x-navigation x-navigation-horizontal x-navigation-panel">
				<!-- TOGGLE NAVIGATION -->
				<li class="xn-icon-button"><a href="#"
					class="x-navigation-minimize"><span class="fa fa-dedent"></span></a>
				</li>
				<!-- END TOGGLE NAVIGATION -->
				<!-- SEARCH -->
				<li class="xn-search">
					<form role="form">
						<input type="text" name="search" placeholder="Search..." />
					</form>
				</li>
				<!-- END SEARCH -->
				<!-- SIGN OUT -->
				<li class="xn-icon-button pull-right"><a href="#"
					class="mb-control" data-box="#mb-signout"><span
						class="fa fa-sign-out"></span></a></li>
				<!-- END SIGN OUT -->
				<!-- MESSAGES -->
				<li class="xn-icon-button pull-right"><a href="#"><span
						class="fa fa-comments"></span></a>
					<div class="informer informer-danger">4</div>
					<div
						class="panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging">
						<div class="panel-heading">
							<h3 class="panel-title">
								<span class="fa fa-comments"></span> Messages
							</h3>
							<div class="pull-right">
								<span class="label label-danger">4 new</span>
							</div>
						</div>
						<div class="panel-body list-group list-group-contacts scroll"
							style="height: 200px;">
							<a href="#" class="list-group-item">
								<div class="list-group-status status-online"></div> <img
								src="assets/images/users/user2.jpg" class="pull-left"
								alt="John Doe" /> <span class="contacts-title">John Doe</span>
								<p>Praesent placerat tellus id augue condimentum</p>
							</a> <a href="#" class="list-group-item">
								<div class="list-group-status status-away"></div> <img
								src="assets/images/users/user.jpg" class="pull-left"
								alt="Dmitry Ivaniuk" /> <span class="contacts-title">Dmitry
									Ivaniuk</span>
								<p>Donec risus sapien, sagittis et magna quis</p>
							</a> <a href="#" class="list-group-item">
								<div class="list-group-status status-away"></div> <img
								src="assets/images/users/user3.jpg" class="pull-left"
								alt="Nadia Ali" /> <span class="contacts-title">Nadia Ali</span>
								<p>Mauris vel eros ut nunc rhoncus cursus sed</p>
							</a> <a href="#" class="list-group-item">
								<div class="list-group-status status-offline"></div> <img
								src="assets/images/users/user6.jpg" class="pull-left"
								alt="Darth Vader" /> <span class="contacts-title">Darth
									Vader</span>
								<p>I want my money back!</p>
							</a>
						</div>
						<div class="panel-footer text-center">
							<a href="pages-messages.html">Show all messages</a>
						</div>
					</div></li>
				<!-- END MESSAGES -->
				<!-- TASKS -->
				<li class="xn-icon-button pull-right"><a href="#"><span
						class="fa fa-tasks"></span></a>
					<div class="informer informer-warning">3</div>
					<div
						class="panel panel-primary animated zoomIn xn-drop-left xn-panel-dragging">
						<div class="panel-heading">
							<h3 class="panel-title">
								<span class="fa fa-tasks"></span> Tasks
							</h3>
							<div class="pull-right">
								<span class="label label-warning">3 active</span>
							</div>
						</div>
						<div class="panel-body list-group scroll" style="height: 200px;">
							<a class="list-group-item" href="#"> <strong>Phasellus
									augue arcu, elementum</strong>
								<div class="progress progress-small progress-striped active">
									<div class="progress-bar progress-bar-danger"
										role="progressbar" aria-valuenow="50" aria-valuemin="0"
										aria-valuemax="100" style="width: 50%;">50%</div>
								</div> <small class="text-muted">John Doe, 25 Sep 2014 / 50%</small>
							</a> <a class="list-group-item" href="#"> <strong>Aenean
									ac cursus</strong>
								<div class="progress progress-small progress-striped active">
									<div class="progress-bar progress-bar-warning"
										role="progressbar" aria-valuenow="80" aria-valuemin="0"
										aria-valuemax="100" style="width: 80%;">80%</div>
								</div> <small class="text-muted">Dmitry Ivaniuk, 24 Sep 2014 /
									80%</small>
							</a> <a class="list-group-item" href="#"> <strong>Lorem
									ipsum dolor</strong>
								<div class="progress progress-small progress-striped active">
									<div class="progress-bar progress-bar-success"
										role="progressbar" aria-valuenow="95" aria-valuemin="0"
										aria-valuemax="100" style="width: 95%;">95%</div>
								</div> <small class="text-muted">John Doe, 23 Sep 2014 / 95%</small>
							</a> <a class="list-group-item" href="#"> <strong>Cras
									suscipit ac quam at tincidunt.</strong>
								<div class="progress progress-small">
									<div class="progress-bar" role="progressbar"
										aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"
										style="width: 100%;">100%</div>
								</div> <small class="text-muted">John Doe, 21 Sep 2014 /</small><small
								class="text-success"> Done</small>
							</a>
						</div>
						<div class="panel-footer text-center">
							<a href="pages-tasks.html">Show all tasks</a>
						</div>
					</div></li>
				<!-- END TASKS -->
			</ul>
			<!-- END X-NAVIGATION VERTICAL -->

			<!-- START BREADCRUMB -->
			<ul class="breadcrumb">
				<li><a href="home">Home</a></li>
				<li class="active">Gestion des salaries</li>
			</ul>
			<!-- END BREADCRUMB -->



			<!-- PAGE CONTENT WRAPPER -->

			<!-- PAGE CONTENT WRAPPER -->
			<div class="page-content-wrap">

				<div class="row">
					<div class="col-md-12">


						<f:form method="POST" action="ajoutSalarie" modelAttribute="salarieModel" class="form-horizontal">

							<div class="panel panel-default">
								<div class="panel-heading">
									<h3 class="panel-title">
										<strong>Ajouter un salarié</strong>
									</h3>
									<ul class="panel-controls">
										<li><a href="#" class="panel-remove"><span
												class="fa fa-times"></span></a></li>
									</ul>


									<c:if test="${message}">
										<div class="alert alert-success">
											<strong>Success!</strong> Ajout effectué avec succées .
										</div>
									</c:if>

								</div>


								<div class="panel-body">

									<div class="row">

										<div class="col-md-6">

											<div class="form-group">
												<label class="col-md-3 control-label">Matricule</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span class="fa fa-pencil"></span></span> 
														<input path="matricule"
															name="matricule" class="form-control" required="required" />
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Nom</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="nom"
															name="nom_fonc" class="form-control" required="required" />
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Prénom</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="prenom_fonc"
															name="prenom_fonc" class="form-control"
															required="required" />
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Telephone</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-phone"></span></span> <input path="telephone"
															name="telephone" class="form-control" required="required" />

													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Lieu Naissance</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="lieu_naissance"
															name="lieu_naissance" class="form-control"
															required="required" />

													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Ville de
													residence </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="ville"
															name="ville" required="required" class="form-control" />
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Nationalité</label>
												<div class="col-md-9">

													<select class="form-control select" name="nationalite"
														id="nationalite" onchange="changeNationalite(this)"
														required="required">
														<option value="marocain(e)">Marocain(e)</option>
														<option value="etrangere">Etrangère</option>
													</select>
												</div>
											</div>


											<div class="form-group">
												<label class="col-md-3 control-label" id="carte_sejour1">
													N° carte séjour</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="carte_sejour"
															name="carte_sejour" id="carte_sejour2"
															class="form-control" required="required" />

													</div>
												</div>
											</div>


											<div class="form-group">
												<label class="col-md-3 control-label">Password</label>
												<div class="col-md-9 col-xs-12">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-unlock-alt"></span></span> 
															<input id="password" type="password" path="pass" name="pass"  class="form-control"/>
													        <span class="help-block">Required, min size = 5, max size = 10</span>
													
													</div>

												</div>
											</div>


											<div class="form-group">
												<label class="col-md-3 control-label">Situation</label>
												<div class="col-md-9">

													<select class="form-control select"
														name="situation_familiale" id="situation_familiale">
														<option value="veuve">Veuve</option>
														<option value="marie(e)">Marié(e)</option>
														<option value="celibataire">Celibataire</option>
														<option value="divorce(e)">Divorcé(e)</option>

													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Nbr Enfants</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="nbr_enfants"
															name="nbr_enfants" class="form-control"
															required="required" />
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">N° CNSS </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="cnss"
															name="numCnss" class="form-control" required="required" />
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Profession</label>
												<div class="col-md-9">

													<select class="form-control select" name="idProfession"
														id="fonction" onchange="changeChauffeurProfesseur(this)">
														<c:forEach items="${listeProfession}" var="p">
															<option value="${p.idProfession}">
																${p.nomProfession}</option>
														</c:forEach>
													</select>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Date d'entrée</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-calendar"></span></span> <input type="date"
															path="dateEntree" name="dateEntree" required="required"
															class="form-control datepicker" />

													</div>
												</div>
											</div>


											<div class="form-group">
												<label class="col-md-3 control-label" id="permis1">
													N° Permis de conduite </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-car"></span></span> <input name="numero_de_permis"
															type="text" id="permis2" class="form-control"
															required="required" />

													</div>
												</div>
											</div>


											<div class="form-group">
												<label class="col-md-3 control-label"> Categorie du
													salaire </label>
												<div class="col-md-9">
													<select class="form-control select" name="categorieSalaire"
														id="categorieSalaire">
														<option value="mensuel">Mensuel</option>
													</select>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label"> Salaire de
													base </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input type="text"
															path="salaireBase" name="salaireBase"
															class="form-control" required="required" />

													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label"> Taux frais
													Professionnels </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input type="text"
															path="frais_professionnels" name="frais_professionnels"
															class="form-control" required="required" />

													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label"> Agence </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="agenceBancaire"
															name="agenceBancaire" type="text" class="form-control"
															required="required" />

													</div>
												</div>
											</div>

										</div>
										<div class="col-md-6">

											<div class="form-group">
												<label class="col-md-3 control-label">Sexe</label>
												<div class="col-md-9">
													<select class="form-control select" name="sexe">
														<option value="feminin">Feminin</option>
														<option value="masculin">Masculin</option>
													</select>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Nom arabe</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="nom_fonc_ara"
															name="nom_fonc_ara" class="form-control"
															required="required" />
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Prénom arabe </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input
															path="prenom_fonc_ara" name="prenom_fonc_ara"
															class="form-control" required="required" />
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">E-mail</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa  fa-envelope-o"></span></span> <input type="email"
															path="email" name="email" class="form-control"
															required="required" />

													</div>
												</div>
											</div>



											<div class="form-group">
												<label class="col-md-3 control-label">Date Naissance</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-calendar"></span></span> <input type="date"
															path="date" name="date_naissance" required="required"
															class="form-control datepicker">
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Adresse </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="adresse"
															name="adresse" class="form-control" />
													</div>
												</div>
											</div>



											<div class="form-group">
												<label class="col-md-3 control-label" id="cin1"> CIN</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="cin" name="cin"
															id="cin2" class="form-control" required="required" />

													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label"> Login</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> 
															<input path="login"
															name="login" class="form-control" required="required" />
																<span class="help-block">min size = 2, max size = 8</span>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Confirmation de Password</label>
												<div class="col-md-9 col-xs-12">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-unlock-alt"></span></span> 
															<input type="password" path="pass" name="pass" class="form-control"/>
													        <span class="help-block">Required, equals Password</span>
													
													</div>

												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Photo</label>
												<div class="col-md-9">
													<input type="file" accept="image/*"
														class="fileinput btn-primary" />
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">N° CIMR </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="numCimr"
															name="numCimr" class="form-control" required="required" />
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label" id="cin1"> N°
													Mutuelle </label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input name="numMutuelle"
															class="form-control" required="required" />

													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Type contrat</label>
												<div class="col-md-9">


													<select class="form-control select" name="idTypeContrat"
														id="idTypeContrat" onchange="changeContrat(this)">
														<c:forEach items="${listeTypeContrat}" var="c">
															<option value="${c.idTypeContrat}">${c.nomType}</option>
														</c:forEach>
													</select>
												</div>

											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Date de sortie</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-calendar"></span></span> <input type="date"
															path="date" path="dateSortie" name="dateSortie"
															id="dateSortie" required="required"
															class="form-control datepicker" />
													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label" id="echel1">
													Echel</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input name="echel"
															id="echel2" type="text" class="form-control"
															required="required" />

													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label"> Mode
													réglement </label>
												<div class="col-md-9">

													<select class="form-control select" name="modeRegelement"
														id="modeRegelement">
														<option value="virement">Virement</option>
														<option value="cheque">Chèque</option>
														<option value="espece">Espèce</option>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="col-md-3 control-label">Banque</label>
												<div class="col-md-9">

													<select name="idbanque" id="banque"
														class="form-control select">
														<c:forEach items="${listeBanque}" var="b">
															<option value="${b.idBanque}">${b.nomBanque}</option>
														</c:forEach>
													</select>
												</div>
											</div>


											<div class="form-group">
												<label class="col-md-3 control-label"> N° de compte</label>
												<div class="col-md-9">
													<div class="input-group">
														<span class="input-group-addon"><span
															class="fa fa-pencil"></span></span> <input path="compteBancaire"
															name="compteBancaire" type="text" class="form-control"
															required="required" />

													</div>
												</div>
											</div>

											<div class="form-group">
												<label class="col-md-3 control-label">Exoneration</label>
												<div class="col-md-9">
													<label class="check"><input type="checkbox"
														class="icheckbox" checked="checked" name="ExoAmo"
														value="amo" /> Exonéré AMO </label> <label class="check"><input
														type="checkbox" class="icheckbox" checked="checked"
														name="ExoCnss" value="cnss" /> Exonéré CNSS </label> <label
														class="check"><input type="checkbox"
														class="icheckbox" checked="checked" name="ExoIr"
														value="ir" /> Exonéré IR </label>

												</div>
											</div>
										</div>

									</div>

								</div>
								<div class="panel-footer">


									<input path="" type="submit" value="Enregistrer"
										class="btn btn-primary pull-right" /> <input type="reset"
										value="Clean" path="" class="btn btn-primary pull-left" />

								</div>
							</div>
						</f:form>

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
				<div class="mb-title">
					<span class="fa fa-sign-out"></span> Log <strong>Out</strong> ?
				</div>
				<div class="mb-content">
					<p>Are you sure you want to log out?</p>
					<p>Press No if youwant to continue work. Press Yes to logout
						current user.</p>
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
	<script type="text/javascript"
		src="resources/js/plugins/jquery/jquery.min.js"></script>
	<script type="text/javascript"
		src="resources/js/plugins/jquery/jquery-ui.min.js"></script>
	<script type="text/javascript"
		src="resources/js/plugins/bootstrap/bootstrap.min.js"></script>
	<!-- END PLUGINS -->

	<!-- START THIS PAGE PLUGINS-->
	<script type='text/javascript'
		src='resources/js/plugins/icheck/icheck.min.js'></script>
	<script type="text/javascript"
		src="resources/js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js"></script>
	<script type="text/javascript"
		src="resources/js/plugins/scrolltotop/scrolltopcontrol.js"></script>

	<script type="text/javascript"
		src="resources/js/plugins/morris/raphael-min.js"></script>
	<script type="text/javascript"
		src="resources/js/plugins/morris/morris.min.js"></script>
	<script type="text/javascript"
		src="resources/js/plugins/rickshaw/d3.v3.js"></script>
	<script type="text/javascript"
		src="resources/js/plugins/rickshaw/rickshaw.min.js"></script>
	<script type='text/javascript'
		src='resources/js/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js'></script>
	<script type='text/javascript'
		src='resources/js/plugins/jvectormap/jquery-jvectormap-world-mill-en.js'></script>
	<script type='text/javascript'
		src='resources/js/plugins/bootstrap/bootstrap-datepicker.js'></script>
	<script type="text/javascript"
		src="resources/js/plugins/owl/owl.carousel.min.js"></script>

	<script type="text/javascript" src="resources/js/plugins/moment.min.js"></script>
	<script type="text/javascript"
		src="resources/js/plugins/daterangepicker/daterangepicker.js"></script>
	<!-- END THIS PAGE PLUGINS-->

	<!-- START TEMPLATE -->
	<script type="text/javascript" src="resources/js/settings.js"></script>

	<script type="text/javascript" src="resources/js/plugins.js"></script>
	<script type="text/javascript" src="resources/js/actions.js"></script>

	<script type="text/javascript" src="resources/js/demo_dashboard.js"></script>
	<!-- END TEMPLATE -->
	<!-- END SCRIPTS -->

</body>
</html>