<%@page import="com.educacionit.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Web API</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">Java Web API</span>
    <a class="nav-link" href="Login?logout=1">Cerrar Sesión</a>
  </div>
</nav>
<h3>Ejercicio 01 <span class="badge bg-secondary">Sesiones</span></h3>
<%
Usuario usuario = (Usuario) session.getAttribute("usuario");
if (usuario == null){
	response.sendRedirect("Formulario.jsp");
}
else {
	out.print("<div class='alert alert-primary' role='alert'> Bienvenido: "+usuario.getNombreApe()+"</div>");
}
%>
<br>
<%
for (int i =5; i<10;i++){
	out.print(i + "<br>");
}
%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
