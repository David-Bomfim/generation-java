package exercicio02;

import java.util.Scanner;

public class Exercicio5_Lista02 {

	public static void main(String[] args) {
		int opcaoMenu, qtditem = 0;
		float precoItem = 0, precoTot;
		String item = null;

		Scanner leia = new Scanner(System.in);
		System.out.println("Código do produto-------Produto-----------------Preço unitário\r\n"
				+ "    .1--------------Cachorro quente---------R$10,00\r\n"
				+ "    .2--------------X-salada----------------R$15,00\r\n"
				+ "    .3--------------X-bacon-----------------R$18,00\r\n"
				+ "    .4--------------Bauru-------------------R$12,00\r\n"
				+ "    .5--------------Refrigerante------------R$8,00\r\n"
				+ "    .6--------------Suco de laranja---------R$13,00");

		System.out.println("Escolha o item do menu");
		Scanner leiaItem = new Scanner(System.in);
		opcaoMenu = leiaItem.nextInt();

		switch (opcaoMenu) {
		case 1:
			item = "Cachorro Quente";
			precoItem = 10;
			break;
		case 2:
			item = "X-Salada";
			precoItem = 15;
			break;
		case 3:
			item = "X Bacon";
			precoItem = 18;
			break;
		case 4:
			item = "Bauru";
			precoItem = 12;
			break;
		case 5:
			item = "Refrigerante";
			precoItem = 8;
			break;
		case 6:
			item = "Suco de laranja";
			precoItem = 13;
			break;

		}

		System.out.println("Qual é a quantidade? ");
		qtditem = leiaItem.nextInt();
		precoTot = precoItem * qtditem;
		System.out.println("Total a pagar: " + precoTot);

	}

}
