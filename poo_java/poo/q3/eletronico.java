package poo_java;

public class eletronico {
	
	// 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta 
	//classe, em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e 
	//apresente as informa��es deste objeto no console.
		
	//Declara��o de atributos abaixo:
		
		String owner; 
	    int battery;
			
	//Declara��o de m�todos abaixo:
			
	    void belongs () {
			System.out.println("\nCelular de " +owner);
		}

			
		void statusBattery (int sts) {
			int batteryNow = this.battery+sts;
			this.battery = batteryNow;
		}
			
		void usePhone () {
			if (this.battery < 5) {
				System.out.println("\nDesligando...");
			}
			else if (this.battery < 15 && this.battery > 5) {
				System.out.println("\nBateria baixa. \nConecte ao carregador!");
			}
		}

}
