package application;

import java.util.Scanner;

import entities.Funcionario;
import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa ps = new Pessoa();
		Funcionario func = new Funcionario();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		ps.setNome("Ronald");
		
		func.setNome("Mario Xiwi");
		func.setRg("1234");
		func.setCartao("12345");
		
		pf.setNome("Joseph");
		pf.setRg("775401487");
		
		pj.setNome("Frederich");
		pj.setCnpj("122456789");
		pj.setTotalFuncionarios(32);
		
		System.out.println(ps);
		System.out.println(func);
		System.out.println(pf);
		System.out.println(pj);
		
		sc.close();
	}
}
