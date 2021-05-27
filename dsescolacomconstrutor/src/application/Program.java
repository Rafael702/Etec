package application;

import java.util.Scanner;

import entities.Aluno;
import entities.Pessoa;
import entities.Professor;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa ps = new Pessoa();
		Professor pf = new Professor();
		Aluno al = new Aluno();
		
		int n;
							
		System.out.println("Escolha uma das opções e digite o número indicado: \n" + "1 - Professor; 2 - Aluno; 3 - Outro" );
		n = sc.nextInt();
	
		if(n == 1) {
		
		System.out.println("Infome o nome do Professor: ");
		pf.setNome(sc.next());
		
		System.out.println("Informe a Matricula do Professor: ");
		pf.setMatricula(sc.next());
		
		System.out.println("Informe o endereço em que reside o Professor: ");
		pf.setEndereco(sc.next());
		
		System.out.println("Informe o bairro em que o Professor reside atualmente: ");
		pf.setBairro("Robru");
		
		System.out.println("Informe o salário do Professor: ");
		pf.setSalario(sc.nextInt());
		
		System.out.println("Informe o sexo do Professor: ");
		pf.setSexo(sc.next());
		
		System.out.println(pf);
		
		}else if(n == 2) {
		
		System.out.println("Informe o nome do Aluno: ");
		al.setNome(sc.next());
		
		System.out.println("Informe a Matricula do Aluno: ");
		al.setMatricula(sc.next());
		
		System.out.println("Informe o endereço em que reside Aluno: ");
		al.setEndereco(sc.next());
		
		System.out.println("Infome o bairro em que o Aluno reside atualmente: ");
		al.setBairro(sc.next());
		
		System.out.println("Informe o sexo do Aluno");
		al.setSexo(sc.next());
		
		System.out.println(al);
		
		}else {
		System.out.println("Infome o nome: ");
		ps.setNome(sc.next());
		
		System.out.println("Informe a Matricula: ");
		ps.setMatricula(sc.next());
		
		System.out.println("Informe o endereço em que reside: ");
		ps.setEndereco(sc.next());
		
		System.out.println("Informe o bairro em que reside atualmente: ");
		ps.setBairro("Robru");
		
		System.out.println("Informe o salário: ");
		ps.setSalario(sc.nextInt());
		
		System.out.println("Informe o sexo: ");
		ps.setSexo(sc.next());
		
		System.out.println(ps);
	}

		}
		
			}


