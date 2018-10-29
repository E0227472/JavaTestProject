package com.cg.beans;

public class Wallet {
	private int id;
	private double balance;
		
	public Wallet(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public Wallet(double balance) {
		this.balance = balance;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Wallet () {
		
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


}
