package com.educacionit.ej07.V1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.ej07.model.User;
import com.educacionit.ej07.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserRestController {

	@Autowired
	UserService userService;
	
	@GetMapping(value="/")
	@Operation(summary="Devuelve un listado usuarios", description="No tiene parámetros de entrada", tags = {"Usuarios"})
	public User getAllUsers() {
		
		return userService.getAllUsers();	
		
	}
	
	@GetMapping(value="/{id}")
	@Operation(summary="Devuelve un usuario", description="Ingresar el id de usuario", tags = {"Usuarios"})
	public User getUserById(Integer id) {
		
		return userService.getAllUsers(id);	
		
	}
	
	@PostMapping(path="/", produces= "application/json")
	@Operation(summary="Ingresar un nuevo usuario", description="Emviar el objeto usuario", tags = {"Usuarios"})
	public void addUser(User user) {
		userService.addUser(user);
	}
	
	@Operation(summary="Actualizar un usuario", description="Enviar el usuario a actualizar", tags = {"Usuarios"})
	@PutMapping(path="/", produces= "application/json")
	public void updUser(User user) {
		userService.updUser(user);
	}
	
	@Operation(summary="Elimina un usuario del sistema", description="Debe ingresar el id del usuario", tags = {"Usuarios"})
	@DeleteMapping(path="/{id}", produces= "application/json")
	public void delUser(Integer id) {
		userService.delUser(id);
	}
}
