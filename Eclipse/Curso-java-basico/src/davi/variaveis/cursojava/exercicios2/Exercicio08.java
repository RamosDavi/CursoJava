package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/* Faça um programa que pergunte o preço de três produtos e informe qual
		produto você de comprar, sabendo que a decisção é sempre pelo mais barato */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço dos 3 produtos");
		
		double valor = scan.nextDouble();
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		
		if(valor <= valor1 && valor <= valor2 ) {
			System.out.println("Esse é o produto mais barato: "+ valor);			
		} else if(valor1 <= valor && valor1 <= valor2) {
			System.out.println("Esse é o produto mais barato: "+ valor1);
		} else if(valor2 <= valor && valor2 <= valor1) {
			System.out.println("Esse é o produto mais barato: "+ valor2);
		}
	}

}
