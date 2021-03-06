package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";// object literal
		// Mesma coisa que
		// String nome = new String("Alura");

		nome.replace("A", "a");
		System.out.println("nome.replace(\"A\", \"a\"); ");
		System.out.println(nome);
		System.out.println();
		// Aqui notamos que a String ? imut?vel, quando criamos uma String ela nasce e
		// morre sem poder sofrer qualquer altera??o

		String outra = nome.replace("A", "a");
		System.out.println("String outra = nome.replace(\"A\", \"a\");");
		System.out.println(outra);
		System.out.println();
		// Agora que criamos uma nova String, ela j? nasce alterada, trazendo a
		// altera??o e nunca mais a perdendo

		outra.replace("a", "A");
		System.out.println("outra.replace(\"a\", \"A\");");
		System.out.println(outra);
		System.out.println();
		// Assim funciona
		
		String maisUma = nome.toLowerCase();
		System.out.println("String maisUma = nome.toLowerCase();");
		System.out.println(maisUma);
		System.out.println();
		// Outra maneira de fazer
		
		String maisUma2 = nome.toUpperCase();
		System.out.println("String maisUma = nome.toUpperCase();");
		System.out.println(maisUma2);
		System.out.println();
		// Outra maneira de fazer
		
		String outra2 = nome.replace("Al", "MAL");
		System.out.println("String outra2 = nome.replace(\"Al\", \"MAL\");");
		System.out.println(outra2);
		System.out.println();
		// Outro m?todo
		
		char c = 'A';
		char d = 'a';
		
		String outra3 = nome.replace(c, d);
		System.out.println("String outra3 = nome.replace(c, d);");
		System.out.println(outra3);
		System.out.println();
		// Outro m?todo
		
		
		char f = nome.charAt(2);
		System.out.println("Mostra o caract?r na posi??o indicada");
		System.out.println(f);
		System.out.println();
		// Mostra o caract?r na posi??o indicada
		
		
		System.out.println("Retorna a posi??o do caracter indicado");
		System.out.println(nome.indexOf("u"));
		System.out.println();
		
		
		System.out.println("Retorna a substring a partir da posi??o indicada");
		System.out.println(nome.substring(1));
		System.out.println();
		
		
		System.out.println("Retorna o tamanho");
		System.out.println(nome.length());
		System.out.println();
		
		
		System.out.println("For");
		for(int i=0 ; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		System.out.println();
		
		String vazio = "";
		System.out.println("Diz se est? vazio");
		System.out.println(vazio.isEmpty());
		System.out.println();
		
		String spaced = "           Alura     ";
		String trimmed = spaced.trim();
		System.out.println("Faz o trim da String");
		System.out.println(spaced);
		System.out.println(trimmed);
		System.out.println();
		
		
		System.out.println("Verifica se contains");
		System.out.println(trimmed.contains("Alu"));
		System.out.println();
		
	}
}
