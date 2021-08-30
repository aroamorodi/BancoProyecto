package com.mybank.domain;

import java.util.ArrayList;
import java.util.HashMap;

import com.mybank.domain.modelo.Account;
import com.mybank.domain.modelo.Bank;
import com.mybank.domain.modelo.CheckingAccount;
import com.mybank.domain.modelo.Customer;
import com.mybank.domain.modelo.OverdraftException;
import com.mybank.domain.modelo.SavingsAccount;

public class PruebaHashMapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("Pedro", "Fernandez", "32896870X");
		
		Customer customer2 = new Customer("Juan", "Fernandez", "32896970B");
		
		SavingsAccount savingAccount1 = new SavingsAccount(500,3);
		CheckingAccount checkingAccount1 = new CheckingAccount(200);
		
		customer1.addAccount(checkingAccount1);
		customer1.addAccount(savingAccount1);
		
		ArrayList<Account> listaClientes1 =customer1.getAccounts();
		
		System.out.println("CUENTAS CLIENTE 1");
		for (Account account : listaClientes1) {
			System.out.println(account);
		}
		
		
		SavingsAccount savingsAccount2 = new SavingsAccount(1500,2);
		CheckingAccount checkingAccount2 = new CheckingAccount(200);
		
		customer2.addAccount(checkingAccount2);
		customer2.addAccount(savingsAccount2);
		
		ArrayList<Account> listaClientes2 = customer2.getAccounts();
		
		System.out.println("CUENTAS CLIENTE2");
		for (Account account : listaClientes2) {
			System.out.println(account);
		}
		
		
		Bank.addCustomer(customer2);
		Bank.addCustomer(customer1);
		
		HashMap <String,Customer> mapaClientes = Bank.getCustomers();
		
		//System.out.println(mapaClientes.get(customer1.getDNI()));
		
		System.out.println(Bank.getNumOfCustoemrs());
		Customer variable = mapaClientes.get(customer2.getDNI());
		
		System.out.println(variable.getFirstName());
		

        

}
}
