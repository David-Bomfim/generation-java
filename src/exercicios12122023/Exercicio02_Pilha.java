package exercicios12122023;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02_Pilha{

	public static void main(String[] args) {

		Stack<String> fila = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		String cliente;
		int n1 = 0; 
		int opcao;
		
		System.out.println("*******************************************************************");
		
		System.out.println( "             1 - Adicionar Livro na Pilha ");
        System.out.println("             2 - Listar todos os livros  "); 
        System.out.println("             3 - Retirar Livro da pilha  ");
        System.out.println("             0 - Sair ");
        
        System.out.println("*******************************************************************");
        
        
		while (n1 == 0) { 
			
			System.out.println(" Escolha uma das opcções ");
			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 1:
				
				System.out.println("Adicione um livro novo nesta pilha: ");
				cliente = leia.nextLine();
				fila.add(cliente);
				
				break;

			case 2:
				System.out.println(fila);
				
				break;
				
			case 3:
				
				if(fila.isEmpty()==false) {
					System.out.println("O Livro: " + fila.pop() + " foi retirado da pilha");}
				else{System.out.println("A Pilha está vazia");
				
				}
				
				
				
				
				
				
				break;
				
			case 0:
				
				System.out.println("O Programa foi encerrado");
				n1++;
				
				break;
				
				
			default:
				break;
			}
		
		
     
        
        
		}
        
        
        
	}

}
