package com.microservices.movieinfo.model;

public class MovieInfoModel {
	String name;
	String desc;
	String releaseDate;
	public MovieInfoModel(String name,String desc,String releaseDate) {
		this.name=name;
		this.desc=desc;
		this.releaseDate=releaseDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
