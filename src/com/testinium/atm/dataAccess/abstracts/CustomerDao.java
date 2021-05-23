package com.testinium.atm.dataAccess.abstracts;

import com.testinium.atm.entities.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void remove(Customer customer);
}
