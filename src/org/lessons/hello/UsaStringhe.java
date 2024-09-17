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
	}
}
