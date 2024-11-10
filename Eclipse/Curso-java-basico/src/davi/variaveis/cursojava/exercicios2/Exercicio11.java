package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/* As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
		   e lhe contraram para desenvolver o programa que calculará os reajustes. 
		   Faça um programa que recebe o salário de um colaborador e o reajuste segundo
		   o seguinte critério, baseado no salário atual: 
		    
		    salários até R$ 280,00 (incluindo): aumento de 20%
		    salários entre R$ 280,00 e R$ 700,00: aumento de 15%
			salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
			salários de R$ 1500.00 em diante aumento de 5% 
			
			Apόs ο aumento ser realizado, informe na tela: o salário antes do reajuste;
			percentual de aumento aplicado: o valor do aumento;
			o novo salário, após o aumento */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o seu salario ");
		
		double salario = scan.nextDouble();
		
		double percent20 = (salario * 20) /100;
		double percent15 = (salario * 15) /100;
		double percent10 = (salario * 10) /100;
		double percent05 = (salario * 05) /100;
		
		
		if(salario <= 280) {
			System.out.println("Salario antes do aumento: R$" + salario);
			System.out.println("O percentual de ajuste é 20%: ");
			System.out.println("O valor de aumento é: R$" + percent20);
			System.out.println( "Seu salario agora é: R$" + (salario + percent20));
			
		} else if (salario >= 281 && salario <=700 ) {
			System.out.println("Salario antes do aumento: R$" + salario);
			System.out.println("O percentual de ajuste é 15%: ");
			System.out.println("O valor de aumento é: R$" + percent15);
			System.out.println("Seu salario agora é: R$" + (salario + percent15));
			
		} else if (salario >=701 && salario <= 1500) {
			System.out.println("Salario antes do aumento: R$" + salario);
			System.out.println("O percentual de ajuste é 10%: ");
			System.out.println("O valor de aumento é: R$" + percent10);
			System.out.println("Seu salario agora é: R$" +(salario + percent10));
			
		} else if (salario >= 1501 ){
			System.out.println("Salario antes do aumento: R$" + salario);
			System.out.println("O percentual de ajuste é 05%: ");
			System.out.println("O valor de aumento é: R$" + percent05);
			System.out.println("Seu salario agora é: R$" +(salario + percent05));
		}

	}

}
