package sequenciais;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
	
	// 5) Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
	// Considerar que a m�dia � ponderada e que o peso das notas �: 2, 3 e 5, respectivamente.
		
		float nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nDigite a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nDigite a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.printf("\nM�dia das notas = %2.2f", media);
		
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil

	}

}
