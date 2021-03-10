
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

	// Aqui tem que explicitar tamb�m, s� n�o precisa, se o m�todo resolver a exce��o, por isso que no main n�o precisa!
	
	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");

	}

	
	// Esse m�todo, extended only to Exception, not to RunTimeException
	 // Precisa estar expl�cito na declara��o do m�todo que ele � throwable
	  // O nome dessa exce��o, que extends directly to Exception � Checked!
	   // O nome da exce��o que � extended to RunTimeException � Unchecked,
	    // pois ela n�o � verificada, checked, pelo compilador!!
	private static void metodo2() throws MinhaException {
		System.out.println("Ini do metodo2");
		throw new MinhaException("Deu errado!");
		
		//System.out.println("Fim do metodo2");
	}

}
