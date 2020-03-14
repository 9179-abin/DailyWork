package com.cts.activity.model;

public class FundTransferEntity {


	private int amount;
	private AccountEntity sender;
	private AccountEntity receiver;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public AccountEntity getSender() {
		return sender;
	}
	public void setSender(AccountEntity sender) {
		this.sender = sender;
	}
	public AccountEntity getReceiver() {
		return receiver;
	}
	public void setReceiver(AccountEntity receiver) {
		this.receiver = receiver;
	}
	@Override
	public String toString() {
		return "FundTransferEntity [amount=" + amount + ", sender=" + sender + ", receiver=" + receiver + "]";
	}


	

}
