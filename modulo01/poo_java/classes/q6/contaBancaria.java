package poo_java;

public class contaBancaria {
	
	/* 6) Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe, 
	 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informa��es 
	 * deste objeto no console.
	 */

	int ag;
	int account;
	int dig;
	int type;
	String client;
	double value;
	
	public contaBancaria () {
		
	}
	
	
	
	
	public contaBancaria(int ag, int account, int dig, int type, String client, double value) {
		super();
		this.ag = ag;
		this.account = account;
		this.dig = dig;
		this.type = type;
		this.client = client;
		this.value = value;
	}




	// Definindo se a conta � corrente ou poupan�a
	String accountType () {
		

		if (type == 1) {
			String str_type = "corrente";
			return str_type;
		} else if (type == 2) {
			String str_type = "poupan�a";
			return str_type;
		} else {
			return "";
		}
	}
	

	
	void valueAccount (double Value) {
		double valueNow = this.value+Value;
		this.value = valueNow;
	}
	

	public void printInfo () {
		
		System.out.println("O cliente " + client + " , Ag�ncia: " + ag + " e Conta " + account + dig + " do tipo "
				+ accountType() + " tem um saldo de R$ " + value + ".");
	}
}
