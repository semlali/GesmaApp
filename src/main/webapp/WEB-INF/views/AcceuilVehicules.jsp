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
body, #mainWrapper {
    height: 100%;
    background-color:rgb(245, 245, 245);
}
 
body, .form-control{
    font-size:12px!important;
}
 
.floatRight{
    float:right;
    margin-right: 18px;
}
 
.has-error{
    color:red;
}
 
.generic-container {
  position:fixed;
  width:80%;
  margin-left: 20px;
  margin-top: 20px;
  margin-bottom: 20px;
  padding: 20px;
  background-color: #EAE7E7;
  border: 1px solid #ddd;
  border-radius: 4px;
  box-shadow: 0 0 30px black;
}
 
.custom-width {
    width: 80px !important;
}
</style>
</head>
<body>
<h2></h2>
<table> 
<tr><td> message : ${success} </td></tr>
<tr>
   <td><a href="AjouterVehicule"  >Ajouter Vehicule</a></td>
</tr>
</table>  
</body>
</html>