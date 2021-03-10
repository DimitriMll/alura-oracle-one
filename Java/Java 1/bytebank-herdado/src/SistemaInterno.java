
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel au) {
		if(au.autentica(this.senha)) {
			System.out.println("Usuário autenticado!");
		}else {
			System.out.println("Autenticação falhou!");
		}
	}
	
}
