import java.util.Scanner;

public class Adivinharsenha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a senha pra acessar o cofre: ");
		
		String senha = teclado.next();
		
		
		while (!senha.equals("1804")) {
			
			System.out.println("Senha incorreta, tente novamente !");
			
			senha = teclado.next();
			
			
		}
		
		teclado.close();
		System.out.println("Você acertou !");

	}

}
