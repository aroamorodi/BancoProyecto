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
	public void withdraw(double cantidadRetirar) throws OverdraftException{
		
		if ( balance < cantidadRetirar ) {
		double overdraftNeeded = cantidadRetirar - balance;
		if ( overdraftAmount < overdraftNeeded ) {
		throw new OverdraftException("NO SE PUEDE RETIRAR EL DINERO TIENES UN DEFICIT DE ", (cantidadRetirar-balance));
		} else {
		balance = 0.0;
		overdraftAmount -= overdraftNeeded;
		}
		} else {
		balance -= cantidadRetirar;
		}
		
	}
	
	

	
	
	

}
