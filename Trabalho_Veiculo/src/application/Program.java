package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da marca: ");
		String marca = sc.next();
		System.out.println("Digite o modelo do veiculo: ");
		String modelo = sc.next();
		System.out.println("Digite a cor do veiculo: ");
		String cor = sc.next();
		System.out.println("Digite o combustivel: ");
		String combustivel = sc.next();
		System.out.println("Digite o ano do veículo:");
		int ano = sc.nextInt();
		System.out.println("Digite o preço do veículo: ");
		double preco = sc.nextDouble();
		System.out.println("Digite a quantidade: ");
		int quantidade = sc.nextInt();
		
		Veiculo v = new Veiculo(marca,modelo,cor,combustivel,ano,preco,quantidade);
		System.out.println("----------------------------------------------");
		System.out.println("Marca = " + v.marca );
		System.out.println("Modelo = " + v.modelo);
		System.out.println("Cor = " + v.cor);
		System.out.println("Combustivel = " + v.combustivel);
		System.out.println("Ano = " + v.ano);
		System.out.println("Preço = "+ v.preco);
		System.out.println("Quantidade = " + v.quantidade);
		System.out.println("----------------------------------------------");
		
		System.out.println("Valor Total no Estoque = " + v.valorTotalEstoque());
		
		if(v.validarAno() == false) {
			System.out.println("Veiculo não pode ser vendido como NOVO");
		}else {
			System.out.println("Veiculo pode ser vendido como NOVO");
		}
		
		
		
			}

}