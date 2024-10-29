package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// Faça um programa que peça a temperatura em graus celsiun, transforme em graus farenheit
		
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Informe a temperatura em celsius: ");
	double celsius = scan.nextDouble();
	
	//double farenheit = (celsius * 1.8) + 32;
	
	System.out.println("A temperatura em graus farenheit é: " + (celsius * 1.8 + 32 ) + "F");
	

        
       // Scanner scan = new Scanner(System.in);
        
        //System.out.println("Entre com a temperatura em Celsius:");
        //double c = scan.nextDouble();
        
        //double f = (c * 1.8) + 32;
        
        //System.out.println("A temperatura " + c + " C é igual a " + f + " F");	

	}

}
