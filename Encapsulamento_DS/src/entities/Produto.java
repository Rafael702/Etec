package entities;

public class Produto {
	/*public String nome;
	public double preco;
	public int quantidade;*/
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public String getNome() { //método para acessar o nome
		return nome;
	}
	
	public void setNome(String nome) { //método que permite alterar o valor
		this.nome=nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
