package br.senac.pi.poo;

public class Carro {
	//Atributos da classe (Objeto) carro.
	String marca;
	String modelo;
	int ano;
	String placa;
	String chassi;
	String cor;
	
	//Comportamento da classe (Objeto) carro.
	public void partida(){
		System.out.println("Carro ligado....");
	}
	public void acelerar() {
		System.out.println("Carro acelerado...");
	}
	public void freiar() {
		System.out.println("Carro parado....");
	}
	public void cores(){
		System.out.println("Carro de cor....");
	}

	

}
