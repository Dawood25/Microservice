package com.microservices.movieRating.movie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.movieRating.model.MovieRated;
import com.microservices.movieRating.model.MovieRatingModel;



@RestController
@RequestMapping("/movieRating")
public class MovieRating {
	@RequestMapping("{movieName}")
	public MovieRated movieName(@PathVariable String movieName){
		System.out.println(movieName);
		MovieRated movieRated=new MovieRated();
		movieRated.setList(Arrays.asList(new MovieRatingModel("Drishyam","4"),new MovieRatingModel("Bala", "5")));
		return movieRated;
	}
}
