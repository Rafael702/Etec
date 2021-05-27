package entities;

public class Veiculo {
	public String marca;
	public String modelo;
	public String cor;
	public String combustivel; 
	public int ano;
	public double preco;
	public int quantidade;
	

	public Veiculo(String marca, String modelo, String cor, String combustivel ,int ano, double preco, int quantidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
		this.ano = ano;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public boolean validarAno() {
		if(ano <= 2019 ) {
			return false;
		}else {
			return true;
		}
	
	}
	
	public double valorTotalEstoque() {
		return quantidade*preco;
		
	}
	

}
