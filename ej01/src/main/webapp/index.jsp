<%@page import="com.educacionit.model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Web API</title>
</head>
<body>
<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">Java Web API</span>
  </div>
</nav>
<h2>Ejercicio 01 <span class="badge bg-secondary">JWA</span></h2>
<h3>Sesiones</h3>
<%
Usuario usuario = (Usuario) session.getAttribute("usuario");
if (usuario == null){
	response.sendRedirect("Formulario.jsp");
}
else {
	String nombreApe = (String) session.getAttribute("nombre");
	String mensajeError = (String) request.getAttribute("mensajeError");
	out.print("<br>mensaje error: " + mensajeError);
	out.print("<br> nombre String: "+nombreApe);
	//out.print("<br> nombre desde obj: "+usuario.getNombreApe());
}

%>




<% String nombre = "Victor";

out.print("Hola " + nombre + "!<br>");


for (int i =5; i<10;i++){
	out.print(i + "<br>");
}

%>

<h4>continúa mi código acá:</h4>
<% out.print(nombre); %>

<% String usarioRecibido = (String) request.getAttribute("mailIngresado");
out.print("<br>mail recibido desde el login:" + usarioRecibido);%>


<div> 
<h3>Valores recibidos</h3>


</div>
<a href="Login?logout=1">Cerrar Sesión</a>
</body>
</html>
