
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2456);//O problema � que a conta nasce com valor = 0 :(
		System.out.println("Essa conta foi criada na ag�ncia: " + conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 2547);
		System.out.println("Essa conta foi criada na ag�ncia: " + conta2.getAgencia());
		
		System.out.println(Conta.getTotal());
	}
}
