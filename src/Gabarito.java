import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gabarito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

	
		
		String leitura1 = JOptionPane.showInputDialog("Qual suas respostas? ");
		
		String leitura2 = JOptionPane.showInputDialog("Qual gabarito? ");
		
		String[] respostas = leitura1.split("");

		String[] gabarito = leitura2.split("");
		
		boolean verificador = true;
		
		
		if (respostas.length < gabarito.length) { 
			JOptionPane.showMessageDialog(null,"Esta faltando respostas.");
			System.exit(0);
		}
		else if (respostas.length < gabarito.length) {
			JOptionPane.showMessageDialog(null,"Voce digitou mais respostas do que o gabarito.");
			System.exit(0);
		}

		else
			verificador = false;
			

		

		

		int soma = 0;
		int contador = 0;

		for (; contador < leitura2.length(); contador++) {

			if (gabarito[contador].equals(respostas[contador])) {
				soma++;
				
				JOptionPane.showMessageDialog(null,"Voce acertou a questao " + contador);
			}

			else {
				JOptionPane.showMessageDialog(null,"Voce errou a questao " + contador);
			}

		}

		if (soma > 6) {
			JOptionPane.showMessageDialog(null,"Voce passou e acertou " + soma);
		} else {
			JOptionPane.showMessageDialog(null,"Voce foi reprovado e acertou " + soma);
		}

	}

}

