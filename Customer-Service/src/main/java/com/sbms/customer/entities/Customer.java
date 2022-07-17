package com.sbms.customer.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_Details")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long id;

	@Column(name = "Customer_Name")
	private String cName;

	@Column(name = "Aadhar_Number")
	private Long cAadhar;

	@OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID") // FK column
	private Set<Account> account;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Long getcAadhar() {
		return cAadhar;
	}

	public void setcAadhar(Long cAadhar) {
		this.cAadhar = cAadhar;
	}

	public Set<Account> getAccount() {
		return account;
	}

	public void setAccount(Set<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cName=" + cName + ", cAadhar=" + cAadhar + ", account=" + account + "]";
	}

	public Customer(Long id, String cName, Long cAadhar, Set<Account> account) {
		super();
		this.id = id;
		this.cName = cName;
		this.cAadhar = cAadhar;
		this.account = account;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
