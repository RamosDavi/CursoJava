package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Faça um programa leia tres numeros e os mostre em orden decrescente
		
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o prmeiro numero: ");
		int valor = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int valor2 = scan.nextInt();

		
		
		 if (valor <= valor1 && valor <= valor2 && valor1 <= valor2){
	            //valor é menor
	            //valor1 é maior
	            //valor < valor1 < valor2
	            System.out.println(valor2 + " - " + valor1 + " - " + valor);
	            
		 }else if(valor1 <= valor && valor1 <= valor2 && valor2 <= valor);{
		 		//valor1 menor
		 		//valor2 maior
		 		//valor1 < valor < valor2
			 System.out.println(valor + " - " + valor2 + " - " + valor1);
		 }
	            
	            
		
	}
}
