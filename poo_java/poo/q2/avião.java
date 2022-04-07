package poo;

public class avi�o {

	// 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida 
	//crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto 
	//no console.
	
	//Declara��o de atributos abaixo:
	
	private int numero;
	private String origem;
	private String destino;
	private int dia, mes, ano;
	private int horaSaida;
	private char parada;
	private int horaChegada;
	
	//Declara��o de m�todos abaixo:
	
	public avi�o (int numero, String origem, String destino, int dia, int mes, int ano, int horaSaida,
			char parada, int horaChegada)
	{
		this.numero = numero;
		this.origem = origem;
		this.destino = destino;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.horaSaida = horaSaida;
		this.parada = parada;
		this.horaChegada = horaChegada;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public char getParada() {
		return parada;
	}

	public void setParada(char parada) {
		this.parada = parada;
	}

	public int getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int horaChegada) {
		this.horaChegada = horaChegada;
	}
	
	public void imprimirInfos() {
		System.out.println("\nAvi�o n� " +numero+ "\nOrigem: " +origem+ "\nDestino: " +destino+
				"\nData: " +dia+ "/" +mes+ "/" +ano+ "\nHor�rio de sa�da: " +horaSaida+ " horas\nParadas: " 
				+parada+ "\nHor�rio da chegada: " +horaChegada+ " horas");
	}
		
}
