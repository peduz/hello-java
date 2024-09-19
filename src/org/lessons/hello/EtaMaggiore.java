package org.lessons.hello;

import java.util.Scanner;

public class EtaMaggiore {
	
	/*
	 * Chiedere all'utente gli anni di due persone e 
	 * comunicare quale delle due è più grande
	 */
	public static void main(String[] args) {
		System.out.println("Inserisci due date  di nascita "
				+ "per capire quale è più grande");
		Scanner scan = new Scanner(System.in);
		int anno1 = scan.nextInt();
		int anno2 = scan.nextInt();
		
		if(anno1 < anno2) {
			System.out.println("Il maggiore è il primo perchè ha " + 
		(2024 - anno1) + " anni");
		} else if(anno1 > anno2) {
			System.out.println("Il maggiore è il secondo perchè ha " + 
		(2024 - anno2) + " anni");
		} else {
			System.out.println("Hanno la stessa età: " + (2024 - anno1));
		}
		
	}
}
