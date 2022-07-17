package com.sbms.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.employee.entities.Employee;
import com.sbms.employee.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> list = repo.findAll();
		list.sort((t1, t2) -> t1.getId().compareTo(t2.getId()));
		return list;
	}

}
