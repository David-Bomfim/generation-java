package exercicios11122023;

import java.util.Scanner;

public class Exercicio3_Matrizes {

	public static void main(String[] args) {
		 int[][] matriz = new int[3][3];

		 
		   int somaPrincipal = 0;
		    int somaSecundaria = 0;

		
		    Scanner scanner = new Scanner(System.in);
		    for (int i = 0; i < matriz.length; i++) {
		      for (int j = 0; j < matriz[i].length; j++) {
		        System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
		        matriz[i][j] = scanner.nextInt();
		      }
		    }

		  
		    for (int i = 0; i < matriz.length; i++) {
		      somaPrincipal += matriz[i][i];
		    }

	
		    for (int i = 0; i < matriz.length; i++) {
		      somaSecundaria += matriz[i][2 - i];
		    }

	
		    System.out.println("Diagonal Principal: ");
		    for (int i = 0; i < matriz.length; i++) {
		      System.out.print(matriz[i][i] + " ");
		    }

		  
		    System.out.println("\nDiagonal Secundária: ");
		    for (int i = 0; i < matriz.length; i++) {
		      System.out.print(matriz[i][2 - i] + " ");
		    }

		   
		    System.out.println("\nSoma da Diagonal Principal: " + somaPrincipal);

		    
		    System.out.println("Soma da Diagonal Secundária: " + somaSecundaria);
		  }


	}


