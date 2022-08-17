package com.educacionit.ej07.V1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.ej07.model.Movie;
import com.educacionit.ej07.service.Ej07Service;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/peli")
@Slf4j
public class ej07RestController {
	
	@Autowired
	Ej07Service ej07Service; 

	public List<Movie> getMoviesByName(String nombre){
		
	//	log.info("ingreso en getMoviesByName en ej07RestController");
		return ej07Service.getMoviesByName(nombre);
		
	}
}
