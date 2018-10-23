package com.cg.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.repository.Repository;

public class Service {
	Repository r;
	public Service(){
		r = new Repository();
	}
	
	// create account method 
 public Customer createAccount (String name, String mobile, double balance) 
 {	
	 Customer c = new Customer(name,mobile, balance);
	 Customer c1 = r.save(c); 
	 return c1;
 }
 // getbalance for the respective customer
 public Customer getBalance(String mobile) {
	 // storing wallet objects based on the Customer mobile number
	 Map<String, Wallet> mapwallet = new HashMap<String, Wallet>();
	 //Creating sample wallets for the customers
	 mapwallet.put("12345678", new Wallet(2000.00));
	 mapwallet.put("87654321", new Wallet(1000.00));
	 mapwallet.put("23456789", new Wallet(3000.00));
	 // getting the wallet object based on the customer mobile number
	 Wallet w = mapwallet.get(mobile);
	 
	 // storing customer object based on the Customer mobile number
	 Map<String, Customer> cusCustomer = new HashMap<String, Customer>();
	 cusCustomer.put(mobile, new Customer("name1", mobile, w));
	 Customer c = cusCustomer.get(mobile); 
	 return c;
 }
 

}
