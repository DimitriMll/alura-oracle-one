
public class TestaPontoFlutuante {

	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		
		System.out.println("Meu salário é de " + salario);
		
		double idade = 37;
		
		double divisao = 3.14 / 2;
		
		System.out.println("O resultado é: " + divisao);
		
		int divisaoInteira = 5/2;
		
		System.out.println("Divisão 5/2 com int: " + divisaoInteira);
		
		double novaDivisao = 5.0 / 2;
		
		System.out.println("Divisão com double 5.0 / 2 : " + novaDivisao);
		
		double outraDivisao = 5 / 2;
		
		System.out.println("Divisão com double mas com número inteiro de 5 / 2: "+ outraDivisao);
		
		System.out.println("Isso de cima acontece porque ele faz a conta antes de declarar o 5 como double e o 2 como double, é necessário declarar o 5 como 5.0 que daí ele faz corretamente a divisão");
	}
}
