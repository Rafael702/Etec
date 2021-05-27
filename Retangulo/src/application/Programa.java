package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a Largura do Retangulo:");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Digite a Altura do Retangulo:");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("O valor da área é: " + retangulo.calcularArea());
		System.out.println();
		System.out.println("O valor do perímetro é: " + retangulo.calcularPerimetro());
		System.out.println();
		System.out.println("O valor da Diagonal é: " + retangulo.calcularDiagonal());
	}

}
