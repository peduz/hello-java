package org.lessons.hello;

import java.util.Scanner;

public class PariDispari {
	
	/*
	 * Scrivi un programma che legga un numero intero 
	 * dall'utente e determini se il numero è pari o dispari.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		int numero = scan.nextInt();
		
		int modulo = numero % 2; 
		
		if(modulo == 0) {
			System.out.println("Il numero è pari");
		} else {
			System.out.println("Il numero è dispari");
		}
		
	}
}
