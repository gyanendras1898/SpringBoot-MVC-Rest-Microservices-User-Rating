package com.gyan.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.bean.MovieDetailList;
import com.gyan.service.DataService;

@RestController
public class DataServiceResource {

	@Autowired
	private DataService dataService;
	
	@GetMapping(path = "/datas/{uId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MovieDetailList> getMovieDetailsByUser(@PathVariable("uId") String userId){
		MovieDetailList movieDetails = dataService.getMovieDetails(userId);
		return new ResponseEntity<MovieDetailList>(movieDetails, HttpStatus.OK);
		
	}
}
