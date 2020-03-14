package com.cts.activity.model;

public class CustomerEntity {
	
	private int id;
	private String customername;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", customername=" + customername + "]";
	}
	
	

}
