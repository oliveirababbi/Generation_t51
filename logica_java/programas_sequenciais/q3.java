package sequenciais;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		
	//3) Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa 
	// em segundos e mostre-o expresso em horas, minutos e segundos.
		
		int horas, minutos, seg1, seg2;
		
        Scanner leia = new Scanner (System.in);
		
		System.out.println("\nQual a dura��o do evento em segundos? ");
		seg1 = leia.nextInt();
		
		horas = seg1 % 3600;
		minutos = (seg1 % 3600) / 60;
		seg2 = (seg1 % 3600) % 60;
		
		System.out.println("\nA dura��o do evento foi de "+ horas+ " horas, "+ minutos+ " minutos e "+ seg2+ " segundos.");
		
		
	    //Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil

	}

}
