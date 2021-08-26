package com.mybank.domain;

import com.mybank.domain.modelo.CheckingAccount;
import com.mybank.domain.modelo.Customer;
import com.mybank.domain.modelo.OverdraftException;
import com.mybank.domain.modelo.SavingsAccount;

public class TestBanking {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Jane", "Sims");
		
		CheckingAccount checkingAccount1 = new CheckingAccount(200,500);
		
		customer1.addAccount(checkingAccount1);
		
		try {
			checkingAccount1.withdraw(150);
		} catch (OverdraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		checkingAccount1.deposit(22.5);
		
		try {
			checkingAccount1.withdraw(147.62);
			checkingAccount1.withdraw(470);
		}catch(OverdraftException e){
			System.out.println(e.getMessage() + e.getDeficit());
			
		}
		
		System.out.println(customer1);
		
		
		Customer customer2 = new Customer("Owen", "Bryant");
		SavingsAccount savingAccount2 = new SavingsAccount(200, 3);
		
		customer2.addAccount(savingAccount2);
		
		try {
			savingAccount2.withdraw(100);
		}catch (OverdraftException e) {
			System.out.println(e.getMessage() + e.getDeficit());
		}
		
		savingAccount2.deposit(25);
		
		try {
			savingAccount2.withdraw(175);
		} catch (OverdraftException e) {
			// TODO: handle exception
			System.out.println(e.getMessage() + e.getDeficit());
		}
		
		System.out.println(customer2);
		
	}

}
