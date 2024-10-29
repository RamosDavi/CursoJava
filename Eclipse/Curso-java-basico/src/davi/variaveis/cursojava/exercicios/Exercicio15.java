package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// Faça um programa que pergunte quanto você ganha por hora e o numero de horas trabalhadas no mês.
		// Calcule e mostre o total do seu salario no referio mês, sabendo que são descontados 11% para imposto de renda
		//8% para o inss e 5% para o sindicato, faça um programa que nos dê
		// Salario bruto
		//Quanto pagou ao inss
		// Quanto pagou ao sindicato
		// o Salario liquido
		// Calcule os descontos e o salario liquido, conforme a tabela abaixo

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		int ganho = scan.nextInt();
		
		System.out.println("Quantas horas você trabalhou? ");
		
		double trabalhada = scan.nextDouble();
		double salarioBruto = ganho *trabalhada;
		double inss = salarioBruto * 11 / 100;
		double sindicato = salarioBruto * 5 / 100;
		double ir = salarioBruto * 8 / 100;
		double salarioLiquido = salarioBruto - sindicato - inss - ir;
		double descontos = sindicato + inss + ir;
		
		
		System.out.println("Você vai receber no total: R$" + salarioBruto);
		System.out.println("Valor pago ao inss: R$" + inss);
		System.out.println("Valor pago ao sindicato: R$" + sindicato);
		System.out.println("Valor pago ao IR: " + ir);
		System.out.println("Seu salario liquido é: R$" + (salarioBruto - descontos));
		System.out.println("Seu salario bruto é: "+ salarioBruto + " menos o IR: " + (salarioBruto - ir) + " menos o inss: "
				+ (salarioBruto - inss - ir) + " menos sindicato: "+ (salarioBruto - ir - inss - sindicato)+ " Seu salario liquido: R$"
				+ (salarioLiquido));
		
		
		
		
	}

}
