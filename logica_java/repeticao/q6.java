package repeticao;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		
	// 6) Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir 
	//a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0 (zero).
		
        int n, soma = 0, cont = 0;
        float media;
		
		Scanner leia = new Scanner (System.in);
		
		do {
	
			n = leia.nextInt();
			
			if (n%3==0) {
			soma+=n;
			cont++;
			}
			
		} while (n!=0);
		
		media = (float) soma / (cont-1);
		
		System.out.printf("M�dia dos n�meros m�ltiplos de 3: %2.2f ",media);
		
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil

	}

}
