package davi.variaveis.cursojava.exercicios3;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int pop1 = 80000;
		int pop2 = 200000;
		int cont = 0;
		
		
		while(pop1 < pop2){
			
			pop1 +=(pop1/100)*3;
			pop2 +=(pop2/100)*1.5;
			cont++;						
		}
		
		System.out.println("População A: " + pop1 + " Pessoas. ");
		System.out.println("População B: " + pop2 + " Pessoas. ");
		System.out.println("Quanbtidade de anos necessários: " + cont + " Anos. ");

	}

}
