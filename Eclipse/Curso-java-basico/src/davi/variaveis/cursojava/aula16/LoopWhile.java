package davi.variaveis.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
	
		int i = 1; // count, cont ou i essas nomenclaturas são as mais usadas em contadores.
		int max = 10;
		
		System.out.println("Contando até: " + max);
		
		
		while (i <= max) {
			System.out.println("O valor de i é: " + i);
			i++; // i = i +	1;
		}
		System.out.println("O valor final de i é: " + i);
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while(i < 15);
		
		System.out.println("Valor de i é: " + i );
	}

}
