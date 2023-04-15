package com.example.resto.Models;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Dish {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id; 
	private String name;
	private long price;
	private boolean veg;
	private double rating;
	
	public Dish(String name, long price, boolean veg, double rating, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.veg = veg;
		this.rating = rating;
		this.category = category;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@OneToOne(cascade = CascadeType.PERSIST)
	private Category category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory( Category category) {
		this.category = category;
	}
	
	public Dish(long id, String name, long price,  Category category,boolean veg) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.veg=veg;
	}
	
	public Dish( String name, long price,  Category category,boolean veg) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.veg=veg;
	}

	public Dish() {
		super();
		this.name = "";
		this.price = -1;
		this.category = null;
		this.veg=true;
		this.rating=5.0;
	}

	
	
	
}
