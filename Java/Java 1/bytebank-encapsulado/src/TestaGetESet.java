
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2456);
		conta.setNumero(1337);//setter do numero, pois ? private
		System.out.println(conta.getNumero());//getter do numero, pois ? private
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Silveira");
		System.out.println(paulo.getNome());
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(paulo.getProfissao());
	}
}
