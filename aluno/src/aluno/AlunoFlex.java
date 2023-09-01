package aluno;

public class AlunoFlex {
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public AlunoFlex(String nome, double[] notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}
	String nome;
	double [] notas;
	
	
	
	public double getMedia() {
		double somador = 0;
		double contador = 0;
		for (double nota:notas) {
			somador = somador + nota;
			contador = contador + 1; }
			
		 double media = somador / notas.length;
		
		 return media;
		}
	
	
	public String situacao() {
		if (this.getMedia()>7) 
			return "Você foi Aprovado";
		else
			return "Você foi Reprovado";
		
	}
	}
	
