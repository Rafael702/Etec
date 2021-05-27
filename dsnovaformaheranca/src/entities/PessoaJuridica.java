package entities;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private int totalFuncionarios;

	public int getTotalFuncionarios() {
		return totalFuncionarios;
	}

	public void setTotalFuncionarios(int totalFuncionarios) {
		this.totalFuncionarios = totalFuncionarios;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
