package com.gyan.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gyan.bean.Movie;
import com.gyan.bean.MovieDetail;
import com.gyan.bean.MovieDetailList;
import com.gyan.bean.Rating;
import com.gyan.bean.Ratings;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public MovieDetailList getMovieDetails(String userId) {
		Ratings ratings = restTemplate.getForObject("http://localhost:8081/ratings/"+userId, Ratings.class);
		System.out.println(ratings);
		MovieDetailList movieDetails = new MovieDetailList(new ArrayList<>());
		for(Rating rating : ratings.getRatings()) {
			System.out.println(rating);
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			System.out.println(movie);
			movieDetails.getMovieDetails().add(new MovieDetail(rating.getRatingId(),rating.getUserId(),movie.getMovieName(),rating.getRating()));
		}
		return movieDetails;
	}

}
