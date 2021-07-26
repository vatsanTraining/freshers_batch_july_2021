package com.training.model;

import java.io.Serializable;

//1 - implements serializable
public class CreditCard implements Serializable,Comparable<CreditCard> {

	/**
	 *   2 - version number
	 */
	private static final long serialVersionUID = 2L;

	
	private long cardNumber;
	private String cardHolderName;
	private double creditLimit;
	//3 - Non transient fields will be serialized
	private transient long phoneNumber;
	public CreditCard() {
		super();

		System.out.println("Credit card ZERO ARg constructor called");
		
	}
	public CreditCard(long cardNumber, String cardHolderName, double creditLimit, long phoneNumber) {
		super();
		
		System.out.println("Credit card Paramerter constructor called");
		
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
	@Override
	public int compareTo(CreditCard obj) {

		if(this.cardNumber<obj.cardNumber) return -1;
		if(this.cardNumber>obj.cardNumber) return 1;
		return 0;
	}
	
	
	
	
}
