package com.tridhpc00719.Service;

import java.util.List;

import com.tridhpc00719.Entity.Product;

public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product) ;

	Product update(Product product);

	
	void deletefindById(Integer id);
		
	


}