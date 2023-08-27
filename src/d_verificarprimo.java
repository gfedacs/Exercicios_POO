import java.util.Scanner;

public class d_verificarprimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
    
    // Função para verificar se um número é primo
    static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        
        // Percorre os possíveis divisores até a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Encontrou um divisor, não é primo
            }
        }
        
        return true; // Não encontrou divisores, é primo
    }
}
