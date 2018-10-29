package com.cg.service;

import java.sql.SQLException;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;
import com.cg.repository.Repository;
import com.cg.repository.RepositoryImpl;

public class ServiceImpl implements Service {
	// always Make reference to the interface since its a contract,
	// methods are being called from here
	private Repository r;

	public ServiceImpl() {
		r = new RepositoryImpl();
	}
	
	public ServiceImpl(Repository r) {
		this.r = r;
	}

	// create wallet and customer object
	public void create (Wallet w, Customer c)
			throws InvalidInputException, SQLException
	{	
		if(!c.getMobile().matches(".*\\d+.*")){
			throw new InvalidInputException("Please enter only numbers");
		}
		
		r.save(w, c);
	}
	
	// getbalance for the respective customer
	public Customer getBalance(String mobile) 
			throws AccountNotFoundException, InvalidInputException {

		if(mobile == null){
			throw new AccountNotFoundException("Account not found");
		}

		if(!mobile.matches(".*\\d+.*")){
			throw new InvalidInputException("Please enter only numbers");
		}
		return r.findbymobile(mobile);

	}
//	// Fundtransfer from customer 1 to Customer 2
//	// return customer object (frommobile)
//	public void FundTransfer (String fromMobile, String toMobile, double amount) 
//			throws AccountNotFoundException, InvalidInputException, InsufficientBalanceException {
//		// get customer objects based on mobile number
//		Customer fromTransfer = r.findbymobile(fromMobile); 
//		synchronized (fromTransfer) {
//			if (amount < 0) throw new InvalidInputException ("Amount cannot be negative");
//			if (fromTransfer.getWallet().getBalance() < amount) throw new InsufficientBalanceException ("Insufficient balance");
//			//set the balance for the customer object 
//			fromTransfer.getWallet().setBalance(fromTransfer.getWallet().getBalance()-amount);
//			return fromTransfer;
//		}
//	}
//	// add balance to the customer deposit
//	public Customer deposit (String mobile, double amount) 
//			throws AccountNotFoundException 
//	{
//		// get the customer objects based on the mobile number
//		Customer customerDepositing = r.findbymobile(mobile);
//		// get the wallet from the customer who is transferring
//		Wallet customerDepositW = customerDepositing.getWallet();
//		// set the balance for the customer who is transferring amount
//		customerDepositW.setBalance(customerDepositW.getBalance()+amount);
//		return customerDepositing;
//	}
}

