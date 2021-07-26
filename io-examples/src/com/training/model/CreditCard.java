package com.training.model;

import java.io.Serializable;

public class CreditCard implements Serializable {
	private static final long serialVersionUID = 2L;

	
	private long cardNumber;
	private String cardHolderName;
	private double creditLimit;
	private transient long phoneNumber;
	public CreditCard() {
		super();

		
	}
	public CreditCard(long cardNumber, String cardHolderName, double creditLimit, long phoneNumber) {
		super();
		
		
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
		this.phoneNumber = phoneNumber;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return this.cardNumber+","+this.cardHolderName + ","+this.creditLimit + ","+ this.phoneNumber;
	}
	
	
	
	
}
