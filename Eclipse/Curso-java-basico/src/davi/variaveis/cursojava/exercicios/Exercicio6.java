package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Faça um programa que peça o raio de um circulo, calcule e mostre sua area
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe o raio do circulo: ");
		double raio = scan.nextDouble();
		
		System.out.println("A area do circulo é: " + 3.14 * (raio * raio));

	}

}
