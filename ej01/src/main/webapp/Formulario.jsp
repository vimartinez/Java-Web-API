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


<div style="text-align:center;width:400px">
<h3>Ingreso al Sistema</h3>
<form  action="Login" method="post">
<div class="mb-3 row">
    <label for="email1" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email"  class="form-control" id="email1" name="email1" placeholder="usuario@mail.com" required>
    </div>
  </div>
  <div class="mb-3 row">
    <label for="password1" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="password1" name="password1" placeholder="colocá tu clave acá!" required>
    </div>
  </div>
    <div class="col-12">
    <button class="btn btn-primary" type="submit">Enviar</button>
  </div>
</form><br>
<% 
String mensajeError = (String) request.getAttribute("mensajeError");
String mensajeLogout = (String) request.getAttribute("mensajeLogout");    		
if (mensajeError != null){%>
	<div class="alert alert-danger" role="alert">
	  <%= mensajeError%>
	</div>
<% }
if (mensajeLogout != null){
	out.print("<div class='alert alert-success' role='alert'>"+mensajeLogout+"</div>");
}	
%>
	
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>