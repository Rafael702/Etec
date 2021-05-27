package entities;

public class Produto {
	//Atributo
	public String nome;
	public double preco;
	public int quantidade;
					//Paramêtros
	public Produto(String nome, double preco, int quantidade) {
/*Palavra Reservada; this.nome: está se referindo ao atributo nome e não ao parâmetro; 
 * Faz referência ao atributo da classe*/
		this.nome = nome; /*o atributo nome recebe nome. É a mesma coisa para os outros*/
		this.preco = preco;
		this.quantidade = quantidade;
		
		
	}
}
