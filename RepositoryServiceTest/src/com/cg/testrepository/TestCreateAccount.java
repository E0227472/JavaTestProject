package com.cg.testrepository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.repository.Repository;
import com.cg.service.Service;

public class TestCreateAccount {
	
	Repository r;
	Service s;
	Customer c; 
	Wallet w;
	@Before
	public void init() {
		r = new Repository();
		s = new Service();
		
	}
	
	@Test 
	public void createaccountcorrectvalues() {
		// method to create account
		 c = s.createAccount("name1", "12345678", 200.00);
		assertTrue(c.getMobile().equals("12345678"));	
	}
	
	@Test
	public void getbalancecorrectreturn() {
		// method to create account
		 c = s.getBalance("12345678");
		  w = c.getWallet();
		  double balance = w.getBalance();
		  assertTrue(2000.00 == balance);
		  
	}
	// testing for exception example
	@Test (expected = Exception.class)
	public void getbalancecorrectreturn() {
		// method to create account
		 c = s.getBalance("12345678");
		  w = c.getWallet();
		  double balance = w.getBalance();
		  assertTrue(2000.00 == balance);
		  
	}
	
	
	

}