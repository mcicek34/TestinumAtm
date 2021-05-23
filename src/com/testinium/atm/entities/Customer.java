package com.testinium.atm.entities;

import com.testinium.atm.business.abstracts.CustomerService;

public class Customer implements CustomerService {

	String firstName;
	String lastName;
	String customerNumber;
	String nationalIdentity;

	public Customer(String firstName, String lastName, String customerNumber, String nationalIdentity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerNumber = customerNumber;
		this.nationalIdentity = nationalIdentity;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", customerNumber=" + customerNumber
				+ ", nationalIdentity=" + nationalIdentity + "]";
	}

	@Override
	public double deposit(double money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double withdraw(double money) {
		// TODO Auto-generated method stub
		return 0;
	}

}
