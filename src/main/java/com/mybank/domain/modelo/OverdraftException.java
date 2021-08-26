package com.mybank.domain.modelo;

public class OverdraftException extends Exception{
	
	private double deficit;

	public OverdraftException(String mensajeError,double deficit) {
		super(mensajeError);
		this.deficit = deficit;
	}
	
	public double getDeficit() {
		return this.deficit;
	}
	
	

}
