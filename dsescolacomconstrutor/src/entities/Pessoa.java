package entities;

public class Pessoa {
	private String matricula;
	private String nome;
	private String endereco;
	private String bairro;
	private int salario;
	private String sexo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String matricula, String nome, String endereco, String bairro, int salario, String sexo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.bairro = bairro;
		this.salario = salario;
		this.sexo = sexo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	

	
	public String toString() {
		return "Dados: \n" + "Matricula: " + getMatricula() + ", Nome: " + getNome()
		+ ", Endereco: " + getEndereco() + ", Bairro: " + getBairro() + ", Salario: "
		+ getSalario() + ", Sexo: " + getSexo();

}
	}

