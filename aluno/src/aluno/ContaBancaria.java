package aluno;

public class ContaBancaria {
	public ContaBancaria(String numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;
	}
	private String numero;
	private String cpf;
	private double saldo;

	
	public void creditar(double valor) throws Exception{
		if (valor > 10)
			saldo = saldo + valor;
		else {
			throw new Exception ("Só pode depositar quantias acima de 10 reais");
		}
	}
	
	public void debitar (double valor) throws Exception {
		
		if (valor > saldo)
		throw new Exception ("Quantia inválida");
		else
			saldo = saldo - valor;
	}
	
	public void transferir(double valor,ContaBancaria destino)throws Exception {
		
	try {
		this.debitar(valor);
	}
	catch(Exception e){
		System.out.println("Erro na transferência: " + e.getMessage());
		
	}
	try {
		destino.creditar(valor);
	}
	catch(Exception f) {
		System.out.println("Erro na transferência: " + f.getMessage());
	}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo + ", getNumero()=" + getNumero()
				+ ", getCpf()=" + getCpf() + ", getSaldo()=" + getSaldo() + "]";
	}
	
	public ContaBancaria clone () {
		String cpf = this.cpf;
		String numero = this.numero;
		double saldo = this.saldo;
		ContaBancaria clone = new ContaBancaria(cpf,numero);
		clone.setSaldo(saldo);
		return clone;
		
	}
}