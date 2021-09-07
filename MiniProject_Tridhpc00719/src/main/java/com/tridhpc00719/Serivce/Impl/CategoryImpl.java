package com.tridhpc00719.Serivce.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tridhpc00719.DAO.CategoryDAO;
import com.tridhpc00719.Entity.Category;
import com.tridhpc00719.Service.CategoryService;

@Service
public class CategoryImpl implements CategoryService {
@Autowired
CategoryDAO cdao;
	@Override
	public List<Category> findAll() {
	
		return cdao.findAll();
	}

}
