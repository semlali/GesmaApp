<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>la liste des véhicules </title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
   <script data-require="jquery@*" data-semver="2.0.3" src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
  <script data-require="bootstrap@*" data-semver="3.1.1" src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
  <link data-require="bootstrap-css@*" data-semver="3.1.1" rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
  <link rel="stylesheet" href="style.css" />
  <script src="script.js"></script>
</head>
<body>

<table> 
  <tr>

    <th>Roue</th>
    <th>Vitre</th>
    <th>Siege</th>
     <th>Carosserie</th>
     <th>Remarques</th>
  </tr>


  <tr>

    <td>${v.etat_roue}</td>
    <td>${v.etat_vitre}</td>
    <td>${v.etat_siege}</td>
    <td>${v.etat_carosserie}</td> 
    <td>${v.remarques}</td>
  </tr>
  <tr>


</table>  
<div><a href="#myModal" data-toggle="modal" id="1" data-target="#edit-modal">Edit 1</a></div>
  <div><a href="#myModal" data-toggle="modal" id="2" data-target="#edit-modal">Edit 2</a></div>
  <div><a href="#myModal" data-toggle="modal" id="3" data-target="#edit-modal">Edit 3</a></div>

  <div id="edit-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title" id="myModalLabel">Modal title</h4>
        </div>
        <div class="modal-body edit-content">
          ...
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Save changes</button>
        </div>
      </div>
    </div>
  </div>

  <script>
    $('#edit-modal').on('show.bs.modal', function(e) {

      var $modal = $(this),
        esseyId = e.relatedTarget.id;

      //            $.ajax({
      //                cache: false,
      //                type: 'POST',
      //                url: 'backend.php',
      //                data: 'EID='+essay_id,
      //                success: function(data) 
      //                {
      $modal.find('.edit-content').html(esseyId);
      //                }
      //            });

    })
  </script>


</body>
