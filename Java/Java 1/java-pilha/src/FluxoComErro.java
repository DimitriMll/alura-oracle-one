
public class FluxoComErro {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch(Exception ex){
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");

	}

	private static void metodo2() throws MinhaException {
		System.out.println("Inicio método 2");
		throw new MinhaException("Erro!"); 
		//System.out.println("Fim metodo 2");
	}

}
