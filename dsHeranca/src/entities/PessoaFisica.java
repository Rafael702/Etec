package entities;

public class PessoaFisica extends Pessoa{
	
	private String rg;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String rg) {
		super(nome); //este atributo ('nome') � da classe que a Pessoa Fisica est� herdando
		this.rg = rg; //este atributo � da classe Pessoa Fisica
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String toString() {
		return "Nome: " + getNome() + ", RG: " + getRg();
	}
}
