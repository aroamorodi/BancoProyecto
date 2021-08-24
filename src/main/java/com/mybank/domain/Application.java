package com.mybank.domain;

import com.mybank.domain.modelo.Account;
import com.mybank.domain.modelo.Customer;

public class Application
{
	public static void main( String[] args )
	{
		Account banco1 = new Account(500);
		Customer customer1 = new Customer("Luis", "Ramos");
		customer1.setAccount(banco1);
		System.out.println(customer1);
		
		System.out.println("Luis puede introducir la cantidad deseada : " + banco1.deposit(300));
		
		System.out.println(customer1);
		
		System.out.println("Luis puede sacar la cantidad deseada: " + banco1.withdraw(1500));
		
		System.out.println(customer1);
		
		System.out.println("Luis puede introducir la cantidad deseada : " + banco1.deposit(-300));
		
		System.out.println(customer1);
		
		
		

		
		
	}
}