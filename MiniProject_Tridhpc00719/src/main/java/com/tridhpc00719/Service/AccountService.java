package com.tridhpc00719.Service;

import java.util.List;

import com.tridhpc00719.Entity.Account;

public interface AccountService {
	public Account findById(String name);

	public List<Account> getAdministrators();

	public List<Account> findAll();

	public Account create(Account account);

	public Account update(Account account);

	public void deletefindById(String name);
}
