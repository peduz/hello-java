package org.lessons.hello;

import java.util.Scanner;

public class CalcolaMedia {
	
	/*
	 * Scrivi un programma che prenda in input 
	 * un array di 10 numeri interi dall'utente, 
	 * calcoli la somma e poi stampi la media di questi numeri.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] numeri = new int[10];
		
		System.out.println("Inserisci i numeri");
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = scan.nextInt();
		}
		
		int somma = 0;
		
		for(int i = 0; i < numeri.length; i++) {
			somma += numeri[i];
		}
		
		System.out.println("La somma è " + somma);
		
		double media = (double) somma/numeri.length;
		
		System.out.println("La media è " + media);
	}
}
