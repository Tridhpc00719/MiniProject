package com.tridhpc00719.Serivce.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.tridhpc00719.DAO.OrderDAO;
import com.tridhpc00719.DAO.OrderDetailDAO;
import com.tridhpc00719.Entity.Order;
import com.tridhpc00719.Entity.OrderDetail;
import com.tridhpc00719.Service.OrderService;

@Service
public class orderImpl  implements OrderService{
	@Autowired
	OrderDAO dao;
	@Autowired
	OrderDetailDAO ddao;
	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper = new ObjectMapper();
		Order order = mapper.convertValue(orderData, Order.class);
		dao.save(order);
//		System.out.println("Success");
		TypeReference<List<OrderDetail>> type = new TypeReference< List<OrderDetail>>() {};
		List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"), type)
				.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
		ddao.saveAll(details);
		
			
		return order;
	}
	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findAllById(id);
	}
	@Override
	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		return dao.findByUsername(username);
	}
	
	

}
