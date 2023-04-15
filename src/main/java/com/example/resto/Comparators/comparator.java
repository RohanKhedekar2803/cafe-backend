package com.example.resto.Comparators;

import java.util.Comparator;

import com.example.resto.Models.Dish;

public class comparator {
	 public static Comparator<Dish> pricecomparator = new Comparator<Dish>() {
		 
	        // Method
	        public int compare(Dish s1, Dish s2) {
	 
	            long rollno1 = s1.getPrice();
	            long rollno2 = s2.getPrice();
	 
	            // For ascending order
	            return (int) (rollno1 - rollno2);
	 
	            // For descending order
	            // rollno2-rollno1;
	        }
	    };
	    
	    public static Comparator<Dish> pricecomparator2 = new Comparator<Dish>() {
			 
	        // Method
	        public int compare(Dish s1, Dish s2) {
	 
	            long rollno1 = s1.getPrice();
	            long rollno2 = s2.getPrice();
	 
	            // For ascending order
	            return (int) (rollno2 - rollno1);
	 
	            // For descending order
	            // rollno2-rollno1;
	        }
	    };
	 
	  
	    
}
