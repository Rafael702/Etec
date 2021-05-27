package entities;

public class ContaFisica {
	//atributos
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaFisica() {
		
	}

	public ContaFisica(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//método
	
	public void saque(double valor) {
		this.saldo= saldo-valor;
	}
	public void deposito(double valor) {
		this.saldo = saldo+valor;
	}
	
}