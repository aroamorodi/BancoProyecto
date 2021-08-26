package com.mybank.domain.modelo;



public class Account{
	
	protected double balance;

	protected Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	/**
	 * Depositar dinero en la cuenta bancaria
	 * @param cantidadDepositar cantidad que queremos introducir en el banco
	 * @return true si la cantidad es mayor que 0
	 * @return false si la cantidad es igual a 0 o menor que 0
	 */
	
	public boolean deposit(double cantidadDepositar) {
		if(cantidadDepositar>0) {
			this.balance+=cantidadDepositar;
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	/**
	 * Retiramos dinero de nuestra cuenta bancaria
	 * @param cantidadRetirar
	 * @return true si la cantidad que queremos retirar es menor a la que tenemos en la cuenta
	 * @return false si la cantidad que queremos retirar es mayor 
	 */
	
	public boolean withdraw(double cantidadRetirar) {
		if(cantidadRetirar<balance) {
			balance = balance - cantidadRetirar;
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
	

}
