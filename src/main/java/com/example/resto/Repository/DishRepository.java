package com.example.resto.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.resto.Models.Category;
import com.example.resto.Models.Dish;

@Repository
public interface DishRepository extends CrudRepository<Dish, Long>{

	Dish findByname(String name);
//	ArrayList <Dish> findBycategoryname(String category);	

	List<Dish> findBycategory(Category category);

	List<Dish> findByveg(boolean b);
	
	Dish FindById(long id);

	


}
