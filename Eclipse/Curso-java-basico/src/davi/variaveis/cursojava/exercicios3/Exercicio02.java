package davi.variaveis.cursojava.exercicios3;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Faça um programa que leia um nome de usuario e a senha e não aceite
		 * a senha igual ao nome de usuario, mostrando uma mensagem de erro e voltando 
		 * a pedir as informações.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome;
		String senha;
		
		do {
		
		System.out.println("Digite seu nome de usuario: ");
		nome = scan.next();
		
		System.out.println("Digite sua senha: ");
		senha = scan.next();
		
		if(nome.equalsIgnoreCase(senha)) {
			infoValida = false;
			System.out.println(" Senha igual ao usuario, digite novamente. ");			
		} else {
			infoValida = true;
			System.out.println(" Senha e usuarios validos. ");
		}
		
		}while(!infoValida);

	}

}
