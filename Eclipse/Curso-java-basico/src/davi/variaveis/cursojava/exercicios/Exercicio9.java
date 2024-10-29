package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Faça um programa que peça a temperatura em graus farenheit, transforme e mostre a temperatura em graus celsius.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva a temperatura em farenheit: ");
		double farenheit = scan.nextDouble();
		System.out.println("A temperatura em Celsius é: " + 5*(farenheit-32)/9);
		

	}

}
