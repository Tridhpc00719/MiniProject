package com.tridhpc00719.restcontroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.tridhpc00719.Entity.Order;
import com.tridhpc00719.Service.OrderService;

@CrossOrigin
@RestController
@RequestMapping("/rest/orders")
public class OrderRestcontroller {
	@Autowired
	OrderService ordersv;
	
	@PostMapping()
	public Order getOne (@RequestBody JsonNode orderData) {
		System.out.println("Success1");
		return ordersv.create(orderData);	
	}

}
