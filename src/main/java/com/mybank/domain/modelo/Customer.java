package com.mybank.domain.modelo;

import java.io.Serializable;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private Account account;
	
	//CONSTRUCTOR
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	//GETTERS AND SETTERS
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", account=" + account + "]";
	}
	
	
	
	
	
	
	
	

}
