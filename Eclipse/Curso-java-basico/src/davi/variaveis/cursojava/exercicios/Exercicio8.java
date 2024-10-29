package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		// Faça um programa que pergunte quanto você ganha por hora e numero de horas trabalhadas.
		//Calcule o mostreo total do seu salario no referido mês.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora? ");
		int ganho = scan.nextInt();
		System.out.println("Quantas horas você trabalhou? ");
		double trabalhada = scan.nextDouble();
		System.out.println("Você vai receber no total: R$" + ganho * trabalhada);
	
	}

}
