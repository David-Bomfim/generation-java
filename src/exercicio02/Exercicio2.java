package exercicio02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = leia.nextInt();
		
		leia.close();

if (numero % 2 == 0) {
	System.out.println("O número " + numero + " é par ");
}else{ 
	System.out.println("O número " + numero + "é impar ");
}

if (numero >= 0) {
		
System.out.println(" e positivo ");		
} else {
	
	System.out.println(" e negativo ");
}

	}

}
