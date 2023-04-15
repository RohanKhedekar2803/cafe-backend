package com.example.resto.Models.extramodals;

import jakarta.persistence.Entity;


public class frontenddish {
	private String name;
	private long price;
	private String categoryName;
	private boolean veg;
	
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
