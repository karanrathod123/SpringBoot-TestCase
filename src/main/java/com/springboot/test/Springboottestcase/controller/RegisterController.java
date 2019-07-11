package com.springboot.test.Springboottestcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.Springboottestcase.entity.RegisterUser;
import com.springboot.test.Springboottestcase.service.RegisterService;


@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	/**
	 * This method is used to check response in the application.
	 * @ResponseEntity is used to give response body in the application.
	 */
	@GetMapping("/user")
	public ResponseEntity getPage() {
		return new ResponseEntity("Sign-in", HttpStatus.OK);
	}
	
	/**
	 * This method is used to save registerUser in the application.
	 * @RequestBody to pass the object property in the application
	 */
	@PostMapping("/registerUser")
	public void saveUser(@RequestBody RegisterUser registerUser) {
		
		registerService.saveUser(registerUser);
		
	}
	

	
	
}
