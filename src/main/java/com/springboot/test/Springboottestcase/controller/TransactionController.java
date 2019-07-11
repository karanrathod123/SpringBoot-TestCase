package com.springboot.test.Springboottestcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.Springboottestcase.service.TransactionService;

@RestController
@RequestMapping("/transactionServices")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	/*
	 * @ResponseBody public void getTransactionDetails() {
	 * 
	 * transactionService.getTransactionDetails();
	 * 
	 * }
	 */

}
