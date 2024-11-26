package davi.variaveis.cursojava.aula19;

public class arrays {

	public static void main(String[] args) {
		// 

			double [] temperaturas = new double [365];
			temperaturas[0] = 31.5 ;
			temperaturas[1] = 32.4;
			temperaturas[2] = 33;
			temperaturas[3] = 33.5;
			temperaturas[4] = 34.7;
			temperaturas[5] = 35.9;
			temperaturas[6] = 35;
			temperaturas[7] = 36.1;
		
			System.out.println("A temperatura do dia 1 é: " + temperaturas[0]);
			
			System.out.println("O tamanho do array é: " + temperaturas.length);
			
			System.out.println("Valores do Array: ");
			
			for (int i=0; i< temperaturas.length; i++) {
				System.out.println("O valor da temperatura do dia " + (i+1)+ " é "+ temperaturas[i]);
		
		}
			
			for (double temp : temperaturas) {
				System.out.println(temp);
			}
			
	}
}
