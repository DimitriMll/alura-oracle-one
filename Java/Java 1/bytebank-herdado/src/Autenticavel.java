// Uma interface � um tipo de contrato onde quem assinar
 // Tem que implementar os m�todos VV
  // setSenha
  // autentica

// � uma classe abstrata com todos o m�todos abstratos

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
