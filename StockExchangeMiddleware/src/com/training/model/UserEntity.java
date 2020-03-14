package com.training.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

//The bean name will be POJO class name starts with small letter(userentity)
@Component
public class UserEntity implements Serializable{
	
	private static final long serialVersionUID = -8086594793027652746L;
	private int id;
	private String username;
	private String password1;
	private String password2;
	private List<String> email;
	private long phone;
	private boolean enabled;
	private AddressEntity address;
	
	
	public UserEntity() {}


	public UserEntity(int id, String username, String password1, String password2, List<String> email, long phone,
			boolean enabled, AddressEntity address) {
		super();
		this.id = id;
		this.username = username;
		this.password1 = password1;
		this.password2 = password2;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword1() {
		return password1;
	}


	public void setPassword1(String password1) {
		this.password1 = password1;
	}


	public String getPassword2() {
		return password2;
	}


	public void setPassword2(String password2) {
		this.password2 = password2;
	}


	public List<String> getEmail() {
		return email;
	}


	public void setEmail(List<String> email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public AddressEntity getAddress() {
		return address;
	}


	public void setAddress(AddressEntity address) {
		this.address = address;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password1=" + password1 + ", password2="
				+ password2 + ", email=" + email + ", phone=" + phone + ", enabled=" + enabled + ", address=" + address
				+ "]";
	}
	
	


}