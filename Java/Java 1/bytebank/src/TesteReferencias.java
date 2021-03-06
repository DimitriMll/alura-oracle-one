
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta ? de R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("O saldo da segunda conta ? de R$" + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		
		//Nesse momento, notamos que criamos duas refer?ncias para o mesmo objeto conta
		//Que no caso ? somente uma, somente 1 objeto conta, mas com duas refer?ncias
		//Assim, o que alteramos nessa conta, pode ser tanto alterado quanto consultado
		//Por qualquer uma das refer?ncias que criamos, pois elas apontam para o mesmo objeto!
	
		
		if(primeiraConta == segundaConta) {
			System.out.println("A primeira e a segunda conta, na verdade, s?o a mesma conta!");
			System.out.println("A refer?ncia da primeira conta ?: " + primeiraConta);
			System.out.println("A refer?ncia da segunda conta ?: " + segundaConta);
		}
	}
}
