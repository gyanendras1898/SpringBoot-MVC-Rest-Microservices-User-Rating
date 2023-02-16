package com.gyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gyan.bean.MovieDetailList;

@Service
public class MovieDetailServiceImpl implements MovieDetailService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public MovieDetailList getMovieDetail(String userId) {
		MovieDetailList movieDetails = restTemplate.getForObject("http://localhost:8080/movies/details/"+userId, MovieDetailList.class);
		System.out.println(movieDetails);
		return movieDetails;
	}

}
