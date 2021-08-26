package com.curso.informe;

import com.curso.vehiculo.Vehiculo;

public class Informe {

	public void generar() {
		
	}
	
	public void informeConsumo (Vehiculo [] flota) {
		System.out.println("----Informe consumos flota-----");
		System.out.println("consumos por vehiculo");
		double total = 0;
		for (Vehiculo vehiculo : flota) {
			double cosumo = vehiculo.calcularFuel();
			total += cosumo;
			System.out.println(vehiculo.getMatricula() + " : " + cosumo);
		}
		
		System.out.println("--------");
		System.out.println("TOTAL CONSUMO " + total);
		System.out.println("-----------------");
	}
}
