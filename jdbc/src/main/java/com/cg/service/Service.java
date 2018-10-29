package com.cg.service;

import java.sql.SQLException;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InsufficientBalanceException;
import com.cg.exceptions.InvalidInputException;

public interface Service {
	// create Customer method 
	public void create (Wallet w, Customer c)
			throws InvalidInputException, SQLException;
	
	public Customer getBalance(String mobile) 
			throws AccountNotFoundException, InvalidInputException;
//	public Customer FundTransfer
//	(String fromMobile, String toMobile, double amount)
//			throws AccountNotFoundException,InvalidInputException, InsufficientBalanceException;
//
//	public Customer deposit (String mobile, double amount)
//			throws AccountNotFoundException,InvalidInputException, InsufficientBalanceException;


}
