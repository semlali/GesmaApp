<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>tous les chauffeurs </title>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}
</style>
 <style>
.dropbtn {
    background-color: grey;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}
</style>
</head>
<body>
<h2></h2>
<table>
<f:form action="ajouterChauffeur">
  <tr>
    <th>Nom</th>
    <th>Prénom</th>
    <th>Adresse</th>  
    <th></th>
    <th></th>
  </tr>
   <tr>
   <td><button class="dropbtn" >Ajouter chauffeur</button></td>
   </tr>
  </f:form>
</table>

</body>
</html>