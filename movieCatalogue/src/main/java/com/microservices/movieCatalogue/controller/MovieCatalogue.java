package com.microservices.movieCatalogue.controller;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.movieCatalogue.catalogue.CatalogItem;
import com.microservices.movieCatalogue.catalogue.MovieInfoModel;
import com.microservices.movieCatalogue.catalogue.MovieRated;
import com.microservices.movieCatalogue.catalogue.MovieRatingModel;

import java.util.*;

@RestController
@RequestMapping("/movies")
public class MovieCatalogue {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	CatalogItem ct;

	@RequestMapping("{userName}")
	public List<CatalogItem> getMovies(@PathVariable String userName) {
		System.out.println(userName);
		List<MovieRatingModel> ratedMovie = restTemplate.getForObject("http://MOVIERATING/movieRating/dawood",MovieRated.class).getList();

		List<CatalogItem> list = ratedMovie.stream().map(rated -> {
			MovieInfoModel moviInfo = restTemplate.getForObject("http://MOVIEINFO/movieInfo/"+rated.getName(),
					MovieInfoModel.class);
			CatalogItem moviCatalogItem=new CatalogItem(moviInfo.getName(),moviInfo.getDesc(),rated.getRating());
			return moviCatalogItem;
		}).collect(Collectors.toList());

		return list;
	}
}
