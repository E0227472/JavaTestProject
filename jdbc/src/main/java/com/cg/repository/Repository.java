package com.cg.repository;

import java.sql.SQLException;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;

public interface Repository {
	// save customer to repository 
	// InvalidInputException
	// findbymobile method to find the cus object by mobile number
	public Customer findbymobile(String mobile) throws AccountNotFoundException;
	// InvalidInputException
	public void save (Wallet w, Customer c) throws InvalidInputException, 
	SQLException;

}