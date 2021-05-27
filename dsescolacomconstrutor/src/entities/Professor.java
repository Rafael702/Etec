package entities;

public class Professor extends Pessoa {
	
	private String formacaoAcademica;
	
	public Professor() {
		
	}

	public Professor(String matricula, String nome, String endereco, String bairro, int salario, String sexo,String formacaoAcademica) {
		super(matricula, nome, endereco, bairro, salario, sexo);
		this.formacaoAcademica = formacaoAcademica;
	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
		
		public void aplicarAvaliacao() {
			
		}

		
		public String toString() {
			return "Dados do Professor: \n" + "Matricula: " + getMatricula() + ", Nome: " + getNome()
					+ ", Endereco: " + getEndereco() + ", Bairro: " + getBairro() + ", Salario: "
					+ getSalario() + ", Sexo: " + getSexo();
		}
	
	
		
	
}
