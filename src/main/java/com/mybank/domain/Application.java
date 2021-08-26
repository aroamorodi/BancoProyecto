package com.mybank.domain;

import com.mybank.domain.modelo.Account;
import com.mybank.domain.modelo.CheckingAccount;
import com.mybank.domain.modelo.Customer;
import com.mybank.domain.modelo.SavingsAccount;

public class Application
{
	public static void main( String[] args )
	{
		
		Customer customer1 = new Customer("Jane", "Smith");
		
		SavingsAccount savingAccount = new SavingsAccount(500, 3);
		
		customer1.setAccount(savingAccount);
		
		
		Customer customer2 = new Customer("Owen", "Bryant");
		
		CheckingAccount checkingAccount = new CheckingAccount(500);
		
		customer2.setAccount(checkingAccount);
		
		Customer customer3 = new Customer("Maria", "Soley");
		
		customer3.setAccount(checkingAccount);
		
		System.out.println(customer1);
		
		System.out.println(customer2);
		
		System.out.println(customer3);
		
		
		
		
		
		
		

		
		
	}
}