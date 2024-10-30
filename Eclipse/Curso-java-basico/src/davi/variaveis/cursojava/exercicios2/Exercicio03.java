package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/* Faça um programa que verifique se uma letra é "F" ou "M".
		Conforme a letra que escrever: F - feminino, M - Masculino, Sexo Invalido.*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a letra M ou F: ");
		String input = scan.next();
				
		if (input.equalsIgnoreCase("f")){
			System.out.println("F - Feminino! ");
		}	else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino! ");
		}	else {
			System.out.println("Sexo Inválido! ");
		}
		
	}

}
