package com.educacionit.ej07.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.educacionit.ej07.model.Movie;

public class MovieRepositoryCustomImpl implements MovieRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Movie> getMoviesByYearCriteria(Integer year) {
		
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Movie> query = cb.createQuery(Movie.class);
		Root<Movie> root = query.from(Movie.class);
		
		List<Predicate> predicates = new ArrayList<>();
		predicates.add(cb.equal(root.get("yearOfRelease"), year));
		query.select(root).where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
		
		return entityManager.createQuery(query).getResultList();
	}

}
