package com.mybank.domain;

import com.mybank.domain.modelo.CheckingAccount;
import com.mybank.domain.modelo.Customer;
import com.mybank.domain.modelo.SavingsAccount;

public class CustomerReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("Jane","Simms");
		SavingsAccount savingAccount1 = new SavingsAccount(500,3);
		CheckingAccount checkingAccount1 = new CheckingAccount(200);
		
		customer1.addAccount(savingAccount1);
		customer1.addAccount(checkingAccount1);
		
		
		System.out.println(customer1);
		
		
        Customer customer2 = new Customer("Owen", "Bryant");
		
		CheckingAccount checkingAccount = new CheckingAccount(200);
		
		customer2.addAccount(checkingAccount);
		
		System.out.println(customer2);
		
		
		Customer customer3 = new Customer("Tim", "Soley");
		SavingsAccount savingsAccount3 = new SavingsAccount(1500,2);
		CheckingAccount checkingAccount3 = new CheckingAccount(200);
		
		customer3.addAccount(checkingAccount3);
		customer3.addAccount(savingsAccount3);
		
		System.out.println(customer3);
		
		Customer customer4 = new Customer("Maria", "Soley");
		SavingsAccount savingsAccount4 = new SavingsAccount(200,2);
		CheckingAccount checkingAccount4 = new CheckingAccount(150);
		
		customer4.addAccount(checkingAccount4);
		customer4.addAccount(savingsAccount4);
		System.out.println(customer4);
		
	
		
		

	}

}
