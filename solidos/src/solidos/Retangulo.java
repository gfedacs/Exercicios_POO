package solidos;

public class Retangulo {

	public int id;
	public double largura;
	public double comprimento;
	
;

public Retangulo(int id, double largura, double comprimento) {
	super();
	this.id = id;
	this.largura = largura;
	this.comprimento = comprimento;
}

public Retangulo () {}

public double calcualarArea() {
	return largura * comprimento;
}

public String toString() {
	return "Retangulo [id=" + id + ", largura=" + largura + ", comprimento=" + comprimento + "]";
}

};

