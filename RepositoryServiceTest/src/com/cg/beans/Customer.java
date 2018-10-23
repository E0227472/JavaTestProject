package com.cg.beans;

public class Customer {

	private String name; 
	private String mobile;
	private Wallet wallet;
	private double balance;
	
	public Customer(String name, String mobile, double balance) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.balance = balance;
	}


	public Customer(String name, String mobile, Wallet wallet) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.wallet = wallet;
	}

	public Wallet getWallet() {
		return wallet;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + "]";
	}

	public String getMobile() {
		return mobile;
	}
	
	
	
	
	
}
