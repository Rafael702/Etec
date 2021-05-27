package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		List<Empregado>list = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcionários: ");
		int n = sc.nextInt();
		
		System.out.println("");
		for(int i = 1; i<=n; i++) {
			System.out.println(" Funcionário # " + i);
			System.out.println("--------------------------");
			System.out.println(" Terceirizado (s/n) ?");
			char ch = sc.next().charAt(0); 
			
			System.out.println("Digite o nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite o total de horas : ");
			int horas = sc.nextInt();
			
			System.out.println("Digite o valor da hora : ");
			double valorPorHora = sc.nextDouble();
			
			if(ch == 's') {
				System.out.println("Informe o valor da despesa: ");
				double valorAdicional = sc.nextDouble();
				Empregado emp = new EmpregadoTerceirizado(nome,horas,valorPorHora,valorAdicional);
				list.add(emp);
				
			}else {
				Empregado emp = new Empregado(nome, horas, valorPorHora);
				list.add(emp);
			}
			
		}
		
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("RELAÇÃO DE PAGAMENTOS");
		System.out.println("----------------------");
		
		double total = 0.0;
		//Para cada Empregado da lista
		for (Empregado emp:list) { 
			System.out.println(emp.getNome() + ", R$ " + String.format("%.2f",emp.pagamento()));
			total = total + emp.pagamento();
		}
		
		System.out.println("");
		System.out.println("TOTAL DA FOLHA DE PAGAMENTO------> " + String.format("%.2f", total));
		
		
		sc.close();
	}

}
