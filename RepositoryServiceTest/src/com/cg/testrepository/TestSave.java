package com.cg.testrepository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.beans.Customer;
import com.cg.beans.Wallet;
import com.cg.repository.Repository;
import com.cg.service.Service;

public class TestSave {
	
	Repository r;
	Service s;
	Wallet w;
	@Before
	public void init() {
		r = new Repository();
		s = new Service();
	}

	@Test
	public void savecustomerdata() {
	Customer c = new Customer("samplename", "23456",500.00);
	Customer c1 = r.save(c);
	assertTrue(c1.getMobile().equals("23456"));
	}

}
