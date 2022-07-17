package com.sbms.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.customer.entities.Customer;
import com.sbms.customer.service.ICustomerAccountService;

@RestController
@RequestMapping("/customer/api")
public class CustomerAccountController {

	@Autowired
	private ICustomerAccountService service;

	@PostMapping("/customerSave")
	public ResponseEntity<Customer> addEmployee(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(service.addCustomer(customer), HttpStatus.CREATED);
	}

	@GetMapping("/findAll")
	public ResponseEntity<?> displayCustomers() {

		try {
			List<Customer> list = service.findAllCustomers();
			return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in fetching Customers", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	

}
