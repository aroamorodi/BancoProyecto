package com.curso.maquina;



public class Application {

	public static void main(String[] args) {
Refresco ref = new Refresco(30, "naranja", 20, 80);
		
		Maquina maq = new Maquina(ref);
		
		System.out.println(maq);
		System.out.println("Vendemos 4 latas");
		
		maq.venderRefresco();
		maq.venderRefresco();
		maq.venderRefresco();
		maq.venderRefresco();
		
		System.out.println(maq);
		
		
		System.out.println("Reponemos 40 latas más");
		maq.reponerRefrescos(40);
		
		System.out.println(maq);
	}
}
