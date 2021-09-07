package com.tridhpc00719.restcontroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tridhpc00719.Entity.Category;
import com.tridhpc00719.Service.CategoryService;

@CrossOrigin
@RestController
@RequestMapping("/rest/categories")
public class CategoryRestController {
	
	@Autowired
	CategoryService cateservice;
	
	@GetMapping()
	public List<Category> getAll(){
		return  cateservice.findAll();
	}
	
}
