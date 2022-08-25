package com.educacionit.ej07.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
	private Integer id;
	private String nombre;
	private String sipnopsis;
	private String cover;

}
