package com.gyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.bean.Movie;
import com.gyan.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	@Override
	public Movie getMovie(String movieId) {
		return movieDao.getById(movieId);
	}

}
