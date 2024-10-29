package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// Faça um programa que peça 2 numeros inteiros e um numero real calcule e mostre:
		//o produto do dobro do primeiro com metade do segundo
		//a soma do triplo do primeiro com o terceiro
		//o terceiro elevado ao cubo
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero natural:");
		int valor1 = scan.nextInt();
		System.out.println("Informe outro numero natural:");
		int valor2 = scan.nextInt();
		System.out.println("Informe um numero com virgula:");
		double valor3 = scan.nextDouble();
		
		System.out.println("O resultado do dobro do primeiro valor com metade do segundo é: " + ((valor1 *2)+(valor2 /2)));
		System.out.println("O soma do triplo do primeiro valor com o terceiro valor é: " + ((valor1 *3)+(valor3)));
		System.out.println("O terceiro valor elevado ao cubo "+ (valor3*valor3*valor3));
		
		
		
	}

}
