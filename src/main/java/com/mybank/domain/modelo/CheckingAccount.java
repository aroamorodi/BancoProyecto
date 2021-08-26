package com.mybank.domain.modelo;

public class CheckingAccount extends Account{
	
	private double overdraftAmount;

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double overdraftAmount) {
		super(balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public boolean withdraw(double amt) {
		return false;
	}

}
