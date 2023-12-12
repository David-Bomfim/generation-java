package exercicios12122023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01_CollectionList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cor;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma nova cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("As cores digitadas foram: " + cores);
		Collections.sort(cores);

		System.out.println("A Respecitva ordem das cores é: " + cores);
		
		

	}

}
