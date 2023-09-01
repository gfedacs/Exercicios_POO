package aluno;


public class TesteVenda {

	public static void main(String[] args) {
		produto milho = new produto ("milho",30,5.0);
		
		Venda venda1= new Venda("18/04/2002",milho,15);
		
		System.out.println(venda1.getProduto());
		
		
		System.out.println(milho.getEstoque());
		venda1.decrementa();
		System.out.println(milho.getEstoque());
		System.out.println("olá");
		System.out.println("Testando");
		
		
		System.out.println(venda1.getValor());
		
		System.out.println(venda1.getNome());
		

	}

}
