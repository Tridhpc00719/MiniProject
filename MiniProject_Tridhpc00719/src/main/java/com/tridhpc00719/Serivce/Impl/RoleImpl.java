package com.tridhpc00719.Serivce.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tridhpc00719.DAO.RoleDAO;
import com.tridhpc00719.Entity.Role;
import com.tridhpc00719.Service.RoleService;

@Service
public class RoleImpl implements RoleService {
	@Autowired
	RoleDAO dao ;
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
