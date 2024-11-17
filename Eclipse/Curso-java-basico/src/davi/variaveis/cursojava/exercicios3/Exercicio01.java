package davi.variaveis.cursojava.exercicios3;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/* Faça um programa que peça uma nota entre 0 e 10. Mostre uma mensagem caso o valor
		 seja invalido e continue pedindo até que o usuario informe um valor valido */
				
		Scanner scan = new Scanner(System.in);		
		
 		boolean notaValida = false;
		
		
		do {
			
			System.out.println("Entre com uma nota: ");
			
			double nota = scan.nextDouble();
			
			if(nota >= 0 && nota <= 10){
				notaValida = true;
				System.out.println("Valor aceito: " + nota);
	
			} else {
				System.out.println("Valor digitado é invalido, digite novamente. ");			}
		
		
		} while (!notaValida);	 
	}	
}