package com.tridhpc00719.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tridhpc00719.Entity.Account;
import com.tridhpc00719.Entity.Authority;

public interface AuthorityDAO  extends JpaRepository<Authority, Integer>{

	
@Query("SELECT DISTINCT a FROM Authority a where a.account IN ?1 ")
List<Authority> AuthorityOf(List<Account> accounts);




}
