package entities;

public class Aluno extends Pessoa{
	
	private String formadeingresso;
	
	public Aluno() {
		
	}

	public Aluno(String matricula, String nome, String endereco, int salario, String bairro, String sexo,String formadeingresso) {
		super(matricula, nome, endereco, bairro, salario, sexo);
		this.formadeingresso = formadeingresso;
	}

	public String getFormadeingresso() {
		return formadeingresso;
	}

	public void setFormadeingresso(String formadeingresso) {
		this.formadeingresso = formadeingresso;
	}
	
	public void realizarAvaliacao() {
		
	}
	
	public String toString() {
		return "Dados do Aluno:\n" + "Matricula: " + getMatricula() + ", Nome: " + getNome()
				+ ", Endereco: " + getEndereco() + ", Bairro: " + getBairro() +  ", Sexo: " + getSexo();
	}
	
	
}
