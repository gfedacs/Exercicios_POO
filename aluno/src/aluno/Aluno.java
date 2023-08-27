package aluno;

public class Aluno {

    public Aluno(int id, double nota1, double nota2) {
        super();
        this.id = id;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    private int id;
    private double nota1;
    private double nota2;
    
    @Override
	public String toString() {
		return "Aluno [id=" + id + ", nota1=" + nota1 + ", nota2=" + nota2 + ", getId()=" + getId() + ", getNota1()="
				+ getNota1() + ", getNota2()=" + getNota2() + ", calcularMedia()=" + calcularMedia() + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getNota1() {
		return nota1;
	}


	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}


	public double getNota2() {
		return nota2;
	}


	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}


	public Aluno () {}

    
    public double calcularMedia() {
        
        double media = (nota1 + nota2) / 2;
        return media;
    }
    
    public void darPonto() {
    	double acrescimo = nota2 + 1.0;
    }
    
    
}