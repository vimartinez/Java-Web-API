package com.educacionit.ej07;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.educacionit.ej07.model.Movie;
import com.educacionit.ej07.repository.MovieRepository;
import com.educacionit.ej07.service.MovieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class Ej07ApplicationTests {

	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	MovieService movieService;
	
	/*
	@BeforeAll
	 void antesDeTodos() {
		log.info("Antes de todos los testCase");
	}
	
	@AfterAll
	 void despuesDeTodos() {
		log.info("Después de todos los testCase");
	}
	
	@BeforeEach
	 void antesDeCadaTestCase() {
		log.info("  Antes de cada testCase");
	}
	
	@AfterEach
	 void despuesDeCadaTestCase() {
		log.info("  Después de cada testCase");
	}
	*/
	
	
	@Test
	void testInjections() {
		Assertions.assertNotNull(movieRepository);
		Assertions.assertNotNull(movieService);
	}
	
	
	@Test
	void testearSumaEnteros() {

		Integer resultado = 0;
		resultado = 16 + 22;
		
		Assertions.assertEquals(resultado, 38);
	}
	
	@Test
	void testGetMovieFromRepository() {	
		Optional<Movie> movie = movieRepository.findById(1L);
		Assertions.assertNotNull(movie);
		Assertions.assertEquals(movie.get().getClass(), Movie.class);
	}
	
	@Test
	void testAddMovieFromRepository() {
		Movie movie = new Movie(454L, "Nemo", 151, 2004, "Nada");
		Assertions.assertNotNull(movieRepository.save(movie));
	}
	
	@Test
	void testAddMovieFromService() {
		Movie movie = new Movie(454L, "Nemo", 151, 2004, "Nada");
		Assertions.assertNotNull(movieService.addMovie(movie));
	}

}
