package com.educacionit.ej07.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.educacionit.ej07.model.Movie;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;

@Slf4j
@Service
public class MovieService {
	private static final String URLLISTMOVIES = "https://yts.mx/api/v2/list_movies.json?query_term=";
	private static final String URLMOVIESSIGGESTION = "https://yts.mx/api/v2/movie_suggestions.json?movie_id=";
	
	JSONObject jsonObject = new JSONObject();
	JSONArray jsonArray;

	public List<Movie> getMoviesByName(String name) {
		log.info(" ingreso en getMoviesByName en MovieService");
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		jsonObject = getMoviesFromWS(URLLISTMOVIES, name);
		if(jsonObject.getInt("movie_count")>0) {
			jsonArray = jsonObject.getJSONArray("movies");
			for (int i=0;i<jsonArray.length();i++) {
				Movie movie = new Movie();
				movie.setId(jsonArray.getJSONObject(i).getInt("id"));
				movie.setNombre(jsonArray.getJSONObject(i).getString("title"));
				movie.setSipnopsis(jsonArray.getJSONObject(i).getString("synopsis"));
				movie.setCover(jsonArray.getJSONObject(i).getString("medium_cover_image"));
				movies.add(movie);
			}
		}
		return movies;
	}
	
	public List<Movie> getRecommendedMovies(String name) {
		log.info(" ingreso en getRecommendedMovies en MovieService");
		
		Integer movieId = null;
		ArrayList<Movie> movies = new ArrayList<Movie>();
		jsonObject = getMoviesFromWS(URLLISTMOVIES, name);
		if(jsonObject.getInt("movie_count")>0) {
			movieId = jsonObject.getJSONArray("movies").getJSONObject(0).getInt("id");
			jsonObject = getMoviesFromWS(URLMOVIESSIGGESTION, movieId.toString());
			if(jsonObject.getInt("movie_count")>0) {
				jsonArray = jsonObject.getJSONArray("movies");
				for (int i=0;i<jsonArray.length();i++) {
					Movie movie = new Movie();
					movie.setId(jsonArray.getJSONObject(i).getInt("id"));
					movie.setNombre(jsonArray.getJSONObject(i).getString("title"));
					movie.setSipnopsis(jsonArray.getJSONObject(i).getString("synopsis"));
					movie.setCover(jsonArray.getJSONObject(i).getString("medium_cover_image"));
					movies.add(movie);
				}
			}
		}
		return movies;
	}
	
	private JSONObject getMoviesFromWS(String url, String data) {
		log.info("   ingreso en getMoviesFromWS en MovieService");
		OkHttpClient httpClient = new OkHttpClient();
		Request request = new Request.Builder().url(url+data).build();
		Call call= httpClient.newCall(request);
		Response response;
		JSONObject jsonObject = null;
		try {
			response = call.execute();
			jsonObject = new JSONObject(response.body().string());
			if(jsonObject.get("status").equals("ok")) {
				jsonObject = jsonObject.getJSONObject("data");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject;
		
	}





}
