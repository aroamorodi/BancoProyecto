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
		
		Customer customer3 = new Customer("Tim", "Soley");
		
		CheckingAccount checkingAccount2 = new CheckingAccount(500, 500);
		
		customer3.setAccount(checkingAccount2);
		
		Customer customer4 = new Customer("Maria", "Soley");
		
		customer4.setAccount(checkingAccount2);
		
		savingAccount.withdraw(150);
		savingAccount.withdraw(22.50);
		savingAccount.withdraw(400);
		
		System.out.println(customer1);
		
		
		checkingAccount.withdraw(150);
		checkingAccount.deposit(22.50);
		checkingAccount.withdraw(47.62);
		checkingAccount.withdraw(400);
		
		System.out.println(customer2);
		
		
		checkingAccount2.withdraw(150);
		checkingAccount2.deposit(22.50);
		checkingAccount2.withdraw(47.62);
		checkingAccount2.withdraw(400);
		
		System.out.println(customer3);
		
		checkingAccount2.deposit(150);
		checkingAccount2.withdraw(750);
		
		System.out.println(customer4);
		
		
		
		
		
		
		
		
		

		
		
	}
}