package com.cg.data;

import java.util.HashMap;
import java.util.Map;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;

public class StoreWalletData {
	// Stores data in the Hashmap in form of string (mobile no) and customer
	// object
	// storing wallet objects based on the Customer mobile number
		private Map<String, Wallet> mapwallet 
			 = new HashMap<String, Wallet>();

	public StoreWalletData() {
		 //Creating sample wallets for the customers
		 mapwallet.put("12345678", new Wallet(2000.00));
		 mapwallet.put("87654321", new Wallet(1000.00));
		 mapwallet.put("23456789", new Wallet(3000.00));
	}

	// gets the customer object based on the mobile number
	public Wallet getWalletData (String mobile) {
		Wallet w = this.mapwallet.get(mobile);
		return w;
	}

	// store customer data based on customer object
	public void walletData(String mobile, Wallet w) {
		this.mapwallet.put(mobile, w);
	}

}
