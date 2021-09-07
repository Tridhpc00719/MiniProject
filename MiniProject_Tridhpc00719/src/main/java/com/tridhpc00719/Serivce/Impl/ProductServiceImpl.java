package com.tridhpc00719.Serivce.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tridhpc00719.DAO.ProductDAO;
import com.tridhpc00719.Entity.Product;
import com.tridhpc00719.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductDAO proDao;

	@Override
	public List<Product> findAll() {
		return proDao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return proDao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return proDao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return proDao.save(product);
	}

	@Override
	public Product update(Product product) {
		
		return proDao.save(product);
	}

	

	@Override
	public void deletefindById(Integer id) {
		/* proDao.findById(id); */
		 proDao.deleteById(id);
		
	}

	

	
}
