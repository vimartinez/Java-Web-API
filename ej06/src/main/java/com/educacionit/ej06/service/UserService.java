package com.educacionit.ej06.service;

import java.util.ArrayList;
import java.util.List;

import com.educacionit.ej06.model.User;

public class UserService {

	// instganciar repository o DAO
	
	public User getUserById(Long id) {
		// buscar el usuario
		
		User usuarioDePrueba = new User(1L, "Victor M", "victorm@gmail.com", "Av. Corrientes 1365 2C, CABA", "1234", null);
		return usuarioDePrueba;
	}

	public List<User> getAllUsers() {
		
		ArrayList<User> usuarios = new ArrayList<>();
		usuarios.add(new User(1L, "Pirulo Manso", "victorm@gmail.com", "Av. Corrientes 1365 2C, CABA", "1234", null));
		usuarios.add(new User(2L, "Sergio Perez", "Sergio@gmail.com", "Av. San Marin 123, San Rafael, Mendoza", "12343", null));
		usuarios.add(new User(3L, "Monica Gomez", "Monica@gmail.com", "Las Luciernagas 123, Buenos Aires", "12343", null));
		return usuarios;
	}

	public void addUser(User user) {
		// aggregar usuario
		System.out.println(user.toString());
		
	}

	public void updUser(User user) {
		// actualiar usuario
		System.out.println(user.toString());
		
	}

	public void delUser(User user) {
		// eliminar usuario
		user.getId(); //id del usuario a eliminar
		System.out.println(user.toString());
		
	}

}
