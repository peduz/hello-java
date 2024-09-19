package org.lessons.hello;

import java.util.Scanner;

public class RircercaStringaGrande {

	/*
	 * Chiediamo all'utente due parole in successione.
	 * Andiamo poi a verificare quale delle due parole è più lunga.
	 */
	public static void main(String[] args) {
		System.out.println("Inserisci due parole per determinare quale sia più grande");
		
		Scanner scan = new Scanner(System.in);
		String parola1 = scan.next();
		String parola2 = scan.next();
		if(parola1.length() > parola2.length()) {
			System.out.println("La parola '" + parola1 + "' è più lunga");
		} else if(parola2.length() > parola1.length()) {
			System.out.println("La parola '" + parola2 + "' è più lunga");			
		} else {
			System.out.println("Le parole hanno la stessa lunghezza");
		}
	}
}
