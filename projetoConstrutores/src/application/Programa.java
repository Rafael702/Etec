package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		//Produto prod = new Produto(); //não está reconhecendo o construtor produto;
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			System.out.println("Digite o preço:");
			double preco = sc.nextDouble();
			System.out.println("Digite a quantidade: ");
			int quantidade = sc.nextInt();
			 
		Produto prod = new Produto(nome, preco,quantidade);
		System.out.println(prod.nome);
		System.out.println(prod.preco);
		System.out.println(prod.quantidade);
		
	}

}
