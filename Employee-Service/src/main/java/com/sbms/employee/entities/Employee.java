package com.sbms.employee.entities;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long id;

	@Column(name = "Employee_Name")
	private String employeeName;

	@OneToMany(targetEntity = PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPLOYEE_ID",referencedColumnName ="ID")   // FK column
	private Set<PhoneNumber> mobileNo;

	@OneToOne(targetEntity = EmployeeAddress.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "BillingAddress_Id")
	private EmployeeAddress billingAddress;

	@OneToOne(targetEntity = EmployeeAddress.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ShippingAddress_Id")
	private EmployeeAddress shippingAddress;

	public Employee(Long id, String employeeName, Set<PhoneNumber> mobileNo, EmployeeAddress billingAddress,
			EmployeeAddress shippingAddress) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.mobileNo = mobileNo;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<PhoneNumber> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Set<PhoneNumber> mobileNo) {
		this.mobileNo = mobileNo;
	}

	public EmployeeAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(EmployeeAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public EmployeeAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(EmployeeAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", mobileNo=" + mobileNo + ", billingAddress="
				+ billingAddress + ", shippingAddress=" + shippingAddress + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
