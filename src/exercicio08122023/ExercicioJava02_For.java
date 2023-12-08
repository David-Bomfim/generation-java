package exercicio08122023;

import java.util.Scanner;

public class ExercicioJava02_For {

	public static void main(String[] args) {

		/*
		 * 
		 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
		 * mostre na tela quantos números são pares e quantos número são ímpares. Veja o
		 * exemplo abaixo:
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner leia = new Scanner (System.in);
		int n, par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + " número");
			n = leia.nextInt();
			
			if (n % 2 == 0) {
				par++;
				
			}
			if (n % 2 == 1) {
				impar++;
				
			}
			
		}
		System.out.println("São " + par + " Números pares" );
		System.out.println("São " + impar + " Números impares");
	}

}
