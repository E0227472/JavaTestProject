package com.cg.repository;

import java.util.HashMap;
import java.util.Map;


import com.cg.beans.Customer;

public class Repository {
	
// save method. saves the customer object into a hashmap collection
// Test to see if the hashmap is able to save the customer obj
	public Customer save (Customer c) {
		// Stores data in the TreeMap in form of string (mobile no) and customer object
				Map<String, Customer> storecus = 
						new HashMap<String, Customer>();
		// store data
		storecus.put(c.getMobile(), c);
		return c;
	}
	// findbymobile method to find the cus object by mobile number
	public Customer findbymobile(String mobile){
		// Stores data in the TreeMap in form of string (mobile no) and customer object
		Map<String, Customer> storecus = 
				new HashMap<String, Customer>();
		// creating the sample customer data
		storecus.put("12345678", 
				new Customer("name1", "12345678",500.00));
		storecus.put("87654321", 
				new Customer("name2", "87654321",900.00));
		storecus.put("23456789", 
				new Customer("name3", "23456789",1000.00));
		
		// returns the customer object based on the mobile string key;
		Customer c = storecus.get(mobile);
		return c;
	}

}
