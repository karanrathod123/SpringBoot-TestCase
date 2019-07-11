package com.springboot.test.Springboottestcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.Springboottestcase.entity.Account;
import com.springboot.test.Springboottestcase.entity.RegisterUser;
import com.springboot.test.Springboottestcase.service.LoginService;

@RestController
@RequestMapping("/loginService")
public class LoginController {

	@Autowired
	LoginService loginService;

	/*
	 * @PostMapping("/loginUser") public void Userlogin(@RequestBody RegisterUser
	 * registerUser) { Boolean b = loginService.getAunthenticate(registerUser);
	 * 
	 * if (b == true) { new TransactionController().getTransactionDetails(); //
	 * loginService.Userlogin(); System.out.println("<<<<<<<<<<<Login Succesfully");
	 * 
	 * // loginService.Userlogin(registerUser); } else {
	 * System.out.println("------------Login Failed"); } }
	 */
	public static String getAccountNo() {
		return null;
		
	}
	/**
	 * This method is used to check registerUser login in the application by passing username and password.
	 * @RequestParam to pass the object property in the application
	 */
	@PostMapping("/loginCustomer")
	public void loginServiceValidate(@RequestParam(value = "username")String username,@RequestParam(value = "password")String password)
	{
		RegisterUser registerUser = loginService.loginServiceValidate(username,password);
		System.out.println("fffffff"+registerUser);
		if(registerUser==null) {
			System.out.println("Incorrect username and password");
		}else {
			
			String accountNo = getAccountNo();
			Account account = new Account();
			account.setUserId(registerUser.getUserId());

			account.setAccNo("46757");
			account.setBalance(10000);
			loginService.createAccount(account);

		}
		
	}	
		
		
	
	
	
	

}
