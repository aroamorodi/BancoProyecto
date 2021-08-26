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
		boolean resultado = true;
		
		if ( balance < amt ) {
			double overdraftNeeded = amt - balance;
			if ( overdraftAmount < overdraftNeeded ) {
			resultado = false;
			} else {
			balance = 0.0;
			overdraftAmount -= overdraftNeeded;
			}
			} else {
			balance -= amt;
			}
			return resultado;

	}

	@Override
	public String toString() {
		return "CheckingAccount [overdraftAmount=" + overdraftAmount + ", balance=" + balance + ", getBalance()="
				+ getBalance() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
