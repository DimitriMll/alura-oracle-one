//abstract diz que não pode ser instanciado, é uma classificação, não algo concreto
public abstract class Funcionario {

	private String nome;
	private String cpf;
	protected double salario; //is public only to childs
	
	
	//abstract aqui só diz que o método existe, mas ele não é utilizado sem um objeto
	public abstract double getBonificacao();
	//e obriga os filhos a implementarem esse método
	
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
