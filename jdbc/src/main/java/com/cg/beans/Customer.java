package com.cg.beans;

public class Customer {
	private int id;
	private String name;
	private String mobile;
	private int wallet_id;
	private Wallet wallet;



	public Customer() {

	}
	public Customer(String name, String mobile, Wallet wallet) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.wallet = wallet;
	}
	
	public Customer(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Customer(int id, String name, String mobile, int wallet_id) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.wallet_id = wallet_id;
	}
	
	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public int getId() {
		return id;
	}

	public int getWallet_id() {
		return wallet_id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile=" + mobile + "]";
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
