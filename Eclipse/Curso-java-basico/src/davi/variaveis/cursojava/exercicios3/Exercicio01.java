package davi.variaveis.cursojava.exercicios3;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		int nota = scan.nextInt();
		System.out.println("Digite um numero entre 0 e 10: ");
		
		while(nota >= 0 && nota <=10 ) {
			System.out.println("A nota é: " + nota);
		}
		System.out.println("Nota invalida!!! ");

	}

}
