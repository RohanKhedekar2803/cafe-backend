package com.example.resto.Models;

import java.util.ArrayList;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//@Entity
public class Order {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name="_orderId") 
//	private long orderId;
//	@Column(name="_amoun`") 
//	private double amount;
//	@Column(name="_offer") 
//	private double offer;
//	
//	@Column(name="_personaname") 
//	private String personname;
//	
//	@Column(name="_seatno") 
//	private long seatno;
//	@OneToMany(fetch = FetchType.LAZY)
//	@Column(name="_dishes") 
//	private ArrayList<Dish> dishs=new ArrayList();
//	
//	
//	public Order(double amount, double offer, String person_name, long seat_no) {
//		super();
//		this.amount = amount;
//		this.offer = offer;
//		this.personname = person_name;
//		this.seatno = seat_no;
//	}
//	public long getOrderid() {
//		return orderId;
//	}
//	public void setOrderid(long orderid) {
//		this.orderId = orderid;
//	}
//	public double getAmount() {
//		return this.amount;
//	}
//	public void setAmount(double amount) {
//		amount = amount;
//	}
//	public double getOffer() {
//		return offer;
//	}
//	public void setOffer(double offer) {
//		this.offer = offer;
//	}
//	public String getPerson_name() {
//		return personname;
//	}
//	public void setPerson_name(String person_name) {
//		this.personname = person_name;
//	}
//	public long getSeat_no() {
//		return seatno;
//	}
//	public void setSeat_no(long seat_no) {
//		this.seatno = seat_no;
//	}
//	public ArrayList<Dish> getdishs() {
//		return dishs;
//	}
//	public void setdishs(ArrayList<Dish> al) {
//		this.dishs = al;
//	}
//	public Order(long orderid, double amount, double offer, String person_name, long seat_no, ArrayList<Dish> al) {
//		super();
//		this.orderId = orderid;
//		this.amount = amount;
//		this.offer = offer;
//		this.personname = person_name;
//		this.seatno = seat_no;
//		this.dishs = al;
//	}
//	
//	public Order(double offer, String person_name, long seat_no ) {
//		super();
//		this.offer = offer;
//		this.personname = person_name;
//		this.seatno = seat_no;
//		
//	}
//	
	
	
	
}
