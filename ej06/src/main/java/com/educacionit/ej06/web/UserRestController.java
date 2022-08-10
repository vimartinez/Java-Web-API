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

import com.educacionit.ej06.model.User;
import com.educacionit.ej06.service.UserService;


@Path("/users")
public class UserRestController {
	
	UserService userService = new UserService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("id") Long id) {
		return userService.getUserById(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addUser(User user) {
		userService.addUser(user);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void updUser(User user) {
		userService.updUser(user);
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void delUser(User user) {
		userService.delUser(user);
		
	}

}
