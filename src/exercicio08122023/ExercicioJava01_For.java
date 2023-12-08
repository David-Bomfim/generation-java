package exercicio08122023;

import java.util.Scanner;

public class ExercicioJava01_For {

	public static void main(String[] args) {
		/*
		 * 
		 * Laço de repetição:FOR Entrada e Saída de dados Laços Condicionais Laço de
		 * Repetição FOR
		 * 
		 * 
		 * 
		 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
		 * primeiro número deve ser menor do que o segundo número. Caso contrário, deve
		 * ser exibida uma mensagem na tela informando que o intervalo é inválido e sair
		 * do programa.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
 
		int numero1, numero2; 
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
;		numero2 = leia.nextInt();
		
		if(numero1>=numero2) {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo");
			  
			
			}else 
			
		System.out.println("Números multiplos de " + numero1 + " a " + numero2 + ": ");
	   
		for(int i = numero1; i <= numero2; i++) {
		if( i % 3 == 0&& i % 5 == 0) {
			System.out.println("Números multiplos de " + numero1 + " a " + numero2 + ": "+ i);
			
		
		}
			
		}
	  
	}
	}


