package com.tridhpc00719.Service;

import java.util.List;

import com.tridhpc00719.Entity.Authority;

public interface AuthorityService {

	public List<Authority> findAll();

	public List<Authority> findAuthoritiesOfAdministrators();

	public Authority create(Authority auth);

	public void delete(Integer id);

}
