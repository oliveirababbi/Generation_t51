package condicionais;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		
	// 2) Fa�a um programa que entre com tr�s n�meros inteiros e coloque em ordem crescente.
		
		int maior = 0, menor = 1000000, medio = 0;
		int n[] = new int[3];
		int i;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite os tr�s n�meros: ");
		
		for (i=0; i<3; i++) {
			n[i] = leia.nextInt();
		}
		
		for (i=0; i<3; i++) {
		    if (n[i] > maior) {
		    	maior = n[i];
		    }
		}
		
		for (i=0; i<3; i++) {
		    if (n[i] < menor) {
		    	menor = n[i];
		    }
		}
		
		for (i=0; i<3; i++) {
		    if (n[i] < maior && n[i] > menor) {
		    	medio = n[i];
		    }
		}
		
		System.out.println("\nA ordem crescente dos n�meros �: "+ menor);
		System.out.println("\n"+ medio);
		System.out.println("\n"+ maior);
		
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil

	}

}
