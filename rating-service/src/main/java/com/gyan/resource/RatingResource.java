package com.gyan.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gyan.bean.Ratings;
import com.gyan.service.RatingService;

@RestController
public class RatingResource {
	@Autowired
	private RatingService ratingService;
	
	@GetMapping(path = "/ratings/{uId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ratings> getRatingResourceByUserId(@PathVariable("uId") String userId){
		return new ResponseEntity<Ratings>(ratingService.getRating(userId), HttpStatus.OK);
	}
}
