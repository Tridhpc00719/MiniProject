package com.tridhpc00719.Serivce.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tridhpc00719.DAO.AccountDAO;
import com.tridhpc00719.DAO.AuthorityDAO;
import com.tridhpc00719.Entity.Account;
import com.tridhpc00719.Entity.Authority;
import com.tridhpc00719.Service.AuthorityService;

@Service
public class AuthorityImpl  implements AuthorityService{
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO cadao;
	
	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return  dao.findAll() ;
	}

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = cadao.getAdministrators();
 		return dao.AuthorityOf(accounts);
	}

	@Override
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return dao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
