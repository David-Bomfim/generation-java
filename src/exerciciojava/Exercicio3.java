package exerciciojava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, adicional, hora, des; 
		
		System.out.println("Salario Bruto: ");
		Scanner salarioBruto = new Scanner(System.in);
	    salario = salarioBruto.nextFloat();
		
	    System.out.println("Adicional Noturno: ");
		Scanner adicionalNoturno = new Scanner(System.in);
	    adicional = adicionalNoturno.nextFloat();
	    
	    System.out.println("Horas Extras: ");
		Scanner horaExtra = new Scanner(System.in);
	    hora = horaExtra.nextFloat();
	    
	    System.out.println("Descontos: ");
		Scanner descontos = new Scanner(System.in);
	    des = descontos.nextFloat();
	    
	    float liquido = salario+adicional+ (hora *5) - des;  
	    
	    System.out.println("Salário Líquido = " + liquido);
	    
	    
		
		

	}

}
