
public class c_somanumerosimpares {

	public static void main(String[] args) {
		
		int somador = 0;
		int contador = 0;
		while (contador<10) {
			contador++;
			if ( contador % 2 == 1) {
				
				somador = somador + contador;
						
			}			
				
		}
		System.out.println(somador);
	}

}
