
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException | MinhaException ex){
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	// Aqui tem que explicitar também, só não precisa, se o método resolver a exceção, por isso que no main não precisa!
	
	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");

	}

	
	// Esse método, extended only to Exception, not to RunTimeException
	 // Precisa estar explícito na declaração do método que ele é throwable
	  // O nome dessa exceção, que extends directly to Exception é Checked!
	   // O nome da exceção que é extended to RunTimeException é Unchecked,
	    // pois ela não é verificada, checked, pelo compilador!!
	private static void metodo2() throws MinhaException {
		System.out.println("Ini do metodo2");
		throw new MinhaException("Deu errado!");
		
		//System.out.println("Fim do metodo2");
	}

}
