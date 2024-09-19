package org.lessons.hello;

import java.util.Scanner;

public class PasswordGenerator {
	
	/*
	 * salvare in opportune variabili:
	 * - il nome
	 * - cognome
	 * - colore preferito
	 * - data di nascita di un utente
	 * 		suddivisa in 
	 * 		. giorno
	 * 		. mese 
	 * 		. anno in numero 
	 * 
	 * generare (e stampare a video) una password  concatenando 
	 * - nome
	 * - cognome, 
	 * - colore preferito 
	 * - somma di giorno, mese e anno di nascita 
	 *  separate dal carattere -
	 */
	public static void main(String[] args) {
		
		String nome;
		String cognome;
		String colore;
		int giorno;
		int mese;
		int anno;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Benvenuto nel creatore di password.");
		System.out.println("Inserire i tuoi dati per generare la tua password.");
		
		System.out.println("Inserisci il tuo nome:");
		nome = scan.next();
		
		System.out.println("Inserisci il tuo cognome:");
		cognome = scan.next();
		
		System.out.println("Inserisci il tuo colore preferito:");
		colore = scan.next();
		
		System.out.println("Inserisci il tuo giorno di nascita:");
		giorno = scan.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita:");
		mese = scan.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita:");
		anno = scan.nextInt();
		
		System.out.println("Calcolando la tua password...");
		
		int somma = giorno + mese + anno;
		
		String password = nome + "-" + cognome + "-" + colore + "-" + somma;
		
		System.out.println(String.format("La tua password è %s", password));
		
		String pwdConcat = nome.concat("-").concat(cognome).concat("-")
							.concat(colore).concat("-").concat("" + somma);
		
		System.out.println(String.format("La tua password è %s", pwdConcat));
	}
}
