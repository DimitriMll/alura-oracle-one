
public class TesteConexao {

	public static void main(String[] args) {
		
		//try com AutoCloseable j� realiza o fechamento da conex�o somente com o try, n�o precisa de finally
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conex�o!");
		}
		
		
		
		//C�digo antigo abaixo, sem o try(asasasas) e AutoCloseable
//----------------------------------------------		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o!");
//		}finally {
//			con.close();
//		}
		
	}

}



// O finally no fim sempre realiza a a��o entre {} 
// independente de acontecer ou n�o o erro!!!
// try apenas com finally � v�lido tamb�m, sem catch