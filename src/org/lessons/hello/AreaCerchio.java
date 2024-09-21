package org.lessons.hello;

import java.util.Scanner;

public class AreaCerchio {

	/*
	 * Scrivi un programma che calcoli l'area di un cerchio. 
	 * L'utente deve inserire il raggio e 
	 * il programma restituirà l'area.
	 */
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Indica il raggio per calcolare "
		 		+ "l'area del cerchio");
		 
		 double raggio = scan.nextDouble();
		 
		 double area = Math.pow(raggio, 2) * Math.PI;
		 
//		 area = raggio * raggio * 3.14;
		 
		 System.out.println("L'area del cerchio è " + area);
	}
}
