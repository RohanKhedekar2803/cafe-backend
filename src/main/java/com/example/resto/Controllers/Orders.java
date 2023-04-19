package com.example.resto.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resto.Models.Dish;
import com.example.resto.Models.Order;
import com.example.resto.Models.extramodals.frontendOrder;
import com.example.resto.Repository.DishRepository;
import com.example.resto.Repository.OrderRepository;

@RestController
@RequestMapping("order")
public class Orders {

	@Autowired
	OrderRepository orderrepository;
	
	@Autowired
	DishRepository dishRepository;
	
	@PostMapping("placeorder")
	public ResponseEntity<Order> placeorder(@RequestBody frontendOrder o1){
//		Order o=orderrepository.save(new Order(o1.getOffer(), o1.getPerson_name(), o1.getSeat_no()));
//		
//		ArrayList<Dish>al=new ArrayList<>();
//		long amount = 0;
//		for (long var : o1.getDishids()) {
//			Optional<Dish> d=dishRepository.findById(var);
//			if(d.isPresent()) {
//				al.add(d.get());
//				amount+=d.get().getPrice();
//			}
//		}
//		o.setAmount(amount);
//		o.setdishs(al);
//		return new ResponseEntity<>(o,HttpStatus.OK);
		return null;
	}
}
