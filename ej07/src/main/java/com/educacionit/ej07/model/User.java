package com.educacionit.ej07.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private String userName;
	private String mail;
	private String clave;
	private String nombreApellido;
	
}
