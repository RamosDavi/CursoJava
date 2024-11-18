package davi.variaveis.cursojava.exercicios3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/* Faça um programa que leia e valide as seguintes informações
		  a. Nome: maior que 3 caracteres 
		  b. idade: Entre 0 e 150
		  c. Salario: maior que zero
		  d. sexo: f ou m
		  e. Estado Civil: s, c, v, d
		 */
		
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		boolean infoValida = false;
		
		do {
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		
		if(nome.length() > 3) {
			infoValida = nome.length() > 3 ;
		}else {
			System.out.print("Nome precisar ser maior ou igual a 4: ");
		}
		
		}while (!infoValida);
		
		do {		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		infoValida = idade > 0 && idade < 150;
		
		if(!infoValida) {
			System.out.println("Idade precisa ser entre 0 e 150 anos");
		} 
			
		}while(!infoValida);
		
		do {		
		System.out.println("Digite seu salario: ");
		salario = scan.nextDouble();
		infoValida = salario > 0;
		
		if(!infoValida) {
			System.out.println("Seu salario deve ser maior que 0: ");
		}
		
		}while (!infoValida);
		
		do {
		System.out.println("Digite seu sexo ");
		sexo = scan.next();
		infoValida = sexo.equalsIgnoreCase("f") ||
				sexo.equalsIgnoreCase("m");
		if(!infoValida) {
			System.out.println("Sexo precisa ser 'f' ou 'm' ");
		}
		
		}while (!infoValida);
		
		do {
			
		System.out.println("Digite seu estado civil: ");
		estadoCivil = scan.next();
		infoValida = estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
				|| estadoCivil.equalsIgnoreCase("d")|| estadoCivil.equalsIgnoreCase("v");
		
		if(!infoValida) {
			System.out.println("Você precisa digitar uma das letras a seguir sendo s(Solteiro), "
					+ " c para (casado), d(Divorciado) e v (Viuvo)");
		}
		
		}while(!infoValida);
		 
		System.out.println("Nome: "+ nome + "\nIdade: " + idade + " Anos"+ "\nSalario: " + "R$" + salario + "\nGenero: " + sexo + "\nEsta Civil: " + estadoCivil );		
	}

}
