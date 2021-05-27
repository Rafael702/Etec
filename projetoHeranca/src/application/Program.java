package application;

import java.util.Scanner;

import entities.ContaFisica;
import entities.ContaJuridica;

public class Program {

		public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ContaFisica contf = new ContaFisica();
		ContaJuridica contj = new ContaJuridica();
		
		int n;
		
		System.out.println("Escolha uma das opções: "+ "\n" + "1 - Conta Fisica ou 2 - Conta Juridica");
		n = sc.nextInt();
		
		if(n == 1) {
		
		System.out.println("Digite o número da conta: ");
		contf.setNumero(sc.nextInt());
		
		System.out.println("Nome do Titular: ");
		contf.setTitular(sc.next());
		
		System.out.println("Informe o saldo: ");
		contf.setSaldo(sc.nextDouble());
		
		System.out.println("Valor do Depósito: ");
		double valor = sc.nextDouble();
		
		contf.deposito(valor);
		
		System.out.println("-------------------------");
		System.out.println("DADOS DA CONTA FISICA");
		System.out.println("--------------------------");
		
		System.out.println("Numero da conta: " + contf.getNumero());
		System.out.println("Titular: " + contf.getTitular());
		
		System.out.println("Saldo da conta: " + contf.getSaldo());
		System.out.println("----------------------------");
		
		System.out.println("Digite o valor do saque: ");
		double valorS = sc.nextDouble();
		
		contf.saque(valorS);
		
		System.out.println("-------------------------------------");
		System.out.println("	Saldo Final da Conta");
		System.out.println("-------------------------------------");
		System.out.println("O saldo final = " + contf.getSaldo());

		}
	}

}
