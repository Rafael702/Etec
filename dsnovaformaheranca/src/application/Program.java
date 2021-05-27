package application;

import entities.Funcionario;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		PessoaFisica ps = new PessoaFisica();
		
		ps.setNome("Maria Paula");
		ps.setRg("12345");
		
		Funcionario func = new Funcionario();
		
		func.setNome("Marcelo");
		func.setRg("3456");
		func.setCartao("125345");
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome("Romero");
		pj.setCnpj("1234");
		pj.setTotalFuncionarios(10);
		
		
		
		
		
	}

}
