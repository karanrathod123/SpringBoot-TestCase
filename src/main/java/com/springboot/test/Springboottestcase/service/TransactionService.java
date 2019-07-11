package com.springboot.test.Springboottestcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.Springboottestcase.repository.TransactionRepository;


@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	
	
	public void getTransactionDetails() {
		
		transactionRepository.findAll();
	}

}
