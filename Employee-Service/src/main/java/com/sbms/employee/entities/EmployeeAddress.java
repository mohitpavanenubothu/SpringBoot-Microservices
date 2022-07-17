package com.sbms.employee.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Address")
public class EmployeeAddress {
	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "address_seq", sequenceName = "address_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
	private long id;

	@Column(name = "D_No")
	private String doorNo;

	@Column(name = "Street_Name")
	private String streetName;

	@Column(name = "Area")
	private String layout;

	@Column(name = "City")
	private String city;

	@Column(name = "Pincode")
	private String pincode;

	public EmployeeAddress(long id, String doorNo, String streetName, String layout, String city, String pincode) {
		super();
		this.id = id;
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.layout = layout;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [id=" + id + ", doorNo=" + doorNo + ", streetName=" + streetName + ", layout=" + layout
				+ ", city=" + city + ", pincode=" + pincode + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public EmployeeAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

}
