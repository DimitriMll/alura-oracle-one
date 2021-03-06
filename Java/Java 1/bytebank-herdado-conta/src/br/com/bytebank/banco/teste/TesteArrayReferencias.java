package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		//ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 10);
		
		contas[0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(123, 101);
		
		contas[1] = cp1;
		
		System.out.println(contas[1].getNumero());
		
		System.out.println(contas[0]);
		
		System.out.println(cc1.getAgencia());
		
		System.out.println(contas[0].getAgencia());
		
		Conta ref = contas[0];
		
		ContaPoupanca ref2 = (ContaPoupanca) contas[1];
		
		System.out.println(ref.getAgencia());
		
		System.out.println(ref2.getNumero());
		
		
		int[] numeros = new int[6];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		//Esses dois de cima e de baixo s?o a mesma coisa
		// de cima mais cl?ssico, de baixo mais literal e direto
		
		int[] refs = {1,2,3,4,5};
		
	}
	
}
