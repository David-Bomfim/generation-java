package exerciciojava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float n1, n2, n3, n4;
		
		System.out.println("numero1: ");
		Scanner numero1 = new Scanner(System.in);
	    n1= numero1.nextFloat();
	    
		System.out.println("numero2: ");
		Scanner numero2 = new Scanner(System.in);
	    n2= numero2.nextFloat();
	    
		System.out.println("numero3: ");
		Scanner numero3 = new Scanner(System.in);
	    n3= numero3.nextFloat();
	    
		System.out.println("numero4: ");
		Scanner numero4 = new Scanner(System.in);
	    n4= numero4.nextFloat();
	    
	    
	    float diferenca = (n1 * n2) - (n3 * n4); 
	    
	    System.out.println("A Diferença é igual a: " + diferenca );
	    
	    
	    
	    
	    
	    
		

	}

}
