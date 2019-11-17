package com.nk2164.domain;

import com.nk2164.domain.Customer;
import com.nk2164.domain.Order;

import junit.framework.TestCase;

/** 
 * Not for production purposes! This test is really just so we
 * have something to run with our Ant build.
 * 
 * @author Dick Chesterwood
 */
public class OrderTest extends TestCase 
{
	public void testOrdersCreatedOk()
	{
		Order testOrder = new Order();
		Customer testCustomer = new Customer("Jack Jones");
		testOrder.setCustomer(testCustomer);
		
		String orderAsString = testOrder.toString();
		assertEquals("The order didn't render as a string properly",
		             "Order for Jack Jones",
		             orderAsString);
	}
}
