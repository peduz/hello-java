package org.lessons.hello;

import java.util.Scanner;

public class Operatori {
	
	/*
	 * Scrivi un programma Java che prenda in input due numeri interi 
	 * dall'utente e stampi la loro somma, il loro prodotto, 
	 * la differenza, la divisione, il modulo.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Scrivi due numeri");
		
		int numero1 = scan.nextInt();
		
		int numero2 = scan.nextInt();
		
		int somma = numero1 + numero2;
		
		int differenza = numero1 - numero2;
		
		double divisione = (double) numero1/numero2;
		
		int modulo = numero1%numero2;
		
		System.out.println("La somma è uguale a " + somma);
		
		System.out.println(String.format("La differenza è uguale a %d", differenza));
		
		System.out.println(String.format("La divisione è %f", divisione));
		
		System.out.println(String.format("Il modulo è %d", modulo));
	}
}
