
public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("Casa de Swing FOGO NA CAÇAPA");
		
		int idade = 18;
		boolean acompanhado = false;
		
		if(idade >= 18 && idade <30 || acompanhado) {
			System.out.println("Seja bem vindo!");
		}else {
			System.out.println("Infelizmente você não pode entrar!");
		}
		
		if(idade >= 30 || acompanhado == false) {
			System.out.println("Você é muito velho ou está desacompanhado!");
		}
	}
}
