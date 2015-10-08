package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		c1.marca = "Ferrari"; //Atributo de valores a atribuições.
		c1.modelo = "F50 Master";
		c1.chassi = "F45500255R012";
		c1.ano = 2015;
		c1.cor = "vermelha";
		System.out.println("Marca: " + c1.marca);
		System.out.println("modelo: " + c1.modelo);
		System.out.println("chassi: " + c1.chassi);
		System.out.println("ano: " + c1.ano);
		System.out.println("cor: " + cor);
		
		c1.partida(); //chamada ao método.
		c1.acelerar();
		c1.freiar();
		

	}

}
