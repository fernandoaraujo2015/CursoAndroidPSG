package br.senec.pi;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
			System.out.println("Olá Botafoquense");// Mensagem Inicial
			System.out.print("Digite um número: ");//Interage com o suário
			Scanner s = new Scanner(System.in);//Prepara entrada de dados 
			int valor = s.nextInt(); //Faz a leitura de dados 
			System.out.println("Valor = " + valor );//Imprime o valor lido
			s.close();//Libera o recurso de entrada de dados
		}
		

	

}
