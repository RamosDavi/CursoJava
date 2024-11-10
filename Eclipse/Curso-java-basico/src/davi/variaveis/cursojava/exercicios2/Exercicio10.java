package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/* Faça um programa que pergunte em qual periodo você estuda
		e peça M-matutino V-vespertino N- noturno. Com base na resposta
		de uma saudação (bom dia, boa tarde, boa noite).*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o periodo que você estuda digite M(Matutino) V(Verspertino) ou N(Noturno). ");
		String letra = scan.next().toUpperCase();
		
		switch(letra){
			case "M": System.out.println("Bom dia!!! "); break;
			case "V": System.out.println("Boa tarde!!! ");break;
			case "N": System.out.println("Boa noite !!! "); break;
			default: System.out.println("Valor digitado invalido ");		
		}

	}

}
