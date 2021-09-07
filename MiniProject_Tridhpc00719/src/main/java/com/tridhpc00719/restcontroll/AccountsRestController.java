package com.tridhpc00719.restcontroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tridhpc00719.Entity.Account;
import com.tridhpc00719.Entity.Product;
import com.tridhpc00719.Service.AccountService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/account")
public class AccountsRestController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("{username}")
	public Account getOne(@PathVariable("username") String name) {
		return accountService.findById(name);
	}

	@GetMapping()
	public List<Account> getAll() {
		return accountService.findAll();
	}
	
	@PostMapping
	public Account create(@RequestBody Account account) {
		return accountService.create(account);
	}

	@PutMapping("{username}")
	public Account update(@PathVariable("username") String id, @RequestBody Account account) {
		return accountService.update(account);
	}

	@DeleteMapping("/delete/{username}")
	public void delete(@PathVariable("username") String name) {
		System.out.println("user: "+name);
		accountService.deletefindById(name);
	}
}
