package com.nk2164.services;

import com.nk2164.domain.Book;
import com.nk2164.domain.Customer;

public interface AccountsService 
{
	public void raiseInvoice(Book requiredBook);
	
	public Customer findCustomer(String id) throws CustomerNotFoundException;
}
