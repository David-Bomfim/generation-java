package exercicio08122023;

import java.util.Scanner;

public class ExercicioJava06_DoWhile {

	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * Escreva um algoritmo em Java, que leia números inteiros via teclado, até que
		 * o número zero seja digitado. Ao final, mostre na tela a média de todos os
		 * números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner leia = new Scanner(System.in);
		int numero;
		int soma = 0;
		int contador = 0;

		System.out.println("Digite números inteiros (digite 0 para encerrar): ");

		do {
			numero = leia.nextInt();

			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				contador++;
			}

		} while (numero != 0);

		if (contador > 0) {
			double media = (double) soma / contador;
			System.out.println("Média dos múltiplos de 3: " + media);
		} else {
			System.out.println("Nenhum múltiplo de 3 foi digitado.");
		}
	}

}      

