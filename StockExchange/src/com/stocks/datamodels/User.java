package com.stocks.datamodels;

import java.io.Serializable;

@Entity
@Table
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7117637168691648039L;
	@Id
	private int id;
	private String username;
	private String password1;
	private String password2;
	private String email;
	private long phone;
	private boolean enabled;
	public User(int id, String username, String password1, String password2, String email, long phone,
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
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password1=" + password1 + ", password2=" + password2
				+ ", email=" + email + ", phone=" + phone + ", enabled=" + enabled + "]";
	}
	
}
