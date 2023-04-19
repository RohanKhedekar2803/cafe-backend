package com.example.resto.Models.extramodals;

import java.util.ArrayList;

import com.example.resto.Models.Dish;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

public class frontendOrder {
	
	
	private float offer;
	private String person_name;
	private long seat_no;
	private ArrayList<Long> dishids=new ArrayList();

	public float getOffer() {
		return offer;
	}
	public void setOffer(float offer) {
		this.offer = offer;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public long getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(long seat_no) {
		this.seat_no = seat_no;
	}
	public ArrayList<Long> getDishids() {
		return dishids;
	}
	public void setDishids(ArrayList<Long> dishids) {
		this.dishids = dishids;
	}
	public frontendOrder(float offer, String person_name, long seat_no, ArrayList<Long> dishids) {
		super();
		this.offer = offer;
		this.person_name = person_name;
		this.seat_no = seat_no;
		this.dishids = dishids;
	}
	

}
