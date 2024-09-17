package org.lessons.hello;

import java.util.Random;
import java.util.Scanner;

public class UsaRandom {

	public static void main(String[] args) {
		Random ran = new Random();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il numero massimo per la generazione di numeri casuali");
		
		int max = input.nextInt();
		
		int result = ran.nextInt(max);
		
		System.out.println("Il numero casuale è: " + result);
	}
}
