package org.lessons.hello;

public class SalutaMondo {
	
	static int variabileUno;
	
	{
		variabileUno = 1;
		double numeroVirgola;
		
	}
	
	{
		variabileUno = 1;
		boolean numeroVirgola;
		
	}
	
	
	//Metodo main
	public static void main(String[] args) {
		variabileUno = 1;
		int variabileIntero;
//		boolean variabileIntero;//non si può fare
		
		
		//int 2volte NO
		int volte2; //SI
		
		int variabile_di_tipo_intero; //non segue la naming convention
		
		int variabileDiTipoIntero;
		
		int city;
		
		String articleAbstract;
		
		String paperAbstract;
		
//		System.out.println(variabileIntero);//non compila
		
		variabileIntero = 5;
		System.out.println(variabileIntero);
		
		short numeroCorto = 0;
		numeroCorto = 32767;
//		numeroCorto = 32768;//errore
		
		variabileIntero = 2147483647;
//		variabileIntero = 2147483648;//errore
		
		long numeroLong = 9223372036854775807L;
//		numeroLong = 9223372036854775808L;//errore
		
		
		float numeroFloatMassimo = Float.MAX_VALUE;
		
		System.out.println(numeroFloatMassimo);
		
		double numeroDoubleMassimo = Double.MAX_VALUE;
		
		System.out.println(numeroDoubleMassimo);
		
		boolean vero = true;
		
		char a = 'a';//"a";
		
		float numeroFloat = 2.4F;
		
		double numeroDouble = 3.5;
		
		var variabile = 10;
		
//		variabile = 2.4;//non si può cambiare il tipo
		
		String nome = "Giuseppe";
		
		String numero = "332123456789";
		
		String stringaVuota = "";
		
		System.out.println(nome);
		
		System.out.println(nome.getBytes());
		
		byte [] arrByte = {1, 43, 127, -2};
		
		String fromByte = new String(arrByte);
		
		System.out.println(fromByte);
		
		System.out.println("Ciao Pippo e Pluto e Paperino!");
		
		String nomeACaso = "Pippo" + 4;
		nomeACaso = 4 + "Pippo";
		
		System.out.println("La somma di 4 + 4 fa: " + (4+4));
		System.out.println(4+4 + "La somma di 4 + 4 fa: " );
	}
//	variabileIntero = 10;//non visibile
}
//variabileUno = 10;
