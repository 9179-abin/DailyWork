package com.cts.hackathon.shopify.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "suppliers")
public class SupplierEntity {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long contact;
	private String address;

	public SupplierEntity() {

	}

	public SupplierEntity(int id, String name, long contact, String address) {

		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SupplierEntity [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
	

}
