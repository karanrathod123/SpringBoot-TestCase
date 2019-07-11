package com.springboot.test.Springboottestcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.Springboottestcase.entity.RegisterUser;
import com.springboot.test.Springboottestcase.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository registerRepository;
	
	public void saveUser(RegisterUser registerUser) {
		// TODO Auto-generated method stub
		registerRepository.save(registerUser);
		System.out.println("Registration Succesfully");
	}

}
