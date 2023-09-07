package aluno;

public class BancoTeste {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria("001","94823");
		
		try {
			c1.creditar(9);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		ContaBancaria c2 = new ContaBancaria("002","94800");
		try {
			c2.creditar(9);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			c1.creditar(40);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			c2.creditar(20);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			c1.debitar(1);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			c1.transferir(9, c2);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		

	}

}
