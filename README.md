# Java-Web-API
Repo con ejercitación para el curso Java Web API dictado en EducacionIT

Ejercicio 01 - Sesiones
Sesiones en JSP: Formulario de login en jsp, si las credenciales son correctas se genera una sesión, se obtienen datos del usuario y redirecciona al index donde se muestran estos datos. De no ser así se muestra mensaje de error y se redirecciona nuevamente al login.
Si no está en sesión no se puede acceder al index, si está en sesión no se puede acceder al formulario de login.

Ejercicio 02 - Web Service SOAP
Generación de un WS Soap con dos métodos para tirar dados, un tira un dado de 6 caras y el otro permite enviar la cantidad de caras del dado. Estas pueden ser 4, 6, 8, 12 y 20 caras.

Ejercicio 03 - Web Service SOAP Tomcat
Implementación del Web Service SOAP del ejercio 02 en el server tomcat, se genera un web service jax-ws que expone los métodos generados en el ejercicio 02

Ejercicio 04 - Web Service SOAP Cliente
Generación de un cliente SOAP que consume los servicios expuestos por el ejercicio 03.

Ejercicio 05 - Web Service REST
Generación de servicio web REST básico utilizando jax-rs, solo acepta una solicitud GET

Ejercicio 06 - Web Service REST
CRUD de usuarios en tomcat con jax-ws implementando un DAO - MySQL, 3 capas (controller, service y DAO) - colección de Postman