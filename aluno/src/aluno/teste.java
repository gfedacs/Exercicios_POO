package aluno;


public class teste {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("001","12394");
		ContaBancaria c2 = new ContaBancaria("002","12314");
		
		c1.creditar(100);
		c2.creditar(200);
		
		c1.transferir(50, c2);
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		ContaBancaria c3 = c2.clone();
		
		System.out.println(c3.getSaldo());
		

	}

}
