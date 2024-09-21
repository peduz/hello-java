package org.lessons.hello;

import java.util.Scanner;

public class RicercaMassimo {
	
	/*
	 * Scrivi un programma che legga 
	 * un array di numeri interi 
	 * dall'utente e determini qual è 
	 * il numero più grande tra essi.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci dei numeri");
		
		double [] numeri = new double [5];
		
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = scan.nextDouble();
		}
		
		System.out.println("Numeri inseriti, ricerchiamo il massimo");
	
		double max = numeri[0];
		
		for(int i = 0; i < numeri.length; i++) {
			if(max < numeri[i]) {
				max = numeri[i];
			}
		}
		System.out.println("Il numero massimo è " + max);
	}
}
