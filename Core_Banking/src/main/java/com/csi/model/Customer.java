package com.csi.model;

public class Customer {

	private String customerAccountNumber;

	private String customerPassword;

	public Customer(String customerAccountNumber, String customerPassword) {
		super();
		this.customerAccountNumber = customerAccountNumber;
		this.customerPassword = customerPassword;
	}

	public String getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(String customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

}
