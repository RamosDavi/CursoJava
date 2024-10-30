package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faça um programa que peça um e mostre se ele é positivo ou negativo
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Informe um numero positivo ou negativo: ");
		int valor = scan.nextInt();
				
		if (valor >= 1) {
			System.out.println("Esse valor é positivo");
		} else { 
			System.out.println("Esse valor é negativo");
		}

	}

}
