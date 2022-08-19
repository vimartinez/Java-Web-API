package com.educacionit.ej07.V1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.ej07.model.Movie;
import com.educacionit.ej07.service.MovieService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/pelis")
@Slf4j
public class MovieRestController {
	
	@Autowired
	MovieService movieService; 

	@Operation(summary="Devuelve un listado de películas", description="Ingresar el nombre completo o parte del nombre en inglés", tags = {"Películas"})
	@ApiResponses(value = {
			@ApiResponse(responseCode="200", description="Operación exitosa"),
			@ApiResponse(responseCode="404", description="Objeto no encontrado")})
	@GetMapping(value="/", produces = "Application/json")
	public List<Movie> getMoviesByName(@Parameter(description="Nombre de la película") @RequestParam(value="Nombre", defaultValue="Back to the Future") String name){
		
		log.info("ingreso en getMoviesByName en MovieRestController");
		return movieService.getMoviesByName(name);
		
	}
	
	@Operation(summary="Devuelve un listado de películas recomendas", description="Ingresar el nombre completo o parte del nombre en inglés", tags = {"Películas"})
	@ApiResponses(value = {
			@ApiResponse(responseCode="200", description="Operación exitosa"),
			@ApiResponse(responseCode="404", description="Objeto no encontrado")})
	@GetMapping(value="/sugeridas/", produces = "Application/json")
	public List<Movie> getRecommendedMovies(@Parameter(description="Nombre de la película") @RequestParam(value="Nombre", defaultValue="Back to the Future")String name){
		log.info("ingreso en getRecommendedMovies en MovieRestController");
		return movieService.getRecommendedMovies(name);
	}
}
