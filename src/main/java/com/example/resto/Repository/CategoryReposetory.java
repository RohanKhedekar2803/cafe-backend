package com.example.resto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.resto.Models.Category;
import com.example.resto.Models.Dish;

@Repository
public interface CategoryReposetory extends JpaRepository<Category,Long> {

	List<Category> findAll();

	Category findBycategoryName(String categoryName);

	Category findIdBycategoryName(String categoryName);
    
}
