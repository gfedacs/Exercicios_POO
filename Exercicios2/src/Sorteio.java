import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		
		Random sorteio = new Random();
		
		int cont = 0;
		
		int resultado = 0;
		
		
		for (;cont<6;cont++) {
			
			resultado = sorteio.nextInt(58,60);
			System.out.println(resultado);
			
			
			
			
		}

	}

}
