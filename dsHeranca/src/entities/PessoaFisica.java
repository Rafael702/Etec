package entities;

public class PessoaFisica extends Pessoa{
	
	private String rg;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, String rg) {
		super(nome); //este atributo ('nome') é da classe que a Pessoa Fisica está herdando
		this.rg = rg; //este atributo é da classe Pessoa Fisica
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
