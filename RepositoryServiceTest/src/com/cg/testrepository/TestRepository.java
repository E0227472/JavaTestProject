package com.cg.testrepository;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.cg.beans.Customer;
import com.cg.exceptions.AccountNotFoundException;
import com.cg.exceptions.InvalidInputException;
import com.cg.repository.RepositoryImpl;
import com.cg.service.ServiceImpl;

public class TestRepository {
	
	RepositoryImpl r;
	ServiceImpl s;
	
	@Before
	public void init() {
		r = new RepositoryImpl();
		s = new ServiceImpl();
		try {
			Customer c1 = s.createAccount("testname", "12345678", 500.00);
			Customer c2 = s.createAccount("testname2", "23456789", 700.00);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test 
	public void find_by_mobile_correct_values() 
			throws AccountNotFoundException, InvalidInputException 
	{
		// return customer object based on findbymobile method
		Customer c1 = s.createAccount("testname", "12345678", 500.00);
		assertTrue(c1.getWallet().getBalance() == 500.00);
	}

	
//	// account cannot be found based on number
//	@Test (expected = AccountNotFoundException.class)
//	public void find_by_mobile_no_account_exists() 
//			throws AccountNotFoundException 
//	{
//		Customer c = r.findbymobile("12");
////		assertTrue(c.getMobile().equals("12345678"));	
//	}
//	
//	// incorrect input letters
//	@Test (expected = AccountNotFoundException.class)
//	public void FindByMobilenoincorrectInput() 
//			throws AccountNotFoundException
//	{
//		Customer c = r.findbymobile("wew");
//		assertTrue(c.getMobile().equals("12345678"));	
//	}
//	
//		// incorrect input alphanumeric
//		@Test (expected = AccountNotFoundException.class)
//		public void FindByMobilenoincorrectInputalpha() 
//				throws AccountNotFoundException
//		{
//			Customer c = r.findbymobile("12sde");
//			assertTrue(c.getMobile().equals("12345678"));	
//		}
//	
//		// incorrect input null values
//		@Test (expected = AccountNotFoundException.class)
//		public void FindByMobilenoincorrectInputnull() 
//				throws AccountNotFoundException
//		{
//			Customer c = r.findbymobile(null);
//			assertTrue(c.getMobile().equals("12345678"));	
//		}
//		
//		// incorrect input empty Strings
//		@Test (expected = AccountNotFoundException.class)
//		public void FindByMobilenoincorrectemptystr() 
//				throws AccountNotFoundException
//		{
//			Customer c = r.findbymobile("");
//			assertTrue(c.getMobile().equals("12345678"));	
//		}
//		
//		

}
