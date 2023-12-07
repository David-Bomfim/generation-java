package exercicio02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int A, B, C; 
		Scanner leianumero = new Scanner(System.in); 
		System.out.println("Digite o número A: " );
		A = leianumero.nextInt(); 
		
		System.out.println("Digite o número B: ");
	    B = leianumero.nextInt(); 
	    
	    System.out.println("Digite o número C: ");
	    C = leianumero.nextInt(); 
	    
	    if (A + B == C) {
	    System.out.println("A Soma de A + B é Igual a C"
	    		+ "");	
	    }
	    
	    if (A + B < C ) {
	    System.out.println("A Soma de A + B é menor que C");
		
	    }
		
	    if (A + B > C) {
	    	
	    	System.out.println("A Soma de A+B é Maior que C");
	    }

	}

}
