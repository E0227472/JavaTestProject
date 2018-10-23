package com.cg.interfaces;


import com.cg.beans.Customer;

public interface RepositoryInterface {
	// save customer to repository 
	public Customer save (Customer c);
	// findbymobile method to find the cus object by mobile number
	public Customer findbymobile(String mobile);

}
