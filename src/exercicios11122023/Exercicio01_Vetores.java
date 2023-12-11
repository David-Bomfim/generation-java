package exercicios11122023;

import java.util.Scanner;

public class Exercicio01_Vetores {

	public static void main(String[] args) {		 
		
		Scanner leia = new Scanner(System.in);
		
		
		int posicao = -0;
		int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	    System.out.print("Digite um número: ");
	    int n = leia.nextInt(); 
	  
	   

	  
	    for (int i = 0; i < vetor.length; i++) {
	     
	      if (vetor[i] == n) {
	        posicao = i;
	        break;
	      }
	    }

	    
	    if (posicao != -1) {
	      System.out.println("O número " + n + " foi encontrado na posição " + posicao);
	    } else {
	      System.out.println("Não foi encontrado!");
	    }
	  }
	}
