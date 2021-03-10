
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaExemplo = new Conta();
		contaExemplo.saldo = 100;
		contaExemplo.deposita(50);
		System.out.println(contaExemplo.saldo);
		
		boolean conseguiuRetirar = contaExemplo.saca(20);
		
		System.out.println(contaExemplo.saldo);
		
		if(conseguiuRetirar) {
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Não foi possível realizar o seu saque");
		}
		
		
		Conta contaRica = new Conta();
		
		contaRica.deposita(1000);
		
		if(contaRica.transfere(500, contaExemplo)) {
			System.out.println("Transferência realizada com sucesso!");
		}
		
		System.out.println(contaRica.saldo);
		System.out.println(contaExemplo.saldo);
		
		contaExemplo.titular = "Dimitri Muller";
		System.out.println(contaExemplo.titular);
		
	}
}
