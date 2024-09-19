package org.lessons.hello;

public class Array {

	public static void main(String[] args) {
		String [] stringhe = {"Giuseppe", "Vincenzo", "Alin", "Gabirel"};
		
		
		/*
		 *  ________________
		 * |	|	|	|	|
		 * |	|	|	|	| 
		 * |  0	| 1	| 2	| 3	| -> 4
		 * |	|	|	|	|
		 * |____|___|___|___|
		 *    2  675  34 341
		 */
		int [] numeri = new int[4];
		numeri[0] = 2;
		numeri[1] = 675;
		numeri[2] = 34;
		numeri[3] = 341;
//		numeri[4] = 32;
		
		int posizioneTre = numeri[3];
		
		System.out.println(stringhe);
		
//		for(int i = 0; i < numeri.length; i++) {
//			System.out.println(numeri[i]);
//		}
		
		String [] arr = new String[10];
		arr[0] = "Pippo";
		arr[7] = "Pluto";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {				
				System.out.println(arr[i]);
			}
		}
		
//		int i = 0;
//		while(i < arr.length) {
//			
//			if(arr[i] != null) {				
//				System.out.println(arr[i]);
//			}
//			
//			i++;
//		}
		
		
		boolean numeroAlto = true;
		int j = 0;
		int somma = 0;
		while(!numeroAlto) {
			System.out.println("Sono nel while");
			somma += numeri[j];
			if(somma >= 700) {
				numeroAlto = true;
			}
			System.out.println(somma);			
			j++;
		}
		
		do {
			System.out.println("Sono nel do-while");
			somma += numeri[j];
			if(somma >= 700) {
				numeroAlto = true;
			}
			System.out.println(somma);			
			j++;
		} while(!numeroAlto);
	}
}
