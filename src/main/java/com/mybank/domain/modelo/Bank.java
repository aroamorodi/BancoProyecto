package com.mybank.domain.modelo;

public class Bank {
	private static Customer[] customers;
	private static int numberOfCustomers;
	
	{
		this.customers = new Customer[5];
		this.numberOfCustomers = 0;
	}
	private Bank() {
		super();
	}
	
	public static void addCustomer(String nombre, String apellido) {
		int i = numberOfCustomers;
		customers[i]= new Customer(nombre, apellido);
		numberOfCustomers++;
	}
	
	public static int getNumOfCustoemrs() {
		return numberOfCustomers;
	}
	
	public static Customer getCustomer(int indice) {
		if(indice >=0 && indice<5) {
			return customers[indice];
		}
		return null;
	}

	
}
