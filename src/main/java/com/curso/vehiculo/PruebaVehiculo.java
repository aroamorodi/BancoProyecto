package com.curso.vehiculo;

import com.curso.informe.Informe;

public class PruebaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo [] lista = new Vehiculo [3];
		lista[0] = new Camion(1000, "C1111", 3);
		lista[1] = new Barcaza(1000, "B1111");
		lista[2] = new Camion (1000,"C2222",2);
		
		new Informe().informeConsumo(lista);
		
		
		
	}

}
