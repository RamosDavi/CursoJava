package davi.variaveis.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome, idade, quantidade de filhos, altura e se tem bichos de estimação");
		
			String primeiroNome = scan.next();
			int idade = scan.nextInt();
			byte quantidadeFilhos = scan.nextByte();
			float altura = scan.nextFloat();
			boolean temPet = scan.nextBoolean();
			
			System.out.println("Você digitou os seguintes valores: ");
			System.out.println("Seu primeiro nome é: " + primeiroNome);
			System.out.println("Idade " + idade);
			System.out.println("Você tem: " + quantidadeFilhos + " filhos");
			System.out.println("Sua altura é: " + altura);
			System.out.println("Tem bichinho de estimação? " + temPet);
		

	}

}
