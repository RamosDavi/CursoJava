package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// Faça um programa que peça quatro notas e bimestrais e mostre a media
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a primeira nota: " );
		double nota1 = scan.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("Informe a terceira nota: " );
		double nota3 = scan.nextDouble();
		System.out.println("Informe a quarta nota: " );
		double nota4 = scan.nextDouble();
		
		System.out.println("A media das notas é: " + (nota1 + nota2 + nota3 + nota4) /4);
		
	}

}