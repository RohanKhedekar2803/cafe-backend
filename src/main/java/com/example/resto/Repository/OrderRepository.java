package com.example.resto.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.resto.Models.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

	Order save(Order o1);

}
