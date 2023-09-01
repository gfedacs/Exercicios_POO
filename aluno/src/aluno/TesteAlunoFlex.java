package aluno;



public class TesteAlunoFlex {

	public static void main(String[] args) {
		
		double[] notasDoAlunoA = { 8.5, 7.0, 9.2 };
		AlunoFlex a = new AlunoFlex("Gabriel",notasDoAlunoA);
		
		System.out.println(a.getMedia());
		System.out.println(a.situacao());
		
	
	}

}
