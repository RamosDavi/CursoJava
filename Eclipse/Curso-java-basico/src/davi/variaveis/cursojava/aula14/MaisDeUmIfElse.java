package davi.variaveis.cursojava.aula14;

import java.util.Scanner;

public class MaisDeUmIfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do produto: ");
		double valor = scan.nextDouble();
		
			if(valor <= 10) {
				System.out.println("Compre o produto esta no melhor preço!!! ");
			} else if(valor > 10 && valor < 15 ){
					System.out.println("Peça desconto. ");
			} else if(valor > 15 && valor < 17) {
				System.out.println("Pesquisar mais. ");
			} else {
				System.out.println("Valor muito acima do valor de mercado");
			}
	}

}