package com.example.resto.Models.extramodals;

import jakarta.persistence.Entity;


public class frontenddish {
	private String name;
	private long price;
	private String categoryName;
	private boolean veg;
	private double rating;
	private long time;
	public frontenddish(String name, long price, String categoryName, boolean veg, double rating, long time) {
		super();
		this.name = name;
		this.price = price;
		this.categoryName = categoryName;
		this.veg = veg;
		this.rating = rating;
		this.time = time;
	}

	
	
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
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
	public String getCategoryname() {
		
		return categoryName;
	}
	public void setCategoryname(String categoryname) {
		this.categoryName = categoryname;
	}
	public frontenddish(String name, long price, String categoryname,boolean veg) {
		super();
		this.name = name;
		this.price = price;
		this.categoryName = categoryname;
		this.veg=veg;
	}
	
	public frontenddish() {
		super();
		this.name = "";
		this.price =-1;
		this.categoryName="";
		this.veg=true;
	}

	
}
