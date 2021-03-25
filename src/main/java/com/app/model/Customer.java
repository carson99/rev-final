package com.app.model;

import java.sql.Date;

public class Customer {
	
	private int customerid;
	private String password;
	private String firstName;
	private String lastName;
	private Date dob;
	private int phone;
	private String email;
	private int zip;
	
	public Customer() {
		
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dob=" + dob + ", phone=" + phone + ", email=" + email + ", zip=" + zip
				+ "]";
	}

	public Customer(int customerid, String password, String firstName, String lastName, Date dob, int phone,
			String email, int zip) {
		super();
		this.customerid = customerid;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.zip = zip;
		
		
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}