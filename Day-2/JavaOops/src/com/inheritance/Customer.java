package com.inheritance;

public class Customer extends Person {
	
	private int customerId;
	private String accountNumber;
	private float balance;
	
	public Customer(String name, String gender, int customerId, String accountNumber, float balance) {
		super(name, gender);
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		System.out.println("Customer (String,String,int,String,double) ");
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	@Override
	public void display() {
		super.display();
		System.out.println("customer id= "+customerId +" accountNumber = "+accountNumber +" balance= "+balance);
	}
	
	
	

}
