package org.lessons.hello;

import java.util.Scanner;

public class RicercaMinimo {
	
	/*
	 * Scrivi un programma che legga un array 
	 * di numeri interi dall'utente 
	 * e determini qual è il numero più piccolo tra essi.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci i numeri per trovare il minore");
		
		int [] numeri = new int[5];
		
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = scan.nextInt();
		}
		
		System.out.println("Numeri inseriti, procediamo alla ricerca");
		
		int min = numeri[0];
		
		for(int i = numeri.length - 1; i >= 0; i--) {
			
			System.out.println("L'array dei numeri "
					+ "a posizione " + i +
					" è uguale a " + numeri[i]);
			
			if(min > numeri[i]) {
				min = numeri[i];
			}
		}
		
		System.out.println("Il minimo è " + min);
	}
}
