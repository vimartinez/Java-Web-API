# Java-Web-API
Repo con ejercitación para el curso Java Web API dictado en EducacionIT

Ejercicio 01 - Sesiones
Sesiones en JSP: Formulario de login en jsp, si las credenciales son correctas se genera una sesión, se obtienen datos del usuario y redirecciona al index donde se muestran estos datos. De no ser así se muestra mensaje de error y se redirecciona nuevamente al login.
Si no está en sesión no se puede acceder al index, si está en sesión no se puede acceder al formulario de login.

Ejercicio 02 - Web Service SOAP
Generación de un WS Soap con dos métodos para tirar dados, un tira un dado de 6 caras y el otro permite enviar la cantidad de caras del dado. Estas pueden ser 4, 6, 8, 12 y 20 caras.

Ejercicio 03 - Web Service SOAP jax-ws, Tomcat
Implementación del Web Service SOAP del ejercio 02 en el server tomcat, se genera un web service jax-ws que expone los métodos generados en el ejercicio 02

Ejercicio 04 - Web Service SOAP Cliente
Generación de un cliente SOAP que consume los servicios expuestos por el ejercicio 03.

Ejercicio 05 - Web Service REST
Generación de servicio web REST básico utilizando jax-rs, solo acepta una solicitud GET

Ejercicio 06 - Web Service REST - API jax-rs, DAO
CRUD de usuarios en tomcat con jax-rs implementando un DAO - MySQL, 3 capas (controller, service y DAO) - colección de Postman

Ejercicio 07 - Web Service REST II - API Spring boot
API que sugiere películas en función del título ingresado, consume API de YTS (https://yts.mx/api), con Spring Boot, OpenAPI, Swagger, JPA, H2, Repository, Lombok, Actuator, JUnit

Ejercicio 08 - JSF App usando DAO, BD MySQL y external API
Se reutiliza el DAO del ej06 para generar un login contra BD utilizand JSF, Templates JSF, se consume una API de https://datosgobar.github.io/georef-ar-api/ para cargar el listado de provincias de la República Argentina y luego se buscan los departamentos de una provincia seleccionada.
Logo de la API tomado de https://www.flaticon.es/