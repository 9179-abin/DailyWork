package com.cts.activity.model;

public class AccountEntity {
	
	private int accountId;
	private String accountType;
	private CustomerEntity owner;
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public CustomerEntity getOwner() {
		return owner;
	}
	public void setOwner(CustomerEntity owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return " [accountId=" + accountId + ", accountType=" + accountType + ", owner=" + owner + "]";
	} 

	


}
