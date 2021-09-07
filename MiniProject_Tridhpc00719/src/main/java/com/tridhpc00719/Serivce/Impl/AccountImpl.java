package com.tridhpc00719.Serivce.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tridhpc00719.DAO.AccountDAO;
import com.tridhpc00719.Entity.Account;
import com.tridhpc00719.Service.AccountService;

@Service
public class AccountImpl implements AccountService{
	@Autowired
	AccountDAO dao;
	@Override
	public Account findById(String name) {
		// TODO Auto-generated method stub
		return dao.findById(name).get();
	}
	@Override
	public List<Account> getAdministrators() {
		// TODO Auto-generated method stub
		return dao.getAdministrators();
	}
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	
	@Override
	public Account create(Account account) {
		// TODO Auto-generated method stub
		return dao.save(account);
	}
	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return dao.save(account);
	}
	@Override
	public void deletefindById(String name) {
		// TODO Auto-generated method stub
		
	}

}
