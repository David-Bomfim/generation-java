package exercicios12122023;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01_Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		String cliente;
		int n1 = 0; 
		int opcao;
		
		System.out.println("*******************************************************************");
		
		System.out.println( "             1 - Adicionar Cliente na Fila ");
        System.out.println("             2 - Listar todos os Clientes  "); 
        System.out.println("             3 - Retirar Cliente da Fila  ");
        System.out.println("             0 - Sair ");
        
        System.out.println("*******************************************************************");
        
        
		while (n1 == 0) { 
			
			System.out.println(" Escolha uma das opcções ");
			opcao = leia.nextInt();
			leia.nextLine();
			switch (opcao) {
			case 1:
				
				System.out.println("Adicione um cliente novo nesta fila: ");
				cliente = leia.nextLine();
				fila.add(cliente);
				
				break;

			case 2:
				System.out.println(fila);
				
				break;
				
			case 3:
				
				if(fila.isEmpty()==false) {
					System.out.println("O Cliente: " + fila.poll() + " foi retirado da fila");}
				else{System.out.println("A fila está vazia");
				
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
