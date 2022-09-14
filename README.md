# Java-Web-API
Repo con ejercitación para el curso Java Web API dictado en EducacionIT


Ejercicio 01 - Sesiones

Sesiones en JSP: Formulario de login en jsp, si las credenciales son correctas se genera una sesión, se obtienen datos del usuario y redirecciona al index donde se muestran estos datos. De no ser así se muestra mensaje de error y se redirecciona nuevamente al login.
Si no está en sesión no se puede acceder al index, si está en sesión no se puede acceder al formulario de login.

![Ej01](https://user-images.githubusercontent.com/19653664/189353583-aad7577d-85f5-4f46-aa54-5948044e1b3e.png)

Ejercicio 02 - Web Service SOAP

Generación de un WS Soap con dos métodos para tirar dados, un tira un dado de 6 caras y el otro permite enviar la cantidad de caras del dado. Estas pueden ser 4, 6, 8, 12 y 20 caras.

Ejercicio 03 - Web Service SOAP jax-ws, Tomcat

Implementación del Web Service SOAP del ejercio 02 en server tomcat, se genera un web service jax-ws que expone los métodos generados en el ejercicio 02

![Ej03](https://user-images.githubusercontent.com/19653664/189351818-54667909-f6a9-47ef-a60f-b563f26f0edd.png)

Ejercicio 04 - Web Service SOAP Cliente

Generación de aplicación cliente SOAP que consume los servicios expuestos por el ejercicio 03.

Ejercicio 05 - Web Service REST

Generación de servicio web REST básico utilizando jax-rs, solo acepta una solicitud GET

Ejercicio 06 - Web Service REST - API jax-rs, DAO

CRUD de usuarios en tomcat con jax-rs implementando un DAO - MySQL, 3 capas (controller, service y DAO) - colección de Postman

![Ej06](https://user-images.githubusercontent.com/19653664/189350346-0abdb2c5-4c45-481c-ac3c-7b866c1f612f.png)

Ejercicio 07 - Web Service REST II - API Spring boot

API que sugiere películas en función del título ingresado, consume API de YTS (https://yts.mx/api), con Spring Boot, OpenAPI, Swagger, JPA, H2, Repository, Lombok, Actuator, JUnit

![Ej07](https://user-images.githubusercontent.com/19653664/189350287-ec3af262-3580-49c4-938b-0997ec9afc97.png)

Ejercicio 08 - JSF App usando DAO, BD MySQL y external API

Se reutiliza el DAO del ej06 para generar un login contra BD utilizand JSF, Templates JSF, se consume una API de https://datosgobar.github.io/georef-ar-api/ para cargar el listado de provincias de la República Argentina y luego se buscan los departamentos de una provincia seleccionada.
Logo de la API tomado de https://www.flaticon.es/

![Ej08](https://user-images.githubusercontent.com/19653664/189350234-360f2f1d-e5c6-43d7-9ffa-54219b74ee55.png)

Ejercicio 09 - Introducción a React

Aplicación de saludo con componentes tipo Class, Function, contenedores, css, renderizado condicional.
Bootstrap, generación de componente header, consumo de una api de https://jsonplaceholder.typicode.com/ y mostrar resultados en una tabla con estilo bootstrap

![Ej09](https://user-images.githubusercontent.com/19653664/189350188-a1e68e02-c243-420d-b2e6-fe881f716752.png)

Ej 10 - Consumo de una API Java desde React
Consumo de una API Local desarrollada en el ejercicio 7, se muestra un listado de películas.

![Ej10](https://user-images.githubusercontent.com/19653664/190039895-28642228-bd8b-4432-90ba-a570c6602ed2.png)

Ej 11 - Consumo de API de Circuitos de F1 desde front end React con reutilización de componentes

![Ej11](https://user-images.githubusercontent.com/19653664/190040035-6ca39b9f-758c-4b24-90fb-61800b0c4d8b.png)
