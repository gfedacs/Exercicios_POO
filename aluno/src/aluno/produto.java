package aluno;

public class produto {
	
	@Override
	public String toString() {
		return "produto [nome=" + nome + ", estoque=" + estoque + ", preco=" + preco + ", getNome()=" + getNome()
				+ ", getEstoque()=" + getEstoque() + ", getPreco()=" + getPreco() + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public produto(String nome, int estoque, double preco) {
		super();
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
	}
	private String nome;
	private int estoque;
	private double preco;

}
