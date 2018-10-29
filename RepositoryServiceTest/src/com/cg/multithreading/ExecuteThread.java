package com.cg.multithreading;

import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;
import com.cg.interfaces.Service;
import com.cg.service.ServiceImpl;

public class ExecuteThread {

	public static void main(String[] args) throws InvalidInputException, AccountNotFoundException, InterruptedException {
		Service s = new ServiceImpl();		
		s.createAccount("name1", "123456789", 600);
		s.createAccount("name2", "23456789", 2000);
		// new ServiceImpl() reference is passed into the ThreadingProblem constructor.
		Runnable tp = new ThreadingProblem(s);

		Thread t1 = new Thread(tp);
		Thread t2 = new Thread(tp);
		// the start method passes the run method to the jvm. the service will the carry out fundtransfer method
		t1.start();
		t2.start();

		Thread.sleep(2000);

		System.out.println(s.getBalance("123456789").getWallet().getBalance());
		System.out.println(s.getBalance("23456789").getWallet().getBalance());
	}
}
