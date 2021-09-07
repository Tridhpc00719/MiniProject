package com.tridhpc00719.Service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.tridhpc00719.Entity.Order;

public interface OrderService {



	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);

}
