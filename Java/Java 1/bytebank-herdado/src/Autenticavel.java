// Uma interface é um tipo de contrato onde quem assinar
 // Tem que implementar os métodos VV
  // setSenha
  // autentica

// É uma classe abstrata com todos o métodos abstratos

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
