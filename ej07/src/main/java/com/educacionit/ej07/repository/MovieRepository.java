package com.educacionit.ej07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.educacionit.ej07.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>, MovieRepositoryCustom {

	@Query(nativeQuery=true, value = "SELECT id, duration, name, summary, year_of_release FROM PELICULAS WHERE year_of_release= :year")
	List<Movie> getMoviesByYear(Integer year);

}
