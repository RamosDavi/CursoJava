package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/* Faça um programa que leia 3 numeros e mostre o maior e o menor
		 deles*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três numeros: ");
		
		double numero = scan.nextDouble();
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		
		if(numero > numero1 && numero > numero2 ) {
			System.out.println("Esse é o maior numero: "+ numero);			
		} else if(numero1 > numero && numero1 > numero2) {
			System.out.println("Esse é o maior numero: "+ numero1);
		} else if(numero2> numero && numero2 > numero1) {
			System.out.println("Esse é o maior numero: "+ numero2);
		}
		if(numero < numero1 && numero < numero2 ) {
			System.out.println("Esse é o menor numero: "+ numero);			
		} else if(numero1 < numero && numero1 < numero2) {
			System.out.println("Esse é o menor numero: "+ numero1);
		} else if(numero2 < numero && numero2 < numero1) {
			System.out.println("Esse é o menor numero: "+ numero2);
		}

	}

}

