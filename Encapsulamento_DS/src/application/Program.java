package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Produto produto = new Produto();
						
//		produto.setNome("Camisa");
//		produto.setPreco(90.00);
//		produto.setQuantidade(20);
//		
		System.out.println("Digite o nome do produto: ");
		produto.setNome(sc.nextLine());
		System.out.println("Digite o preço do produto: ");
		produto.setPreco(sc.nextDouble());
		System.out.println("Digite a quantidade: ");
		produto.setQuantidade(sc.nextInt());
		
		System.out.println("produto = " + produto.getNome());
		System.out.println("preço = " + produto.getPreco());
		System.out.println("Quantidade = " + produto.getQuantidade());
		
		double totalProdutos=produto.getPreco()*produto.getQuantidade();
		
		System.out.println("------------------------");
		System.out.println("Total em estoque = " + totalProdutos);
		
		
		
		/*Se fosse Public
		 * produto.nome="Amanda";
		
		System.out.println("Nome = " + produto.nome);
		System.out.println("Preço = " + produto.preco);*/
	}

}
