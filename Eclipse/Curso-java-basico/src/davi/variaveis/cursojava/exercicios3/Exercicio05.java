package davi.variaveis.cursojava.exercicios3;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double pop1;
		double pop2;
		double taxa1;
		double taxa2;
		
		
		boolean valido = false;
		
		do {
			
			System.out.println(" Digite a população de A: ");
			pop1 = scan.nextDouble();
			
			if(pop1 > 0) {
				valido = true;
			}else {
				System.out.println("Entre com a população maior que 0. ");
			}
		}while(!valido);
		
		valido = false;
		
		do {
			
			System.out.println(" Entre com a população de B: ");
			pop2 = scan.nextDouble();
			
			if(pop2 > 0) {
				valido = true;
			}else {
				System.out.println(" População B precisa ser maior que 0. ");
			}
		} while(!valido);
		
		
		valido = false;
		
		do {
			
			System.out.println(" Entre com a taxa de crescimento da pop A: ");
			taxa1 = scan.nextDouble();
			
			
			if(taxa1 > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento A precisa ser maior que 0. ");
			}
			
		}while(!valido);
		
		valido = false;
		
		do {
			
			System.out.println(" Entre com a taxa de crescimento da pop B: ");
			taxa2 = scan.nextDouble();
			
			if (taxa2 > 0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento de B precisa ser maior que 0. ");
			}
		} while(!valido);
		
		int cont = 0;
		
		while (pop1 < pop2) {
			pop1 += (pop1/100)* taxa1;
			pop2 += (pop2/100)* taxa2;
			cont++;
		}
		
		System.out.println("População A: " + pop1);
		System.out.println("População B: " + pop2);
		System.out.println("Quantidade de anos: " + cont  + " Anos");	
	}

}
