package org.lessons.hello;

import java.util.Scanner;

public class Condizionali {

	public static void main(String[] args) {
		//se si verifica una data condizione 
		//entro nell'if
		
		//altrimenti se ...
		//entro nell'else if
		
		
		//....
		
		
		//altrimenti
		//entro nell'else
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire un numero");
		int scelta = scan.nextInt();
		
		if(scelta == 1 || scelta == - 1) {
			//....
		} else if(scelta > 0) {
			
		} else {
			//...
		}
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		if(scelta == 1 || scelta == -1) {
			
		}
		
		if(scelta > 0) {
			
		}
		
		
		
		switch(scelta) {
		case 1:
			System.out.println("è stato scelto 1");
			break;
		case 2:
			System.out.println("è stato scelto 2");
			break;
		case 3:
			System.out.println("è stato scelto 3");
			break;
		default:
			System.out.println("Default");
			
		}
			
		
	}
}
