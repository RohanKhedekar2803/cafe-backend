package com.example.resto.Controllers;

import java.awt.PageAttributes.MediaType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.Response;
import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.util.StreamUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.MediaType.*;
import com.example.resto.Models.Category;
import com.example.resto.Models.Dish;
import com.example.resto.Models.extramodals.frontenddish;
import com.example.resto.Repository.CategoryReposetory;
import com.example.resto.Repository.DishRepository;
import com.example.resto.payload.FileResponse;
import com.example.resto.payload.copy;
import com.example.resto.services.Fileservices;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("manager")
public class Manager {
	
	@Autowired
	private CategoryReposetory categoryrepo;
	
	@Autowired
	private DishRepository dishrepo;
	
	@Autowired
	private Fileservices fileservice;
	
	
	//categories controllers
	 List<Category> al =new ArrayList<Category>();
	 
	 @GetMapping("/categories/get")
	 public List<Category> getCategories(){

		 al=categoryrepo.findAll();
		 return al;
	 }
	 
	 @PostMapping("/categories/remove")
	 public String removeCategories(@RequestBody Category cat){
		 Category existing= categoryrepo.findBycategoryName(cat.getCategoryName());
		 if(existing!=null) {
			 categoryrepo.findBycategoryName(cat.getCategoryName());
			 return "deleted";
		 }
		 return "category not found";
		 
	 }
	 
	 @PostMapping("/categories/add")
	 public Category saveCategory(@RequestBody Category cat) {
		  
		 Category existing= categoryrepo.findBycategoryName(cat.getCategoryName());
		 if(existing!=null) {
			 return null;
		 }
		 return categoryrepo.save(cat);
	 }

	 //dish controllers
	 List<Dish> dl=new ArrayList<Dish>();
	 
	 @GetMapping("dishes/get")
	 public List<Dish> getAlldishes() {
		 dl=(List<Dish>) dishrepo.findAll();
		 return dl;
	 }
	 
	 @GetMapping("dish/get")
	 public Dish getdishe(@RequestParam("dishName") String fd) {
		 Dish dish=dishrepo.findByname(fd);
		 return dish;
	 }
	 
	 @PostMapping("dish/add")
	 public String addDish(@RequestBody frontenddish fd) {
		
		Dish dishexistsalready=dishrepo.findByname(fd.getName());
		  if(dishexistsalready==null) {
			  
			  Category categoryexistsalready=categoryrepo.findBycategoryName(fd.getCategoryname());
			  if(categoryexistsalready==null) {
				  
				  return "no such category exists";
			  }
			  Dish newdish=new Dish(fd.getName(),fd.getPrice(),categoryexistsalready,fd.isVeg());
			  dishrepo.save(newdish);
			  return "Dish Added";
		  }
		 return "Dish Already Exists";
	 }

	 @PostMapping("dish/remove")
	 public String deleteDish(@RequestBody frontenddish fd) {
		 Dish dishexistsalready=dishrepo.findByname(fd.getName());
		 if(dishexistsalready==null){return "dish doest exist";}
		 dishrepo.delete(dishexistsalready);
		 return "deleted";
	 }
	 
	 
	 //add file
	 @Value("${project.image}")
	 private String path;
	 @PostMapping("upload/profilepic")
	 public ResponseEntity<String> fileupload(@RequestParam("image") MultipartFile image) {
		 String filename;
		filename = this.fileservice.uploadImage(path, image);
		 return new ResponseEntity<>(("uploaded successfully"),HttpStatus.OK);
	 }
	 
	 
	 
	 //serve file
	 @GetMapping("/download/{imagename}")
	 public void downloadprofilepic(@PathVariable String imagename, HttpServletResponse response) throws IOException {
		InputStream is =this.fileservice.getImage(path, imagename);
		response.setContentType(org.springframework.http.MediaType.IMAGE_PNG_VALUE);
//			);
		
		 Path tempFile = Files.createTempFile("temp", ".tmp");
		    Files.copy((Path) new FileInputStream(path +"/"+imagename), response.getOutputStream());
		   
		return ;
	 }
	 
}
