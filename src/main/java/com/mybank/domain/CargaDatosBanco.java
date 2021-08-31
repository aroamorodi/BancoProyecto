package com.mybank.domain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

import com.mybank.domain.modelo.Account;
import com.mybank.domain.modelo.Bank;
import com.mybank.domain.modelo.CheckingAccount;
import com.mybank.domain.modelo.Customer;
import com.mybank.domain.modelo.Customer2;
import com.mybank.domain.modelo.SavingsAccount;

public class CargaDatosBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Leer el fichero Datos.txt para crear los clienes
		 * del banco
		 * 
		 * Por cada linea leer los datos para crear cliente y su cuenta bancaria
		 * 
		 * Si el tipo de cuenta es C creamos un CheckingAccount
		 * con los dos últimos números decimales que se carga en la línea
		 * el primero es el saldo, el segundo es el límite de credito
		 * 
		 * Si es un tipo de cuenta S creamos un SavingAccount
		 * donde los ultimos decimales son el saldo y el interes
		 * el primero sera el saldo y el segundo será el interés
		 * 
		 *  
		 *  Uso Scanner y el DateTimeFormatter,BufferedReader, FileReader
		 */

		/**
		 * Recorrer los clientes del banco mostrando sus cuentas bancarias
		 *
		 */	
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		File fichero = new File("Datos.txt");
		FileReader ficheroReader = null;
		BufferedReader ficheroBuffer = null;
		
		try {
			
			
			ficheroReader = new FileReader(fichero);
			
			ficheroBuffer = new BufferedReader(ficheroReader);
			
			String contenido = ficheroBuffer.readLine();
			
			
			while(contenido !=null) {
				Scanner sc = new Scanner(contenido);
				sc.useDelimiter("#");
				sc.useLocale(Locale.ENGLISH);
				String nombreCliente = sc.next();
				String apellidoCliente = sc.next();
				String fecha = sc.next();
				String caracter = sc.next();
				LocalDate fechaAlta = LocalDate.parse(fecha,formatter);
				Customer2 customer = new Customer2(nombreCliente, apellidoCliente, fechaAlta);
				Bank.addCustomer(customer);
				switch (caracter) {
				case "C":
					double saldo = sc.nextDouble();
					double limiteCredi = sc.nextDouble();
					
					CheckingAccount checking = new CheckingAccount(saldo, limiteCredi);
					break;

				case  "S":
					
					double saldoS = sc.nextDouble();
					double interes = sc.nextDouble();
					
					SavingsAccount saving = new SavingsAccount(saldoS, interes);
					customer.addAccount(saving);
					break;
				}

				//lee la linea siguiente
				contenido = ficheroBuffer.readLine();
				}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ficheroBuffer.close();
				ficheroReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//RECORRO EL BANCO
		
		
		HashMap<String,Customer2> mapa = Bank.getCustomers();
		
		Collection <Customer2> coleccion = mapa.values();
		
		for (Customer2 customer2 : coleccion) {
			
			ArrayList<Account> accounts = customer2.getAccounts();
			for (Customer2 customer22 : coleccion) {
				System.out.println(customer22);
			}
			
		}
		
	}

}
