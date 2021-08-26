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

	@Override
	public boolean withdraw(double cantidadRetirar) {
		boolean resultado = true;
		if ( balance < cantidadRetirar ) {
		double overdraftNeeded = cantidadRetirar - balance;
		if ( overdraftAmount < overdraftNeeded ) {
		resultado = false;
		} else {
		balance = 0.0;
		overdraftAmount -= overdraftNeeded;
		}
		} else {
		balance -= cantidadRetirar;
		}
		return resultado;
	}
	
	

	
	
	

}
