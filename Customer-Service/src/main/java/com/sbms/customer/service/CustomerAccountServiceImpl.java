package com.sbms.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.customer.entities.Customer;
import com.sbms.customer.repo.ICustomerAccountRepo;

@Service
public class CustomerAccountServiceImpl implements ICustomerAccountService {

	@Autowired
	private ICustomerAccountRepo custRepo;

	@Override
	public Customer addCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> list = custRepo.findAll();
		list.sort((t1, t2) -> t1.getId().compareTo(t2.getId()));
		return list;
	}

	

}
