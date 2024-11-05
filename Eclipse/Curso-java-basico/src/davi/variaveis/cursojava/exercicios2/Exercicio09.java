package davi.variaveis.cursojava.exercicios2;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// Faça um programa leia tres numeros e os mostre em orden decrescente
		
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o prmeiro numero: ");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int valor2 = scan.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int valor3 = scan.nextInt();

		
		
		 if (valor1 <= valor2 && valor1 <= valor3 && valor2 <= valor3){
	            //valor1 é menor
	            //valor3 é maior
	            //valor1 < valor2 < valor3
	            System.out.println(valor3 + " - " + valor2 + " - " + valor1); 
	            
		 } else if (valor1 <= valor2 && valor1 <= valor3 && valor3 <= valor2) {
			 //valor1 é menor
			 //valor2 é maior
			 //valor1 < valor3 > valor2
			 System.out.println(valor2 + " - " + valor3 + " - " + valor1 );
			 
		 } else if (valor2 <= valor1 && valor2 <= valor3 && valor1 <=valor3) {
			 //valor2 menor
			 //valor3 maior
			 //valor2 < valor1 <valor3
			 System.out.println(valor3 + " - " + valor1 + " - " + valor2);
		 }
	            
	}
}
