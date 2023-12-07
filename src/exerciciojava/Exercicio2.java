package exerciciojava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, n4; 
		
		System.out.println("Nota 1: ");
		Scanner nota1 = new Scanner(System.in);
		n1 = nota1.nextFloat();
		
		System.out.println("Nota 2: ");
		Scanner nota2 = new Scanner(System.in);
		n2 = nota2.nextFloat();
		
		System.out.println("Nota 3: ");
		Scanner nota3 = new Scanner(System.in);
		n3 = nota3.nextFloat();
		
		System.out.println("Nota 4: ");
		Scanner nota4 = new Scanner(System.in);
		n4 = nota4.nextFloat();
		
		float media = (n1 + n2 + n3 + n4) / 4; 
		
		System.out.println("Sua média final é " + media);
	
		

	}

}
