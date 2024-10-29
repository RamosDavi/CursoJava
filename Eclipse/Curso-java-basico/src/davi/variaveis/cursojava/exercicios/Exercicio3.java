package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
			// Faça um programa que peça dois numeros e imprima a soma
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite mais um numero: ");
		int valor2 = scan.nextInt();
		
		System.out.println("A soma dos numero informados é : " + (valor1 + valor2));	
		
	}

}
