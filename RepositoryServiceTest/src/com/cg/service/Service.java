package com.cg.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.data.StoreWalletData;
import com.cg.interfaces.ServiceRepository;
import com.cg.repository.Repository;

public class Service implements ServiceRepository {

	// create account method 
 public Customer createAccount (String name, String mobile, double balance) 
 {	
	 Repository r = new Repository();
	 Customer c = new Customer(name,mobile, balance);
	 Customer c1 = r.save(c); 
	 return c1;
 }
 // getbalance for the respective customer
 public Customer getBalance(String mobile) {
	 StoreWalletData wd = new StoreWalletData();
	 Customer c = new Customer(); 
	 Wallet w = wd.getWalletData(mobile);
	 c.setWallet(w);
	 return c;
 }
}
