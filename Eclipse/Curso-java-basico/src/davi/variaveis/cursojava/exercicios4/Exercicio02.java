package davi.variaveis.cursojava.exercicios4;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
			/* Contruir um Vetor A  com 8 elementos inteiros. Construir um vetor B
			 * de mesmo tipo e tamanho  com os elementos do Vetor A  multiplicados 
			 * por 2  ou seja VetorB [] = VetorA[] *2.*/
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		
	for (int i=0; i<vetorA.length; i++) {
		
		System.out.println("Entre com o valor desejado: " + i);
		vetorA[i] = scan.nextInt();
		
		vetorB[i] = vetorA[i] * 2;	
	}
		System.out.println("O Valor digitado no Vetor A é: ");
		for (int i=0; i < vetorA.length;i++) {
			System.out.print(vetorA[i] + " - ");
		}
		
		System.out.println("\n");
		
		System.out.println("O valor recebido do vetor A armazenado no vetor B é: ");
		for (int i=0; i < vetorB.length ;i++) {
			System.out.print(vetorB[i] + " - ");
		}
		
		
		
	}

}
