
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadeDePessoas = 3;
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas est� acompanhado, pode entrar");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar :(");
			}
		}

	}
}
