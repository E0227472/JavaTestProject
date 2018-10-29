package com.cg.multithreading;

import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InsufficientBalanceException;
import com.cg.exceptions.InvalidInputException;
import com.cg.interfaces.Service;


public class ThreadingProblem implements Runnable {

	private Service s;
	// the class reference must be passed through the interface
	 public ThreadingProblem(Service s) {
		// TODO Auto-generated constructor stub
		 // Service s reference with new ServiceImpl() passed into the constructor
		this.s = s;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		try {
			s.FundTransfer("123456789", "23456789", 30);
		} catch (AccountNotFoundException | InvalidInputException
				| InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
