package poo_java;

import java.util.Scanner;

public class testeContaBancaria {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner (System.in);
		
		contaBancaria theClient = new contaBancaria ();
	    
		System.out.println("Nome: ");
		String client = entry.nextLine();
		theClient.client = client;
		
		System.out.println("N�mero da ag�ncia: ");
		int ag = entry.nextInt();
		theClient.ag = ag;
		
	    System.out.println("Qual o tipo da conta? \n 1-CORRENTE; 2-POUPAN�A\n");
	    int accountClient = entry.nextInt();
	    while (accountClient != 2 && accountClient != 1) {
	    	System.out.println("N�mero inv�lido!\nDigite novamente: ");
	    	accountClient = entry.nextInt();
	    }
	    
	    theClient.type = accountClient;
		
		System.out.println("N�mero da conta sem d�gito: ");
		int account = entry.nextInt();
		theClient.account = account;
		
		System.out.println("N�mero do d�gito: ");
		int dig = entry.nextInt();
		theClient.dig = dig;
		
		double value = 1340d;
		theClient.value = 1340d;

	    theClient.printInfo();
					
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil
		}

}

