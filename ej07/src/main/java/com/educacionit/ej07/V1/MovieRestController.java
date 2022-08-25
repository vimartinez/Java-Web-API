package com.educacionit.ej07.V1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.educacionit.ej07.model.Movie;
import com.educacionit.ej07.service.MovieService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/movies")
public class MovieRestController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping(value="/")
	@Operation(summary="Devuelve un listado peliculas de la bd", description="No tiene parámetros de entrada", tags = {"Peliculas de BD"})
	public @ResponseBody List<Movie> getAllMovies() {
		
		return movieService.getAllMovies();	
		
	}
	
	@GetMapping(value="/{id}")
	@Operation(summary="Devuelve una peli de la bd", description="Ingresar el id ", tags = {"Peliculas de BD"})
	public @ResponseBody Optional<Movie> getMovieById(Long id) {
		
		return movieService.getMovieById(id);	
		
	}
	
	@GetMapping(value="/year/{year}")
	@Operation(summary="Devuelve un listado peliculas por año con native query", description="ingresar el año", tags = {"Peliculas de BD"})
	public @ResponseBody List<Movie> getAllMoviesByYear(@PathVariable("year") Integer year) {
		
		return movieService.getAllMoviesByYear(year);	
		
	}
	
	@GetMapping(value="/yearcriteria/{year}")
	@Operation(summary="Devuelve un listado peliculas por año con criteria", description="ingresar el año", tags = {"Peliculas de BD"})
	public @ResponseBody List<Movie> getAllMoviesByYearCriteria(@PathVariable("year") Integer year) {
		
		return movieService.getAllMoviesByYearCriteria(year);	
		
	}
	
	@PostMapping(path="/", produces= "application/json")
	@Operation(summary="Ingresar una peli", description="Enviar el objeto peli", tags = {"Peliculas de BD"})
	public @ResponseBody void addMovie(Movie movie) {
		movieService.addMovie(movie);
	}
	
	@Operation(summary="Actualizar una peli", description="Enviar el objeto a actualizar", tags = {"Peliculas de BD"})
	@PutMapping(path="/", produces= "application/json")
	public @ResponseBody void updMovie(Movie movie) {
		movieService.updMovie(movie);
	}
	
	@Operation(summary="Elimina una película del sistema", description="Debe ingresar el id", tags = {"Peliculas de BD"})
	@DeleteMapping(path="/{id}", produces= "application/json")
	public @ResponseBody void delMovie(Long id) {
		movieService.delMovie(id);
	}

}
