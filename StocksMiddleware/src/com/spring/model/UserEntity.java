package com.spring.model;

public class UserEntity {
	private static final long serialVersionUID = -8086594793027652746L;
	private int id;
	private String username;
	private String password1;
	private String password2;
	private String email;
	private long phone;
	private boolean enabled;
	public UserEntity() {}
	public UserEntity(int id, String username, String password1, String password2, String email, long phone,
			boolean enabled) {
		super();
		this.id = id;
		this.username = username;
		this.password1 = password1;
		this.password2 = password2;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
