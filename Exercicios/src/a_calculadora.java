import java.util.Scanner;

public class a_calculadora {

    public static void main(String[] args) {
    	
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero para calcular: ");
        double numero1 = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Digite o segundo número: ");
        double numero2 = teclado.nextDouble();
        teclado.nextLine();

        String operacao = "";
        double resultado = 0.0;

        while (!operacao.equals("A") && !operacao.equals("S") && !operacao.equals("M") && !operacao.equals("D")) {
        	
            System.out.println("Agora digite a operacao que voce quer realizar: ");
            
            System.out.println("A, S, M ou D");
            
            operacao = teclado.nextLine();

            if (operacao.equals("A")) {
            	
                resultado = numero1 + numero2;
                System.out.println(resultado);
                
            } else if (operacao.equals("S")) {
            	
                resultado = numero1 - numero2;
                System.out.println(resultado);
                
            } else if (operacao.equals("M")) {
            	
                resultado = numero1 * numero2;
                System.out.println(resultado);
                
            } else if (operacao.equals("D")) {
            	
                resultado = numero1 / numero2;
                System.out.println(resultado);
                
                
            } else {
                System.out.println("Você só pode digitar A, S, M ou D");
            }
        }

        
    }
}

