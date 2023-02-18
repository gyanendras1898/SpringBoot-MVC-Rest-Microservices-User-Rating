package com.gyan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.bean.Ratings;
import com.gyan.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	@Override
	public Ratings getRating(String userId) {
		Ratings ratings = new Ratings();
		ratings.setRatings(ratingDao.findAllByUserId(userId));
		return ratings;
	}

}
