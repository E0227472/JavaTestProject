package com.cg.interfaces;

import com.cg.beans.Customer;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InsufficientBalanceException;
import com.cg.exceptions.InvalidInputException;

// Rename ServiceRepository to ServiceWallet
public interface ServiceRepository {
	
	 public Customer createAccount (String name, String mobile, double balance) throws InvalidInputException; 
	 public Customer getBalance(String mobile) 
			 throws AccountNotFoundException, InvalidInputException;

}
