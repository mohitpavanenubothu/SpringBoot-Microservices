package com.sbms.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.employee.entities.Employee;
import com.sbms.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@PostMapping("/employeeSave")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(service.saveEmployee(employee), HttpStatus.CREATED);
	}

	@GetMapping("/findAll")
	public ResponseEntity<?> displayTourists() {

		try {
			List<Employee> list = service.findAllEmployees();
			return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in fetching Employees", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
