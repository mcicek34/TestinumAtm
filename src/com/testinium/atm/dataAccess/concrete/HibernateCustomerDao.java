package com.testinium.atm.dataAccess.concrete;

import com.testinium.atm.dataAccess.abstracts.CustomerDao;
import com.testinium.atm.entities.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("Kullanıcı bankanın veritabanına kaydedildi " + customer.getFirstName());
	}

	@Override
	public void remove(Customer customer) {
		System.out.println("Kullanıcı bankanın veritabanınından silindi " + customer.getFirstName());

	}

}
