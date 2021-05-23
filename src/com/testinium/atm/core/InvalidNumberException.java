package com.testinium.atm.core;

public class InvalidNumberException extends Exception{
	
	public InvalidNumberException() {
		super("Geçersiz sayi sayi 1 ya da 2 olmalıdır");
	}
	public InvalidNumberException(String message) {
		super(message);
	}
}
