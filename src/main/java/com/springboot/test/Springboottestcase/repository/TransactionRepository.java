package com.springboot.test.Springboottestcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.test.Springboottestcase.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	
	
	
}
