package com.testinium.atm.entities;

import com.testinium.atm.business.abstracts.CustomerService;
import com.testinium.atm.dataAccess.abstracts.CustomerDao;

public class IndividualCustomer extends Customer implements CustomerService{

	String adress;
	double accountBalance;

	public IndividualCustomer(String firstName, String lastName, String customerNumber, String nationalIdentity,
			String adress, double accountBalance) {
		super(firstName, lastName, customerNumber, nationalIdentity);
		this.adress = adress;
		this.accountBalance = accountBalance;
	}

	public String getAdress() {
		return adress;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "IndividualCustomer [adress=" + adress + ", accountBalance=" + accountBalance + ", firstName="
				+ firstName + ", lastName=" + lastName + ", customerNumber=" + customerNumber + ", nationalIdentity="
				+ nationalIdentity + "]";
	}

	@Override
	public double deposit(double money) {
		money = money + accountBalance;
		return money;
	}

	@Override
	public double withdraw(double money) {
		money = accountBalance - money;
		return money;
	}

}
