package com.cg.repository;

import java.util.HashMap;

import java.util.Map;
import com.cg.beans.Customer;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;
import com.cg.interfaces.RepositoryInterface;

public class Repository implements RepositoryInterface {

	public Customer save (Customer c) 
			throws InvalidInputException
	{
		if(c ==null) {
			throw new InvalidInputException("Input type is not correct");
		}

		
		String sql = "INSERT INTO customer (username, password, fullname, email) VALUES (?, ?, ?, ?)";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString();
		statement.setString(2, "secretpass");
		statement.setString(3, "Bill Gates");
		statement.setString(4, "bill.gates@microsoft.com");

		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");

		}

		// findbymobile method to find the cus object by mobile number
		public Customer findbymobile(String mobile)
				throws AccountNotFoundException {	
			// returns the customer object based on the mobile string key;

			return data.get(mobile);
		}
	}
