package com.mybank.domain.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String DNI;
	private String lastName;
	private ArrayList<Account> accounts;
	private int numberOfAccounts;
	
	//CONSTRUCTOR
	
	
	public Customer(String firstName, String lastName, String DNI) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new ArrayList<Account>();
		//this.numberOfAccounts = 0;
		this.DNI= DNI;
	}


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

	
	public void addAccount(Account account) {
		accounts.add(account);
		
	}
	
	public int getNumOfAccounts() {
		return accounts.size();
	}
	
	
	
	/**
	 * @return the dNI
	 */
	public String getDNI() {
		return DNI;
	}


	/**
	 * @param dNI the dNI to set
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}


	/**
	 * OBTENEMOS LA CUENTA 
	 * @param indice nos dira la posicion de la cuenta que queremos obtener
	 * @return la cuenta situada en ese indice
	 * si el indice sobrepasa la cantidad o es negativo nos devolvera un null
	 */
	

	


	/**
	 * @return the accounts
	 */
	public ArrayList<Account> getAccounts() {
		return accounts;
	}


	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}


	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", DNI=" + DNI + ", lastName=" + lastName + ", accounts=" + accounts
				+ ", numberOfAccounts=" + numberOfAccounts + "]";
	}
	
	


	


	
	
	
	
	
	
	
	
	

}
