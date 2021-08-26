package com.curso.vehiculo;

public class Vehiculo {

	private double cargaMaxima;
	private String matricula;
	private double cargaActual;
	
	
	
	public Vehiculo(double cargaMaxima, String matricula) {
		super();
		this.cargaMaxima = cargaMaxima;
		this.matricula = matricula;
	}



	public double getCargaMaxima() {
		return cargaMaxima;
	}



	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public double getCargaActual() {
		return cargaActual;
	}



	public void setCargaActual(double cargaActual) {
		this.cargaActual = cargaActual;
	}



	public double calcularFuel() {
		return 0;
		
	}
}
