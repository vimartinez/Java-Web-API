package com.educacionit.ej06.web;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.educacionit.ej06.model.User;
import com.educacionit.ej06.service.UserService;


@Path("/users")
public class UserRestController {
	
	UserService userService = new UserService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam("id") Long id) {
		
		User usuarioObtenido = userService.getUserById(id);
		if (usuarioObtenido != null) {
			return Response
					.status(Response.Status.OK)
					.entity(usuarioObtenido)
					.type(MediaType.APPLICATION_JSON)
					.build();
		}
		else {
			return Response
					.status(Response.Status.NOT_FOUND)
					.entity("{\"mensaje\":\"No se encontró el usuario: "+id+"\"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUser(User user) {
		if (userService.addUser(user)) {
			return Response
					.status(Response.Status.CREATED)
					.entity("{\"mensaje\":\"El usuario se generó correctamente\"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		}
		else {
			return Response
					.status(Response.Status.CONFLICT)
					.entity("{\"mensaje\":\"No se pudo dar de alta el usuario\"}")
					.type(MediaType.APPLICATION_JSON)
					.build();	
		}
		
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updUser(User user) {
		if(userService.updUser(user)) {
			return Response.status(Response.Status.OK).entity("{\"mensaje\":\"Se actualizó el usuario\"}").build();
		}
		else {
			return Response
					.status(Response.Status.CONFLICT)
					.entity("{\"mensaje\":\"No se actualizar el usuario\"}")
					.type(MediaType.APPLICATION_JSON)
					.build();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Response delUser(User user) {
		if(userService.delUser(user)) {
			return Response.status(Response.Status.NO_CONTENT).build();
		}
		else {
			return Response.status(Response.Status.CONFLICT).entity("{\"mensaje\":\"No se pudo eliminar el usuario\"}").build();
		}
	}
}
