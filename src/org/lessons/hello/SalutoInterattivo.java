package org.lessons.hello;

import java.util.Scanner;

public class SalutoInterattivo {

	public static void main(String[] args) {
		
		Scanner leggiDaTastiera = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri interi per ottenere la somma");
		
		int numero1 = leggiDaTastiera.nextInt();
		int numero2 = leggiDaTastiera.nextInt();
		
		System.out.println("La somma dei numeri è: " + (numero1 + numero2));
		
		System.out.println("Dimmi come ti chiami per salutarti ");
		
		leggiDaTastiera.nextLine();
		
		String inputUtente = leggiDaTastiera.nextLine();
		
		System.out.println("Arrivederci " + inputUtente + ".");
		
	}
}
