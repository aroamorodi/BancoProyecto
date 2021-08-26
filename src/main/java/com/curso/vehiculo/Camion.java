package com.curso.vehiculo;

public class Camion extends Vehiculo{
	
	private int numeroEjes;

	public Camion(double cargaMaxima, String matricula, int numeroEjes) {
		super(cargaMaxima, matricula);
		this.numeroEjes = numeroEjes;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularFuel() {
		// TODO Auto-generated method stub
		return this.getCargaActual()*30 + 2*numeroEjes;
	}
	
	
	

}
