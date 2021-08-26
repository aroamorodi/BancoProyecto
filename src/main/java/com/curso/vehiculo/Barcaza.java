package com.curso.vehiculo;

public class Barcaza extends Vehiculo{

	public Barcaza(double cargaMaxima, String matricula) {
		super(cargaMaxima, matricula);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularFuel() {
		// TODO Auto-generated method stub
		return this.getCargaActual()*45;
	}
	
	

}
