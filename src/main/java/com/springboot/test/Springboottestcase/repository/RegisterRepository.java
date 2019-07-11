package com.springboot.test.Springboottestcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.test.Springboottestcase.entity.Account;
import com.springboot.test.Springboottestcase.entity.RegisterUser;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterUser, Long>{
	
//	public RegisterUser findByUsernameAndPassword(String username, String password);

	public void save(Account account);

	public RegisterUser findByUsernameAndPassword(String username, String password);

}
