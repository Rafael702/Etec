package entities;

public class Produto {
	//Atributo
	public String nome;
	public double preco;
	public int quantidade;
					//Param�tros
	public Produto(String nome, double preco, int quantidade) {
/*Palavra Reservada; this.nome: est� se referindo ao atributo nome e n�o ao par�metro; 
 * Faz refer�ncia ao atributo da classe*/
		this.nome = nome; /*o atributo nome recebe nome. � a mesma coisa para os outros*/
		this.preco = preco;
		this.quantidade = quantidade;
		
		
	}
}
