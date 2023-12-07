package exerciciojava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	float salario; 
	System.out.println("\nDigite o valor correspondente ao seu salario\n");
	Scanner valor = new Scanner(System.in);
	salario = valor.nextFloat(); 
	System.out.println("O Seu Salário é: " + salario);
	
	float abono; 
	System.out.println("\nDigite o valor correspondente ao seu abono \n");
	Scanner soma = new Scanner(System.in);
	abono = soma.nextFloat();
	System.out.println("O Seu abono é: " + abono);
	
	float total = salario + abono; 
	System.out.println("\nO Seu novo salário é: " + total);
	
	
	
		
		
		
		
		
	}

}
