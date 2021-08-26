package com.mybank.domain.modelo;

import java.io.Serializable;
import java.util.Arrays;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private Account [] accounts;
	private int numberOfAccounts;
	
	//CONSTRUCTOR
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new Account[5];
		this.numberOfAccounts = 0;
	}


	//GETTERS AND SETTERS
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	
	public void addAccount(Account account) {
		int i = numberOfAccounts;
		accounts[i] = account;
		numberOfAccounts++;
		
	}
	
	public int getNumOfAccounts() {
		return numberOfAccounts;
	}
	
	/**
	 * OBTENEMOS LA CUENTA 
	 * @param indice nos dira la posicion de la cuenta que queremos obtener
	 * @return la cuenta situada en ese indice
	 * si el indice sobrepasa la cantidad o es negativo nos devolvera un null
	 */
	public Account getAccount(int indice) {
		if(indice >=0 && indice<5) {
			return accounts[indice];
		}
		return null;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", accounts=" + Arrays.toString(accounts)
				+ ", numberOfAccounts=" + numberOfAccounts + "]";
	}


	


	
	
	
	
	
	
	
	
	

}
