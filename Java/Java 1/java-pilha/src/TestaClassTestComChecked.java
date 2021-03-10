
public class TestaClassTestComChecked {

	public static void main(String[] args) {
		
		ClassTest c = new ClassTest();
		try {
			c.deposita();
		} catch (MinhaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Tratando o erro...");
		}
		
	}
	
}
