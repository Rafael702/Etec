package entities;

public class Funcionario extends PessoaFisica{
	
	private String cartao;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String rg, String cartao) {
		super(nome, rg);
		this.cartao = cartao;
		
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String toString() {
		return "Nome: " + 	getNome() +
				", RG: " + getRg() + 
				", Cartão: " + cartao; 
	}
	
	
}
