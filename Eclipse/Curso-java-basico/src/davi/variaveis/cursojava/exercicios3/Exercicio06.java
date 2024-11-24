package davi.variaveis.cursojava.exercicios3;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Faça um programa que imprima na tela os numeros do 1 ao 20, um abaixo do outro.
		depois modifique o programa para que ele mostre os numeros um ao lado do outro*/

		int num = 0;
		int cont = 1;
		boolean valido = false;
		
		do {
			
			if(num <= 19)
				System.out.print((num = cont++) + " - " );
			valido = false;
		}while(!valido);
		
	}

}
