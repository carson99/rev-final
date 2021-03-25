package com.app.model;

public class Address {

	private int houseNo;
	private int aptNo;
	private String street;
	private String city;
	private String state;
	public Address() {
		super();
		
	}
	public Address(int houseNo, int aptNo, String street, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.aptNo = aptNo;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", aptNo=" + aptNo + ", street=" + street + ", city=" + city + ", state="
				+ state + "]";
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public int getAptNo() {
		return aptNo;
	}
	public void setAptNo(int aptNo) {
		this.aptNo = aptNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
