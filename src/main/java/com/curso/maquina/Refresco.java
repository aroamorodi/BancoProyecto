package com.curso.maquina;

public class Refresco {
	private double precio;
	private int stock;
	private double cantidad;
	private boolean agotado;
	private String sabor;
	
	//CONSTRUCTOR
	public Refresco(double precio, String sabor, int stock, double cantidad) {
        this.precio = precio;
        this.sabor = sabor;
        this.stock = stock;
        this.cantidad = cantidad;
        if(stock <= 0 ){
            this.agotado = true;
        }
    }
	
	//GETTERS AND SETTERS

	 public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        this.precio = precio;
	    }

	    public String getSabor() {
	        return sabor;
	    }

	    public int getStock() {
	        return stock;
	    }

	    public boolean isAgotado() {
	        return agotado;
	    }

	    public double getCantidad() {
	        return cantidad;
	    }

	    public void setStock(int stock) {
	        this.stock = stock;
	    }

	    @Override
	    public String toString() {
	        return "Refresco{" + "precio=" + precio + ", sabor=" + sabor + ", stock=" + stock + ", agotado=" + agotado + ", cantidad=" + cantidad + '}';
	    }

}
