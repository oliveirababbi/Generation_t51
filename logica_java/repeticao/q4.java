package repeticao;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		
	// 4) Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos 
	//de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 
	//2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se 
	//a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
	//calcule e mostre: - o n�mero de pessoas calmas; - o n�mero de mulheres nervosas; - o n�mero de homens 
	//agressivos; - o n�mero de outros calmos; - o n�mero de pessoas nervosas com mais de 40 anos; - o n�mero 
	//de pessoas calmas com menos de 18 anos.
		
        int idade, sexo, temperamento;
        int pessoas = 0, calmas = 0, nervosas_f = 0, agressivos_m = 0, nervosas_40 = 0, calmas_18 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		while (pessoas < 150) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
	     	System.out.println("G�nero:\n1-FEM; 2-MASC; 3-OUTROS.: ");
	     	sexo = leia.nextInt();
	     	System.out.println("\nSe voc� � uma pessoa calma, DIGITE 1.\nSe voc� � uma pessoa nervosa, DIGITE 2.\nMas se voc� se considera uma pessoa agressiva, DIGITE 3.\n");
	     	temperamento = leia.nextInt();
	     	
	     	if (temperamento == 1) {
	     		calmas++;
	     	}
	     	
	     	if (sexo == 1 && temperamento == 2) {
	     		nervosas_f++;
	     	}
	     	
	     	if (sexo == 2 && temperamento == 3) {
	     		agressivos_m++;
	     	}
	     	
	     	if (idade > 40 && temperamento == 2) {
	     		nervosas_40++;
	     	}
	     	
	     	if (idade < 18 && temperamento ==1) {
	     		calmas_18++;
	     	}
		}
		
		System.out.println("Pessoas calmas = "+calmas+"\nMulheres nervosas = "+nervosas_f);
		System.out.println("\nHomens agressivos = "+agressivos_m+"\nMaiores de 40 anos e nervoses = "+nervosas_40);
		System.out.println("\nMenores de 18 anos e calmes = "+calmas_18);
		
		
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil

	}

}
