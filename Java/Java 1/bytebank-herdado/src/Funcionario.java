//abstract diz que n�o pode ser instanciado, � uma classifica��o, n�o algo concreto
public abstract class Funcionario {

	private String nome;
	private String cpf;
	protected double salario; //is public only to childs
	
	
	//abstract aqui s� diz que o m�todo existe, mas ele n�o � utilizado sem um objeto
	public abstract double getBonificacao();
	//e obriga os filhos a implementarem esse m�todo
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
