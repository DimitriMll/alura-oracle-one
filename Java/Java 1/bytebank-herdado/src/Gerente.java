
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	public double getBonificacao() {
		System.out.println("M�todo de bonifica��o do Gerente");
		return super.getSalario(); // diz que o salario � da classe super, classe m�e, classe base
	} // super.getBonificacao() chama a bonificacao padrao definida la na super class

}
