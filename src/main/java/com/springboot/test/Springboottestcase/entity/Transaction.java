package com.springboot.test.Springboottestcase.entity;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue
	private Long transactionId;
	private Long payName;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_id")
	private RegisterUser registerUser;
	private Long transaction_amt;
	
	
	public Long getTransactionId() {
		return transactionId;
	}
	public RegisterUser getRegisterUser() {
		return registerUser;
	}
	public void setRegisterUser(RegisterUser registerUser) {
		this.registerUser = registerUser;
	}
	public Long getTransaction_amt() {
		return transaction_amt;
	}
	public void setTransaction_amt(Long transaction_amt) {
		this.transaction_amt = transaction_amt;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	
	public Long getPayName() {
		return payName;
	}
	public void setPayName(Long payName) {
		this.payName = payName;
	}
	
	
	
	
}
