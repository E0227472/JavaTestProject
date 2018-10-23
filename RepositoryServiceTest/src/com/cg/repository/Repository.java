package com.cg.repository;

import java.util.HashMap;
import java.util.Map;




import com.cg.beans.Customer;
import com.cg.data.StoreCustomerData;
import com.cg.interfaces.RepositoryInterface;

public class Repository implements RepositoryInterface {
	
// save method. saves the customer object into a hashmap collection
// Test to see if the hashmap is able to save the customer object
	public Customer save (Customer c) {
//		// Stores data in the TreeMap in form of string (mobile no) and customer object
//				Map<String, Customer> storecus = 
//						new HashMap<String, Customer>();
//		// store data
//		storecus.put(c.getMobile(), c);
		StoreCustomerData d = new StoreCustomerData();
		d.storeCustomer(c);
		Customer c1 = d.getStorecus(c.getMobile());
		return c1;
	}
	
	// findbymobile method to find the cus object by mobile number
	public Customer findbymobile(String mobile){
		// retrieve customer data from data repository
		StoreCustomerData d = new StoreCustomerData();
		// returns the customer object based on the mobile string key;
		Customer c = d.getStorecus(mobile);
		return c;
	}
	
	public static void main(String[] args) {
		StoreCustomerData d = new StoreCustomerData();
		Customer c = new Customer("sam", "mon", 200.00);
		d.storeCustomer(c);
		Customer c1 = d.getStorecus("mon");
		System.out.println(c1.getMobile());
	}
}
