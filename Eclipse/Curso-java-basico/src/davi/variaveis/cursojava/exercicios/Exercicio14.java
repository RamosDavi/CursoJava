package davi.variaveis.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de peixes em Kg: ");
		double peso = scan.nextDouble();
		System.out.println("O peso de peixes é: " + peso + "Kg");
		double multa = (peso - 50)* 4;
		
		 if (peso >= 50.01) {
			 System.out.println("Seu produto esta acima do peso valor R$4,00 por Kg ultrapassado de multa sera aplicado!!!");
			 System.out.println("Você terá que pagar de multa " + "R$" + multa);
		 }else if(peso <=50){
			 System.out.println("Seu produto esta dentro do valores permitidos por lei! ");
			 System.out.println("Você não terá que pagar multa! ");
		 }	 
	}

}
