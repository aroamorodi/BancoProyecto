package com.mybank.domain.modelo;

public class SavingsAccount extends Account{

	private double interestRate;
	
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	
	

	

}
