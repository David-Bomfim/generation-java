package exercicios12122023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03_CollectionsSet {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<Integer>();

		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um valor inteiro: ");

			int valor = leia.nextInt();
			setNumeros.add(valor);
		}

		Iterator<Integer> iterator = setNumeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
