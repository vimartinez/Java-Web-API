package com.educacionit.ej07.repository;

import java.util.List;

import com.educacionit.ej07.model.Movie;

public interface MovieRepositoryCustom {
	
	List<Movie> getMoviesByYearCriteria(Integer year);
	
	List<Movie> getAllMoviesByYearAndDurationLessThan(Integer year, Integer duration);

}
