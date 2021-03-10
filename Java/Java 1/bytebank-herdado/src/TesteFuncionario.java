
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		nico.setNome("Nico");
		nico.setCpf("25843624");
		nico.setSalario(3000);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
