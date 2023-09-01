package aluno;



public class Venda {
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public produto getProduto() {
		return produto;
	}

	public void setProduto(produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Venda(String data, aluno.produto produto, int quantidade) {
		super();
		this.data = data;
		this.produto = produto;
		this.quantidade = quantidade;
		this.nome = produto.getNome();
		this.valor = produto.getPreco() * quantidade;
		
		
		
		
	}
	private String data;
	private produto produto ;
	private int quantidade;
	private String nome;
	private double valor;
	
	public void decrementa() {
		produto.setEstoque(produto.getEstoque()- this.getQuantidade());
		
	}

	@Override
	public String toString() {
		return "Venda [data=" + data + ", produto=" + produto + ", quantidade=" + quantidade + ", nome=" + nome
				+ ", valor=" + valor + ", getData()=" + getData() + ", getProduto()=" + getProduto()
				+ ", getQuantidade()=" + getQuantidade() + ", getNome()=" + getNome() + ", getValor()=" + getValor()
				+ "]";
	}
	
	
	

}