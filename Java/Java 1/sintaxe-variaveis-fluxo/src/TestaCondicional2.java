
public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("Casa de Swing FOGO NA CA�APA");
		
		int idade = 18;
		boolean acompanhado = false;
		
		if(idade >= 18 && idade <30 || acompanhado) {
			System.out.println("Seja bem vindo!");
		}else {
			System.out.println("Infelizmente voc� n�o pode entrar!");
		}
		
		if(idade >= 30 || acompanhado == false) {
			System.out.println("Voc� � muito velho ou est� desacompanhado!");
		}
	}
}
