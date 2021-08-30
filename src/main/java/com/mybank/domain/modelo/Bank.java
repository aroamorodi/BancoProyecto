package com.mybank.domain.modelo;

import java.util.HashMap;

public class Bank {
	private static HashMap<String, Customer> customers;
	//private static int numberOfCustomers;
	
	{
		this.customers = new HashMap<String, Customer>();
		//this.numberOfCustomers = 0;
	}
	private Bank() {
		super();
	}
	
	public static void addCustomer(Customer cliente) {
		customers.put(cliente.getDNI(), cliente);
	}
	
	public static int getNumOfCustoemrs() {
		return customers.size();
	}

	/**
	 * @return the customers
	 */
	public static HashMap<String, Customer> getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public static void setCustomers(HashMap<String, Customer> customers) {
		Bank.customers = customers;
	}
	
	public static Customer getCustomer(String dni) {
		return customers.get(dni);
	}
	
	

	
}
