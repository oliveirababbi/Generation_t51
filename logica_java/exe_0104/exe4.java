package exe_0104;

import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
		
	// 4) Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � 
	//par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero 
	//elevado ao quadrado.
		
        double numero, impar, par;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o seu n�mero: ");
		numero = leia.nextInt();
		
		if (numero%2==0) {
		    par =	Math.sqrt(numero);
		    System.out.println("\n"+Math.ceil(par));
		}
		else {
			impar = Math.pow(numero, 2);
			System.out.println("\n"+Math.ceil(impar));
		}
		
		//Solu��o por: Babbi Oliveira (2022)
		//Atividade de: @GenerationBrasil

	}

}
