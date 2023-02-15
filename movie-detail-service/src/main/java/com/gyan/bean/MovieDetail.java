package com.gyan.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetail {

	private int ratingId;
	private String userId;
	private String movieName;
	private int rating;
}
