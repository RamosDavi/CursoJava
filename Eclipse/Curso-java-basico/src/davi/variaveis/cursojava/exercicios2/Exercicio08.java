package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// Faça um programa que verifique se uma é letra é vogal ou consoante
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra para verificação");
		String letra = scan.next();
		
		/*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") 
				|| letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal ");
		} else {System.out.println("Consoante ");
		}*/
		
		switch(letra){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.print("Vogal"); break;
			default: System.out.print("Consoante");

		}

	}

}
