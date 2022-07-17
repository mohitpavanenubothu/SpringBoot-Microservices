package com.sbms.employee.service;

import java.util.List;

import com.sbms.employee.entities.Employee;

public interface IEmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> findAllEmployees();

}
