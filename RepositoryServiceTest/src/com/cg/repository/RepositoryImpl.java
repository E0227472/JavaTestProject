package com.cg.repository;

import java.util.HashMap;
import java.util.Map;

import com.cg.beans.Customer;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;
import com.cg.interfaces.Repository;

public class RepositoryImpl implements  Repository {
	// Use CustomerStoreData instead for class name
	
	private Map<String,Customer> data;
	
	public RepositoryImpl() {
		this.data = new HashMap<String,Customer>();
	}
	
	public RepositoryImpl(Map<String,Customer> data) {
		this.data = data;
	}
	
// save method. saves the customer object into a hashmap collection
// Test to see if the hashmap is able to save the customer object
	public Customer save (Customer c) 
			throws InvalidInputException
	{
		if(c ==null) {
			throw new InvalidInputException("Input type is not correct");
		}
		// passes the customer object into the hashmap and saves it in the hashmap
		data.put(c.getMobile(), c);
		return c;
	}
	
	// findbymobile method to find the cus object by mobile number
	public Customer findbymobile(String mobile)
			throws AccountNotFoundException {	
		// returns the customer object based on the mobile string key;
		return data.get(mobile);
	}
}
