package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
		// ultilizando a seguinte formula.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("O seu peso ideal é " + (72.7* altura - 58)+ "Kg");
	
		
	}

}
