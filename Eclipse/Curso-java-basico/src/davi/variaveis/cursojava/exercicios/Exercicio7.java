package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Faça um programa que calcule a area de um quadrado
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a altura do quadrado: ");
		double altura = scan.nextDouble();
		System.out.println("Informe a largura do quadrado: ");
		double largura = scan.nextDouble();
		System.out.println("A area do quadrado é: " + altura *largura );
		System.out.println("o dodro dessa area é: " + ((altura*largura)*2));
		
	}

}
