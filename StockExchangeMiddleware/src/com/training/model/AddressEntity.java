package com.training.model;

public class AddressEntity {
	
	private int id;
	private String city;
	private String state;
	private String houseNumber;
	private String street;
	public int getId() {
		return id;
	}
	
	public AddressEntity(int id, String city, String state, String houseNumber, String street) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.houseNumber = houseNumber;
		this.street = street;
	}

	public void setId(int id) {
		this.id = id;
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
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", city=" + city + ", state=" + state + ", houseNumber=" + houseNumber
				+ ", street=" + street + "]";
	}
	
	
	

}
