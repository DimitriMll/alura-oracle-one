
public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "123.456.789-10";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(1000);
		
		//Associação do Cliente paulo à contaDoPaulo
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo);
		System.out.println();
		System.out.println(contaDoPaulo.titular);
		System.out.println();
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular.cpf);
		System.out.println(contaDoPaulo.titular.profissao);
	}
}
