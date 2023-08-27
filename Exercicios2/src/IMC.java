import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		double peso = 0;
		double altura = 0;
		
		try {
			peso = Double.parseDouble(JOptionPane.showInputDialog(" Qual seu peso? "));
			
			altura = Double.parseDouble(JOptionPane.showInputDialog(" Qual sua altura "));
			
		}
		catch (Exception e ) {
			JOptionPane.showMessageDialog(null,"Formato não permitido");
			System.exit(0);
		}
		
		double imc =  peso/ Math.pow(altura,2);
		
		System.out.println(imc);
		
		
		if (imc < 18.5 )
			
			JOptionPane.showMessageDialog(null,"Você está abaixo do peso");
		else if (imc >= 18.5 && imc <= 24.9 )
			JOptionPane.showMessageDialog(null,"Você está no peso normal");
		else if (imc >= 25 && imc <=29.9 )
			JOptionPane.showMessageDialog(null,"Você está com sobrepeso");
		else if (imc >= 30 && imc <=34.9 )
			JOptionPane.showMessageDialog(null,"Você está na obesidade grau 1");
		else if (imc >= 35 && imc <=39.9 )
			JOptionPane.showMessageDialog(null,"Você está na obesidade grau 2");
		else
			JOptionPane.showMessageDialog(null,"Obesidade de grau 3 ou Mórbida");
			
	}

}
