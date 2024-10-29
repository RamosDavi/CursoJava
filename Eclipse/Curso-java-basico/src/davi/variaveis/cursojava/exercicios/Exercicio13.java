package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// Tendo como dados de entrada a altura e o sexo uma pessoa, construa um algoritmo que calcule o peso ideal
		//ultilizando as seguintes formulas
		//para homens (72.7*h)-58
		//Para mulheres: ( (32.1*h) -44.7(h= altura)
		// Peça o peso da pessoa e informe se esta dentro, acima ou abaixo do peso

		Scanner scan = new Scanner(System.in);
		
		 // Entrada de dados
        System.out.print("Digite sua altura em metros: ");
        double altura = scan.nextDouble();

        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        char sexo = scan.next().charAt(0);

        System.out.print("Digite seu peso atual em kg: ");
        double peso = scan.nextDouble();

        // Cálculo do peso ideal
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            scan.close();
            return;
        }

        // Verifica o estado do peso
        if (peso < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (peso > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal.");
        }

        // Exibe o peso ideal calculado
        System.out.printf("Seu peso ideal é: %.2f kg\n", pesoIdeal);

        scan.close();
		
		
	}

}
