
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("A primeira conta tem saldo de R$" + primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("A segunda conta tem saldo de R$" + segundaConta.saldo);
		
		System.out.println("Ag�ncia da primeira conta: " + primeiraConta.agencia);
		System.out.println("Titular da primeira conta: " + primeiraConta.titular);
		
		if(primeiraConta == segundaConta) {
			System.out.println("As contas na verdade s�o a mesma conta!");
		}else {
			System.out.println("As contas s�o dois objetos diferentes!");
			System.out.println("Aqui est� a prova: ");
			System.out.println("Refer�ncia da primeira conta: " + primeiraConta);
			System.out.println("Refer�ncia da segunda conta: " + segundaConta);
		}
		
	}
}
