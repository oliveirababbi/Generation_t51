package repeticao;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		
	// 2) Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		int i, n, par = 0, impar = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite 10 n�meros: \n");
		
		for (i=0; i<10; i++) {
			(n) = leia.nextInt();
			
			if (n%2==0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("\nPARES = "+par+"; �MPARES = "+impar);
		
		
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil
	}

}
