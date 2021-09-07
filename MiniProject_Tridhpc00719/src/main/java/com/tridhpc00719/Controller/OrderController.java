package com.tridhpc00719.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tridhpc00719.Service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	
	
	@RequestMapping("/oder/checkout")
	public String checkout() {
		return "oder/checkout";
	}
	
	@RequestMapping("/cart/view")
	public String list() {
		return "oder/list";
	}
	@RequestMapping("/order/list")
	public String listinfo(Model model, HttpServletRequest request) {
		String username = request.getRemoteUser();
		model.addAttribute("order",orderService.findByUsername(username));
		return "oder/info";
	}
	
	
	@RequestMapping("/order/detail/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {
		model.addAttribute("order",orderService.findById(id));
		return "oder/detail";
	}
}
