package exercicio08122023;

import java.util.Scanner;

public class ExercicioJava03_While {

	public static void main(String[] args) {
		/*
		 * 
		 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		 * inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		 * menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		 * leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o
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
		 * 
		 */
		Scanner leia = new Scanner(System.in);

		int idade = 0;
		int total21 = 0;
		int total50 = 0;

		
		
		
			while (idade >= 0) {
				System.out.println("Digite a idade (ou uma idade negativa para encerrar): ");
				idade = leia.nextInt();
			if (idade >=0 && idade <21) {
			 
					total21++;
				}if (idade > 50) {
					total50++;
			
	}
}
System.out.println("Total de pessoas com menos de 21 anos: " + total21);
System.out.println("Total de pessoas com mais de 50 anos: " + total50);
}
}