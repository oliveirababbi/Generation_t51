package sequenciais;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		
	// 4) Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule 
	//a seguinte express�o: D = R + S / 2 onde, R = (A+B)� S = (B+C)�.
		
			int A, B, C, D, R, S;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("\nDigite 3 n�meros positivos: ");
			A = leia.nextInt();
			B = leia.nextInt();
			C = leia.nextInt();
			
			R = (A + B) * (A + B);
			S = (B + C) * (B + C);
			D = (R + S) / 2;
			
			System.out.println("\nRESULTADO = "+D);
			
			//Solu��o por: Babbi Oliveira (2022)
			//Atividade de: @GenerationBrasil

	}

}
