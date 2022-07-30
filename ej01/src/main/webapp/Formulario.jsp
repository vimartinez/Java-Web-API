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

<div style="width:400px;">
<h3> Ingreso al sistema</h3>
<form  action="Login" method="post">
  <div class="mb-6">
    <label for="email1" class="form-label">Email address</label>
    <input type="email" class="form-control" name="email1" id="email1" aria-describedby="emailHelp" placeholder="usuario@mail.com" required>
  </div>
  <div class="mb-6">
    <label for="password1" class="form-label">Password</label>
    <input type="password" class="form-control" name="password1" id="password1" placeholder="colocá tu clave acá!" required>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>