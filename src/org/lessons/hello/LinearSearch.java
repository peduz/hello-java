package org.lessons.hello;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
	
	/*
	 * Creare un array di numeri casuali. 
	 * Chiedere all’utente di inserire un numero da terminale e 
	 * verificare se è presente nell’array oppure no.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int length = ran.nextInt(10000);
		System.out.println("La grandezza sarà: " + length);
		int [] numeri = new int[length];
 		for(int i = 0; i < length; i++) {
 			numeri[i] = ran.nextInt();
 			System.out.println("Numero inserito: " + numeri[i]);
 		}
 		
 		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci un numero per verificare se è "
				+ "presente nell'array o meno");
		
		int sceltaUtente = scan.nextInt();
		boolean trovato = false;
		int indexFound = -1;
		for(int i = 0; i < length; i++) {
			if(sceltaUtente == numeri[i]) {
				indexFound = i;
//				System.out.println("Numero trovato in posizione " + i);
//				trovato = true;
				break;
			}
		}
		if(indexFound != -1) {
			System.out.println(String.format("Numero trovato in posizione %d", indexFound));
		} else {
			System.out.println("Numero non trovato");
		}
//		if(!trovato) {
//			System.out.println("Non l'ho trovato");
//		}
	}
}
