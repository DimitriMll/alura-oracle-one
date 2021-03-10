
public class TestaConversao {
	
	public static void main(String[] args) {
		
		double salario = 1270.50;
		int valor = (int) salario;
		
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		int numeroDe32Bits = 2000000;
		long numeroMaiorQue32Bits = 3500000000l;
		short numeroPequeno16Bits = 6500;
		byte b = 127;
		
		
		System.out.println("Curiosidade na soma de 0.2 com 0.1 usando double");
		
		double numero1 = 0.1;
		double numero2 = 0.2;
		double soma = numero1 + numero2;
		
		System.out.println("A soma de 0.1 com 0.2 usando double é: " + soma);
		
		System.out.println("Pesquise esse número: " + soma + " no Google e entenda porque isso acontece");
				
	}

}
