import java.util.Random;

public class sorteioum {

	public static void main(String[] args) {
		
		
		Random sorteio = new Random();
		
		int numero;
		int cont = 0 ;
		
		
		do { 
			
			numero = sorteio.nextInt(49,53);
			
			System.out.println(numero);
			
			cont++;
			
			
			
			
		}
		while (numero != 51);
		System.out.println("Olá:"+cont);

	}

}
