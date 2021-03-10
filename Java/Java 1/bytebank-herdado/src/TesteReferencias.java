
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Igor");		
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(d);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}
	
	/* Agora vamos ver Polimorfismo (formas diferentes
	 * de se referenciar o mesmo objeto)
	 * 
	 * É possível escrever:
	 * 
	 * 	Funcionario g1 = new Gerente();
	 * 
	 * Pois um gerente é um funcionário, mas a referência
	 * g1 irá ser compilada como Funcionário, e não 
	 * possuirá os atributos da Classe Gerente!!
	 * 
	 * Isso é polimorfismo, duas formas diferentes de se
	 * referenciar o mesmo objeto (Objeto Gerente, que nunca muda)
	 */
	
	
}
