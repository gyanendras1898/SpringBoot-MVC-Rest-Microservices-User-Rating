package com.gyan.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	private int ratingId;
	private String userId;
	private String movieId;
	private int rating;
}
