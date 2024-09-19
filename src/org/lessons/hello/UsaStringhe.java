package org.lessons.hello;

public class UsaStringhe {
	
	public static void main(String[] args) {
		String ciao = "Hello World!";
		
		System.out.println("Originale: " + ciao);
		
		System.out.println("Lower case: " + ciao.toLowerCase());
		
		System.out.println("? " + ciao);
		
		String ciao2 = ciao.toUpperCase();
		
		System.out.println("Altra stringa: " + ciao2);
		
		System.out.println("? " + ciao);
		
		ciao = "Pippo";// ciao.toUpperCase();
		
		System.out.println("? " + ciao);
		
		
		
		double pi = 3.148023;
		String piFormatted = String.format("%.2f", pi);
		
		System.out.println(piFormatted);
		
		
		String pippo = "Pippo";
		System.out.println(String.format("I nomi sono %s, %s", pippo, "Pluto"));

		System.out.println(String.format("%s ha mangiato %d mele", pippo, 3));
		System.out.println(pippo + " ha mangiato " + 3 + " mele");
	}
}
