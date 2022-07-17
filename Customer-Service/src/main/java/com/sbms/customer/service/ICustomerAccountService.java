package com.sbms.customer.service;

import java.util.List;

import com.sbms.customer.entities.Customer;

public interface ICustomerAccountService {

	public Customer addCustomer(Customer customer);

	public List<Customer> findAllCustomers();
	
	
}
