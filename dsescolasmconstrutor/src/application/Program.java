package application;

import entities.Aluno;
import entities.Pessoa;
import entities.Professor;

public class Program {

	public static void main(String[] args) {
		
		Pessoa ps = new Pessoa();
		Aluno al = new Aluno();
		Professor pf = new Professor();
		
		ps.setMatricula("157");
		ps.setNome("José");
		ps.setEndereco("R.Francisco Souza");
		ps.setBairro("Itaim Bibi");
		ps.setSalario(1000);
		ps.setSexo("Masculino");
		
		al.setMatricula("612");
		al.setNome("Francis");
		al.setEndereco("R.Bondosco Silva Souza");
		al.setBairro("Mooca");
		al.setSexo("Masculino");
		
		pf.setMatricula("200");
		pf.setNome("Rose");
		pf.setEndereco("R.Dom João Nery");
		pf.setBairro("Itaim Paulista");
		pf.setSalario(1500);
		pf.setSexo("Feminino");
		
		System.out.println("Dados de Pessoa:\nMatricula: " + ps.getMatricula() + "; Nome: " + ps.getNome() + "; Endereço: " + ps.getEndereco() 
		+ "; Bairro: " + ps.getBairro() + "; Salario: " + ps.getSalario() + "; Sexo: " + ps.getSexo());
		
		System.out.println("Dados do Aluno:\nMatricula: " + al.getMatricula() + "; Nome: " + al.getNome() + "; Endereço: " + al.getEndereco() 
		+ "; Bairro: " + al.getBairro() + "; Sexo: " + al.getSexo());
		
		System.out.println("Dados do Professor:\nMatricula: " + pf.getMatricula() + "; Nome: " + pf.getNome() + "; Endereço: " + pf.getEndereco() 
		+ "; Bairro: " + pf.getBairro() + "; Salario: " + pf.getSalario() + "; Sexo: " + pf.getSexo());
		
	}

}
