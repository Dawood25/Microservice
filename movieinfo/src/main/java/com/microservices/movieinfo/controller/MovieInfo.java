package com.microservices.movieinfo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.movieinfo.model.MovieInfoModel;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfo {
	@RequestMapping("{movieName}")
	public MovieInfoModel getMovie(@PathVariable String movieName){
		System.out.println(movieName);
		return new MovieInfoModel("Hello","Romantic","5");
	}
}
