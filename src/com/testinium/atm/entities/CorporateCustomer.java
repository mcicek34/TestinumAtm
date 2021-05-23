package com.testinium.atm.entities;

import com.testinium.atm.business.abstracts.CustomerService;

public class CorporateCustomer extends Customer implements CustomerService {

	String companyName;
	double accountBalance;

	public CorporateCustomer(String firstName, String lastName, String customerNumber, String nationalIdentity,
			String companyName, double accountBalance) {
		super(firstName, lastName, customerNumber, nationalIdentity);
		this.companyName = companyName;
		this.accountBalance = accountBalance;
	}

	public String getCompanyName() {
		return companyName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "CorporateCustomer [companyName=" + companyName + ", accountBalance=" + accountBalance + ", firstName="
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
