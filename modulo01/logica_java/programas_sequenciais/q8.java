package sequenciais;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		
	// 8) O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem
	//do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem 
	//do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
	//f�brica de um carro e escreva o custo ao consumidor.
		
			double custo_c, custo_f, distribuidor, impostos;
			
			Scanner leia = new Scanner (System.in);
			
			System.out.println("\nQual o valor do custo de f�brica? ");
			custo_f = leia.nextDouble();
			
			distribuidor = custo_f*0.28;
			impostos = custo_f*0.45;
			custo_c = distribuidor + custo_f + impostos;
			
			System.out.printf("\nO custo do consumidor � de R$ %2.2f",custo_c);
			
			//Solu��o por: Babbi Oliveira (2022)
			//Atividade de: @GenerationBrasil

	}

}
