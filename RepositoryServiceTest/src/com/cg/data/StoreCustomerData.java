package com.cg.data;

import java.util.HashMap;
import java.util.Map;

import com.cg.beans.Customer;

public class StoreCustomerData {
	// Stores data in the Hashmap in form of string (mobile no) and customer object
	private	Map<String, Customer> storecus = 
			new HashMap<String, Customer>();
	
	public StoreCustomerData() {
		// creating the sample customer data
		storecus.put("12345678", 
				new Customer("name1", "12345678",500.00));
		storecus.put("87654321", 
				new Customer("name2", "87654321",900.00));
		storecus.put("23456789", 
				new Customer("name3", "23456789",1000.00));
		
	}
	// gets the customer object based on the mobile number
	public Customer getStorecus(String mobile) {
		Customer c = this.storecus.get(mobile);
		return c;
	}
	// store customer data based on customer object
	public void storeCustomer(Customer c) {
		this.storecus.put(c.getMobile(), c);
	}
}
