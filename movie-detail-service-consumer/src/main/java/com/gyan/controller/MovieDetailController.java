package com.gyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gyan.bean.MovieDetailList;
import com.gyan.service.MovieDetailService;

@Controller
public class MovieDetailController {

	@Autowired 
	private MovieDetailService movieDetailService;
	
	@RequestMapping("/")
	public String homeController() {
		return "home";
	}
	
	@RequestMapping("/details")
	public ModelAndView getMovieDetailController(@RequestParam("userId") String userId){
		MovieDetailList movies = movieDetailService.getMovieDetail(userId);
		return new ModelAndView("details","movies",movies.getMovieDetails());
	}
}
