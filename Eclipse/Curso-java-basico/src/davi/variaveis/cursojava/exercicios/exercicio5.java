package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// Faça um programa que converta metros para centimetros
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma distancia em metros: ");
		double distancia = scan.nextDouble();
		System.out.println("A distancia digitada em centimetros é: " + distancia*100 + " centimetros");
		
		}
	}