import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("alura online");
		palavras.add("editora casa do c?digo");
		palavras.add("caelum");
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
//		Comparator<String> comparador = new ComparadorPorTamanho();
//		palavras.sort(comparador);
//		System.out.println(palavras);
		//NOVO		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
//		Consumer<String> consumidor = new ConsumidorDeString();
//		palavras.forEach(consumidor);
		//NOVO		
//		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
		
		
		
		
		//EXEMPLO 
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		//Lambdas s?o top!
		
	}

}


//class ConsumidorDeString implements Consumer<String> {
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//        if(s1.length() < s2.length()) 
//            return -1;
//        if(s1.length() > s2.length()) 
//            return 1;
//        return 0;
//	}
//	
//}
