package br.senec.pi;

public class EscopoDeVariaveis {

	public static void main(String[] args) {
	//Bloco 1
		int i = 5; //Variaveis  do bloco 1
		{ //bloco 2
			int j = 0; //Variaveis do bloco 2
			//Uso do i dentro do seu escopo
			System.out.println(i);
			j = 5 * i;
			System.out.println(j);
		}
		{// Bloco  3
			//Uso do i dentro do seu escopo
			System.out.println(i);
			//ERRO! Uso do j fora do seu escopo 
			//System.out.println(j);
		}
		//Uso do i dentro do seu escopo
		System.out.println(i);
		//ERRO! Uso do j fora do seu escopo
		//System.out.println(j);

	}

}
