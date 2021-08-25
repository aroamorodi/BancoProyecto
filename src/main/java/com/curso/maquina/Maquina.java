package com.curso.maquina;


public class Maquina {

	
	private Refresco refresco;
	private double centimosDisponibles;
	private int refrescosVendidos;
	
	
	/**
	 * En el constructor le decimos de los centimos que dispone la maquina para devolver
	 */
	public Maquina(Refresco refresco) {
		super();
		this.refresco = refresco;
		this.centimosDisponibles = 400;
		
	}

	//GETTERS
	public Refresco getRefresco() {
		return refresco;
	}

	public double getCentimosDisponibles() {
		return centimosDisponibles;
	}

	
	
	public int getRefrescosVendidos() {
		return refrescosVendidos;
	}

	public void setRefrescosVendidos(int refrescosVendidos) {
		this.refrescosVendidos = refrescosVendidos;
	}

	public void setRefresco(Refresco refresco) {
		this.refresco = refresco;
	}

	public void setCentimosDisponibles(double centimosDisponibles) {
		this.centimosDisponibles = centimosDisponibles;
	}

	public void venderRefresco() {
		int cantidadDisponible = this.refresco.getStock();
		if (cantidadDisponible > 0) {
			cantidadDisponible--;
			this.refresco.setStock(cantidadDisponible);
			refrescosVendidos++;
		}
	
	}
	
	public void reponerRefrescos(int cantidadRellenar) {
		int disponible = this.refresco.getStock();
		if(refresco.isAgotado()) {
			disponible += cantidadRellenar; 
		}
		if(cantidadRellenar>0) {
			disponible = disponible + cantidadRellenar;
		}
	}

	@Override
	public String toString() {
		return "Maquina [refresco=" + refresco + ", centimosDisponibles=" + centimosDisponibles + ", refrescosVendidos="
				+ refrescosVendidos + "]";
	}


}
