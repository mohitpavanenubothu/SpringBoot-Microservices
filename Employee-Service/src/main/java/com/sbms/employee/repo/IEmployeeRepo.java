package com.sbms.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbms.employee.entities.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Long> {

}
