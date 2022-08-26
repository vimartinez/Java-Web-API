package com.educacionit.ej07.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.ej07.model.Movie;
import com.educacionit.ej07.repository.MovieRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MovieService {
	
	@Autowired
	MovieRepository movieRepository;

	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	public Optional<Movie> getMovieById(Long id) {
		return movieRepository.findById(id);
	}

	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);		
	}

	public void updMovie(Movie movie) {
		//1. buscar el objeto en bd con el id que venga en movie
		//2. si se encuentra, evaluar los datos de movie, si no viene se usua el que está
		movieRepository.save(movie);
		
	}

	public void delMovie(Long id) {
		movieRepository.deleteById(id);
		
	}

	public List<Movie> getAllMoviesByYear(Integer year) {
		return movieRepository.getMoviesByYear(year);
	}

	public List<Movie> getAllMoviesByYearCriteria(Integer year) {
		return movieRepository.getMoviesByYearCriteria(year);
	}

	public List<Movie> getAllMoviesByYearAndDurationLessThan(Integer year, Integer duration) {
		log.info("year:"+ year + " duration:" + duration);
		return movieRepository.getAllMoviesByYearAndDurationLessThan(year, duration);
	}

}
