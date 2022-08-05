package com.educacionit.ej05.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:8080/ej05/rest/demo/saludo
@Path("/demo")
public class Saludo {
	
	@GET
	@Path("/saludo")
	@Produces(MediaType.TEXT_PLAIN)
	public String saludo() {
		return "Hola, soy una API Rest";
	}

}
