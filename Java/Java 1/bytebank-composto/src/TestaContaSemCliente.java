
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta(); //Criamos a conta com os atributos dela
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente();//Adicionamos um Cliente ? conta
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela";//Somente aqui atribu?mos um nome ao titular da conta
		System.out.println(contaDaMarcela.titular.nome);
		
	}
}
