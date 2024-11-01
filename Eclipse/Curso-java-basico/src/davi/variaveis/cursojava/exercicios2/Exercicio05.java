package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/* Faça um programa para leitura de duas notas parciais de um aluno.
		O programa deve calcular a media alcançada por aluno e apresentar
		a mensagem aprovado se a media alcançada foi maior ou igual a sete
		A mesangem  reprovado se a media for menor que sete;
		a mensagem  aprovado com distinção se a media for igual a dez:*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = scan.nextDouble();
		
		System.out.println("Digite outra nota");
		double nota1 = scan.nextDouble();
		
		double media = (nota + nota1) /2;	
		
		
		System.out.println(media);
		

	}
}