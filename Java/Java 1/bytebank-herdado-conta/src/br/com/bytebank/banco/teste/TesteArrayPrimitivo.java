package br.com.bytebank.banco.teste;


public class TesteArrayPrimitivo {

	//Array
	public static void main(String[] args) {

		int[]idades = new int[5]; // Array
		
		idades[0] = 19;
		
		System.out.println(idades[0]);
		
		
		
		idades[1] = 29;
		idades[2] = 39;
		idades[3] = 49;
		idades[4] = 59;
		
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		System.out.println(idades[3]);
		System.out.println(idades[4]);
		
		System.out.println("Length do array: " + idades.length);

		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
	}

	
}