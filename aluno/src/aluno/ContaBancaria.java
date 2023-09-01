package aluno;

import aluno.ContaBancaria;

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

	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar (double valor) {
		saldo = saldo - valor;
	}
	
	public void transferir(double valor,ContaBancaria destino) {
		
		this.debitar(valor);
		destino.creditar(valor);
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