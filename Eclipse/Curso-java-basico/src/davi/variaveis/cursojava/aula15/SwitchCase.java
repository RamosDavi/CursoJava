package davi.variaveis.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Entre com um dia da semana (1 - 7): ");
		
		int diaSemana = scan.nextInt();
				
		/*if (diaSemana == 1) {
			
		} else if (diaSemana == 2) {
			System.out.println("Segunda-Feira");
		} else if (diaSemana == 3) {
			System.out.println("Terça-Feira");
		} else if (diaSemana == 4) {
			System.out.println("Quarta-Feira");
		} else if (diaSemana == 5) {
			System.out.println("Quinta-Feira");
		} else if (diaSemana == 6) {
			System.out.println("Sexta-Feira");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Não é um dia da semana");
		}*/

		switch(diaSemana){
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda-Feira"); break;
			case 3: System.out.println("Terça-Feira"); break;
			case 4: System.out.println("Quarta-Feira"); break;
			case 5: System.out.println("Quinta-Feira"); break;
			case 6: System.out.println("Sexta-Feira"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Não é um dia da semana valido");
		}
				
	}

}
