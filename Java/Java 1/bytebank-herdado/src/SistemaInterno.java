
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel au) {
		if(au.autentica(this.senha)) {
			System.out.println("Usu�rio autenticado!");
		}else {
			System.out.println("Autentica��o falhou!");
		}
	}
	
}
