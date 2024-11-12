package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio11b {

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
		
		System.out.println("Digite seu salario: ");
		double salario = scan.nextDouble();
		double percentual = 0;
		
		if(salario <= 280) {
			percentual = 20;
		} else if (salario <= 700) {
			percentual = 15;
		} else if (salario <= 1500) {
			percentual = 10;
		} else if (salario >= 1501) {
			percentual = 05;
		}
		
		double aumento = (salario * percentual	)/100;
		double novoSalario = (salario + aumento);
		
		System.out.println("Seu salario antes do aumento: R$" + salario);
		System.out.println("O percentual de reajuste é: " + percentual + "%");
		System.out.println("O valor de reajuste é: R$" + aumento );
		System.out.println("Seu novo salario é: R$" + novoSalario);
		

	}

}
