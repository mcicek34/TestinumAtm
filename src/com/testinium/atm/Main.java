package com.testinium.atm;

import java.util.HashMap;
import java.util.Scanner;

import com.testinium.atm.business.concrete.CustomerManager;
import com.testinium.atm.core.InvalidNumberException;
import com.testinium.atm.dataAccess.concrete.HibernateCustomerDao;
import com.testinium.atm.entities.CorporateCustomer;
import com.testinium.atm.entities.Customer;
import com.testinium.atm.entities.IndividualCustomer;

public class Main {

	public static void main(String[] args) {

		CorporateCustomer corporateCustomer = new CorporateCustomer("Ahmet", "Ozcelik", "1", "123451235", "Hepsiburada",
				17250.0);
		CorporateCustomer corporateCustomer2 = new CorporateCustomer("Huseyin", "CICEK", "2", "98765432", "Trendyol",
				12500.0);
		IndividualCustomer individualCustomer = new IndividualCustomer("Mustafa", "CICEK", "3", "37715537897",
				"ISTANBUL", 21800.0);
		IndividualCustomer individualCustomer2 = new IndividualCustomer("Sinan", "BILGIN", "4", "1213141516",
				"UMRANIYE", 110022.0);
		IndividualCustomer individualCustomer3 = new IndividualCustomer("Ersin", "CETIN", "5", "2131415236", "CIHANGIR",
				42134.0);

		HashMap<Integer, Customer> customers = new HashMap<Integer, Customer>();
		customers.put(1, corporateCustomer);
		customers.put(2, corporateCustomer2);
		customers.put(3, individualCustomer);
		customers.put(4, individualCustomer2);
		customers.put(5, individualCustomer3);

		System.out.println("Bir musteri numarası giriniz: (1-5)");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		Customer customer;
		System.out.println("-----------------------------------");

		// core package'inde oluşturduğum kendi exception mı burada kullandım.
		try {
			if (x < 1 || x > 5) {
				throw new InvalidNumberException();
			}
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		}

		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
		switch (x) {
		case 1: {
			String value = customers.get(1).toString();
			System.out.println(" : " + value);
			customer = customers.get(1);
			break;
		}
		case 2: {
			String value = customers.get(2).toString();
			System.out.println(" : " + value);
			customer = customers.get(2);
			break;
		}
		case 3: {
			String value = customers.get(3).toString();
			System.out.println(" : " + value);
			customer = customers.get(3);
			break;
		}
		case 4: {
			String value = customers.get(4).toString();
			System.out.println(" : " + value);
			customer = customers.get(4);
			break;
		}
		case 5: {
			String value = customers.get(5).toString();
			System.out.println(" : " + value);
			customer = customers.get(5);
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		}
		System.out.println("-----------------------------------");

		System.out.println("Para yatırma işlemi için 1 / çekme işlemi için 2 ye basınız");
		int selection = scan.nextInt();

		System.out.println("-----------------------------------------------------------");
		System.out.println("Tutar Giriniz:");
		double z = scan.nextDouble();

		CustomerManager customerManager = new CustomerManager(customer);
		double sonuc;

		if (selection == 1) {
			sonuc = customerManager.deposit(z);
			System.out.println("Güncel Bakiyeniz: " + sonuc);
		} else if (selection == 2) {
			sonuc = customerManager.withdraw(z);
			System.out.println("Güncel Bakiyeniz: " + sonuc);

		}

		System.out.println("-----------------------------------------------------------");
		System.out.println("Kullanıcı veri tabanına eklensin e/h");
		String harf = scan.next();

		HibernateCustomerDao customerDao = new HibernateCustomerDao();
		switch (harf) {
		case "e": {
			customerDao.add(customer);
			break;

		}
		case "h": {
			customerDao.remove(customer);
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + harf);
		}

	}

}
