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
</head>
<body>

<div id="myModal" class="modal">
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
</div>

</body>
