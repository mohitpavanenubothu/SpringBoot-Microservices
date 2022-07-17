package com.sbms.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sbms.customer.entities.Account;
import com.sbms.customer.entities.Customer;

@Repository
public interface ICustomerAccountRepo extends JpaRepository<Customer, Long> {

	@Query(value = "SELECT AMOUNT FROM ACCOUNT_DETAILS WHERE ACC_NO = ?1", nativeQuery = true)
	public Account getBalanceOf(Long accNo);

}
