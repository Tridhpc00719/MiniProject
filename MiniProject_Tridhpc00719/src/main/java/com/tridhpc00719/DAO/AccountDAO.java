package com.tridhpc00719.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tridhpc00719.Entity.Account;

public interface AccountDAO extends JpaRepository<Account, String>{
@Query("SELECT DISTINCT ar.account FROM Authority ar Where ar.role.id IN ('DIRE','STAF')")
	List<Account> getAdministrators();

}
