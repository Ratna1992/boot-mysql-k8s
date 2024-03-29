package com.boot.mysql.k8s.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.mysql.k8s.entity.Order;
import com.boot.mysql.k8s.service.OrderService;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {
	@Autowired
	private OrderService service;

	@PostMapping
	public Order addOrder(@RequestBody Order order) {
		return service.addOrder(order);
	}

	@GetMapping
	public List<Order> getOrders() {
		return service.getOrders();
	}

	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable int id) {
		return service.getOrderById(id);
	}
}
