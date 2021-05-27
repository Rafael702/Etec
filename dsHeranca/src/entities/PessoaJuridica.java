package entities;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	private int totalFuncionarios;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, String cnpj, int totalFuncionarios) {
		super(nome);
		this.cnpj = cnpj;
		this.totalFuncionarios = totalFuncionarios;
		
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getTotalFuncionarios() {
		return totalFuncionarios;
	}
	public void setTotalFuncionarios(int totalFuncionarios) {
		this.totalFuncionarios = totalFuncionarios;
	}
	
	public String toString() {
		return "Nome: " + getNome() + ", CNPJ: " + getCnpj() + ", Total Funcionários: " + getTotalFuncionarios(); 
	
	}
	 
}
