package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Faça um programa que peça dois numeros
		e imprima o maior deles*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int valor = scan.nextInt();
		
		System.out.println("Digite outro numero");
		int valor1 = scan.nextInt();
		
		System.out.println("Os valores inseridos são: " + valor + " e " + valor1);
		
		if (valor > valor1) {
			System.out.println("O maior deles é: " + valor );
			} else {
			System.out.println("O Maior deles é: " + valor1);}
		
	}

}
