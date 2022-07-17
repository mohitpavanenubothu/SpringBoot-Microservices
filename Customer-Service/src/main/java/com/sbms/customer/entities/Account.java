package com.sbms.customer.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Account_Details")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "AccNo")
	@SequenceGenerator(name = "acc_seq", sequenceName = "acc_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_seq")
	private Long accNo;

	@Column(name = "Account_Type")
	private String accType;

	@Column(name = "Amount")
	private Double amount;

	@ManyToOne(targetEntity = Customer.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID") // FK column
	@JsonIgnore
	private Customer customer;

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", amount=" + amount + ", customer=" + customer
				+ "]";
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(Long accNo, String accType, Double amount, Customer customer) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.amount = amount;
		this.customer = customer;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

}
