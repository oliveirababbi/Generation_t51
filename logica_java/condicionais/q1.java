package exe_0104;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		
	// 1) Fa�a um programa que receba tr�s n�meros inteiros e diga qual deles � o maior.
		
		int i, maior = 0;
		int n[] = new int[3];
		
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
		
		System.out.println("\nO maior n�mero �: "+maior);
		
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil
	}

}
