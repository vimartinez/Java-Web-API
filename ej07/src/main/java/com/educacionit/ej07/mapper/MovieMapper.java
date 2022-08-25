package com.educacionit.ej07.mapper;

import org.json.JSONObject;

import com.educacionit.ej07.model.MovieDTO;

public class MovieMapper {
	
	public static MovieDTO jsonObjectToMovie (JSONObject jsonobject) {
		MovieDTO movie = new MovieDTO();
		movie.setId(jsonobject.getInt("id"));
		movie.setNombre(jsonobject.getString("title"));
		movie.setSipnopsis(jsonobject.getString("synopsis"));
		movie.setCover(jsonobject.getString("medium_cover_image"));
		
		return movie;
		
	}

}
