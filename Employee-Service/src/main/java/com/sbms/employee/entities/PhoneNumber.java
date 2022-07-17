package com.sbms.employee.entities;

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
@Table(name = "Emp_PhoneNo")
public class PhoneNumber implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "RegNo")
	@SequenceGenerator(name = "phone_seq", sequenceName = "regno_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "phone_seq")
	private Long regno;

	@Column(name = "Provider")
	private String provider;

	@Column(name = "Type")
	private String type;

	@ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID") // FK column
	@JsonIgnore
	private Employee employee;

	public Long getRegno() {
		return regno;
	}

	public void setRegno(Long regno) {
		this.regno = regno;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", provider=" + provider + ", type=" + type + ", employee=" + employee
				+ "]";
	}

	public PhoneNumber(Long regno, String provider, String type, Employee employee) {
		super();
		this.regno = regno;
		this.provider = provider;
		this.type = type;
		this.employee = employee;
	}

	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

}
