package com.microservices.movieCatalogue.catalogue;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CatalogItem {
	String name;
	String desc;
	String rating;
	public CatalogItem() {
		
	}
	public CatalogItem(String name,String desc,String rating) {
		this.name=name;
		this.desc=desc;
		this.rating=rating;
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}
