
package tratamento2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Digite o valor 1: ");
		int v1= sc.nextInt();
		
		System.out.println("Digite o valor 2: ");
		int v2 = sc.nextInt();
		
		int resultado = v1+v2;
		
		System.out.println("");
		System.out.println("A soma = " + resultado);
	}
	catch(InputMismatchException e) {
		System.out.println("ERRO !! Digite um valor inteiro");
	}
	finally{
		System.out.println("Bloco executado. Independente do try-catch");
	}
		
	/*	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println();
	}
	*/
		
		

	}

}
