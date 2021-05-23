package com.testinium.atm.business.concrete;

import com.testinium.atm.business.abstracts.CustomerService;
import com.testinium.atm.dataAccess.abstracts.CustomerDao;

public class CustomerManager {

	CustomerService customerService;
	CustomerDao customerDao;

	public CustomerManager(CustomerService customerService) {
		this.customerService = customerService;

	}

	public double deposit(double money) {
		double sonuc;
		return sonuc = customerService.deposit(money);
	}

	public double withdraw(double money) {
		double sonuc;
		return sonuc = customerService.withdraw(money);
	}

}
