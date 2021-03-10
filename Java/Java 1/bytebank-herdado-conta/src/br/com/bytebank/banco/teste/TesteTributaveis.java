package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

/**
 * A class TesteTributaveis é uma class para realizar testes com as classes que
 * são tributáveis.
 * 
 * @author Dimitri Muller
 *
 */

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		System.out.println(calc.getTotalImposto());

	}

}
