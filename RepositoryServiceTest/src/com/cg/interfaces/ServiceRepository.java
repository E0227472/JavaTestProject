package com.cg.interfaces;

import com.cg.beans.Customer;


public interface ServiceRepository {
	
	 public Customer createAccount (String name, String mobile, double balance); 
	 public Customer getBalance(String mobile);

}
