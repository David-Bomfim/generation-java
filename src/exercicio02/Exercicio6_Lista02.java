package exercicio02;

import java.util.Scanner;

public class Exercicio6_Lista02 {
	
	//1
	//Gerente
	//2
	//Vendedor
	//3
	//Supervisor
	//4
	//Motorista
	//5
	//Estoquista
	//6
	//Técnico de TI



	public static void main(String[] args) {
		String nome;
		int cod;
		float salarium;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nNome do Colaborador: ");
		nome = leia.next();

		System.out.println("\nCódigo do seu cargo: ");
		cod = leia.nextInt();

		System.out.println("\nSalário: ");
		salarium = leia.nextFloat();

switch (cod) {
case 1: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Gerente " + "\nSalário: R$" + salarium * 1.1);
break;
case 2: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Vendedor " + "\nSalário: R$" + salarium * 1.07);
break;
case 3: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Supervisor " + "\nSalário: R$" + salarium * 1.09);
break;
case 4: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Motorista " + "\nSalário: R$" + salarium * 1.06);
break;
case 5: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Estoquista " + "\nSalário: R$" + salarium * 1.05);
break;
case 6: System.out.println("\nNome do colaborador: " + nome + "\nCargo: Técnico de TI " + "\nSalário: R$" + salarium * 1.08);
break;
}
		
		
	}

}
