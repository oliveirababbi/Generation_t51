package poo;

public class eletronico {
	
	// 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta 
	//classe, em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e 
	//apresente as informa��es deste objeto no console.
	
	//Declara��o de atributos abaixo:
	
		String nomeProprietario; 
	    int sinal;
		int bateria;
		
	//Declara��o de m�todos abaixo:
		
		void pertence_a () {
			System.out.println("\nCelular do " +nomeProprietario);
		}
		
		void rede (int numero) {
			int sinalAtual = this.sinal+numero;
			this.sinal = sinalAtual;
		}
		
		int ligarPara () {
			if (this.sinal < 2) {
				System.out.println("\nCelular sem sinal!");
				return -2;
			}
			else {
				System.out.println("\nLiga para...");
				return 3;
			}
		}
		
		void statusBateria (int sts) {
			int bateriaAtual = this.bateria+sts;
			this.bateria = bateriaAtual;
		}
		
		int mexerCel () {
			if (this.bateria < 5) {
				System.out.println("\nDescarregando...");
				return -5;
			}
			return bateria;
		}
		
		

}
