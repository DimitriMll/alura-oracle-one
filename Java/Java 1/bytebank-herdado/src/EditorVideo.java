
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("M�todo de bonifica��o do Editor de V�deo!");
		return 150; // diz que o salario � da classe super, classe m�e, classe
															// base
	} // super.getBonificacao() chama a bonificacao padrao definida la na super class

}
