package com.example.resto.Controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.resto.Comparators.comparator;
import com.example.resto.Models.Category;
import com.example.resto.Models.Dish;
import com.example.resto.Models.extramodals.frontenddish;
import com.example.resto.Repository.CategoryReposetory;
import com.example.resto.Repository.DishRepository;

@RestController
@RequestMapping("user")
public class user {
	
	@Autowired
	private CategoryReposetory categoryrepo;
	
	@Autowired
	private DishRepository dishrepo;
	
	//categories controllers
	 List<Category> al =new ArrayList<Category>();
	 
	 @GetMapping("/categories/get")
	 public List<Category> getCategories(){

		 al=categoryrepo.findAll();
		 return al;
	 }
	 
	 
//	 //dish controllers
	 List<Dish> dl=new ArrayList<Dish>();
	 
	 @GetMapping("dishes/get")
	 public List<Dish> getAlldishes() {
		 dl=(List<Dish>) dishrepo.findAll();
		 return dl;
	 }
	 
	 @PostMapping("dish/get")
	 public Dish getdishe(@RequestBody frontenddish fd) {
		 Dish dish=dishrepo.findByname(fd.getName());
		 return dish;
	 }
	 
	 
	 List<Dish> dishlist =new ArrayList<Dish>();
	 @GetMapping("dishbycategory")
	 public List<Dish>getdishesByCategory(@RequestParam("categoryName") String cat){
		 
		 Category category=categoryrepo.findIdBycategoryName(cat);
		 dishlist=dishrepo.findBycategory(category);
		 return dishlist;
	 }
	 
	 List<Dish> veglist =new ArrayList<Dish>();
	 @GetMapping("filter/veg")
	 public List<Dish>getvegdishes(@RequestParam("veg") boolean veg){
		 
		 
		 dishlist=dishrepo.findByveg(veg);
		 return dishlist;
	 }
     
	 List<Dish>lowpricelist=new ArrayList<Dish>();
	 @GetMapping("filter/lowfirst")
	 public List<Dish> getlowpaydish(){
		 lowpricelist=(List<Dish>) dishrepo.findAll();
		 Collections.sort(lowpricelist, comparator.pricecomparator);
		 return lowpricelist;
	 }
	 
	 List<Dish>highpricelist=new ArrayList<Dish>();
	 @GetMapping("filter/highfirst")
	 public List<Dish> gethighpaydish(){
		 lowpricelist=(List<Dish>) dishrepo.findAll();
		 Collections.sort(lowpricelist, comparator.pricecomparator2);
		 return lowpricelist;
	 }

}
