package com.springboot.test.Springboottestcase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.Springboottestcase.entity.Account;
import com.springboot.test.Springboottestcase.entity.RegisterUser;
import com.springboot.test.Springboottestcase.repository.RegisterRepository;

@Service
public class LoginService {

	@Autowired
	RegisterRepository registerRepository;
	
	
	
	
	public Boolean getAunthenticate(RegisterUser registerUser) {
		// TODO Auto-generated method stub
//		List<RegisterUser> registerUsers = registerRepository.find();
		/*
		 * for (RegisterUser registerUser2 : registerUsers) { if
		 * (registerUser2.getAccountName().equalsIgnoreCase(registerUser.getAccountName(
		 * )) && registerUser2.getPassword().equals(registerUser.getPassword())) {
		 * return true; } else { return false; }
		 * 
		 * }
		 */
		return false;

	}


	public RegisterUser loginServiceValidate(String username, String password) {
		// TODO Auto-generated method stub

		return registerRepository.findByUsernameAndPassword(username,password);
		
	}


	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		registerRepository.save(account);
	}

}
