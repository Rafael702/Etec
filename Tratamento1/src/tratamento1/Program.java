package tratamento1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		try {
	
		System.out.println("Digite os estados:  	");
		System.out.println("--------------------------------");
		String [] vetEstados = sc.nextLine().split(" ");
		
		System.out.println("");
		System.out.println("Digite a posição para a pesquisa: ");
		int posicao = sc.nextInt();
		System.out.println("O valor = " +  vetEstados[posicao]);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERRO !! Digite uma posição válida !");
		}
		catch(InputMismatchException e) {
			System.out.println("ERRO !! Digite um valor númerico do tipo inteiro");
		}
		System.out.println("");
		System.out.println("Fim do programa");
	
		sc.close();
	}

}
