package com.cg.service;


import com.cg.beans.Customer;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;
import com.cg.interfaces.RepositoryInterface;
import com.cg.interfaces.ServiceRepository;
import com.cg.repository.Repository;

public class Service implements ServiceRepository {
	
	private RepositoryInterface r;
	
	public Service() {
		r = new Repository();
	}

	// create account method 
 public Customer createAccount (String name, String mobile, double balance)
 throws InvalidInputException
 {	
	 Customer c = new Customer(name,mobile, balance);
	if(!mobile.matches(".*\\d+.*")){
		throw new InvalidInputException("Please enter only numbers");
	}
	 Customer c1 = r.save(c); 
	 return c1;
 }
 // getbalance for the respective customer
 public Customer getBalance(String mobile) 
		 throws AccountNotFoundException, InvalidInputException {

	 if(mobile == null){
		 throw new AccountNotFoundException("Account not found");
	 }

	 if(!mobile.matches(".*\\d+.*")){
			throw new InvalidInputException("Please enter only numbers");
		}
	 return r.findbymobile(mobile);
	  
 }
}
