package br.senec.pi;

public class Operacoes {

	public static void main(String[] args) {
		String nome = "Fernando";
		String sobrenome = "Araujo";
		
		System.out.println("Nome Completo: " + nome + sobrenome);
		System.out.println("..........................................");
		
		int idade = 35;
		boolean brasileiro = true;
		
		System.out.println("Idade: " + idade);
		if(brasileiro){
			System.out.println("Brasileiro: " + brasileiro);
		}
		
		System.out.println("Operações Martemeticas");
		int n1 = 10;
		int n2 = 5;
		
		System.out.println("O Valor de n1 é: " + n1);
		System.out.println("O valor de n2 é: " + n2);
		//Saida formatada com intercalada de valor
		System.out.printf("A soma dentre %d e %d é : " , n1, n2);
		System.out.println(n1+n2);//Mostra o resultado
		System.out.printf("Soma de %d e %d é: " ,n1,n2);
		System.out.println(n1+n2);
		System.out.printf("Multiplicação de %d e %d é: " ,n1,n2);
		System.out.println(n1*n2);
		System.out.printf("Divisão de %d e %d é: " , n1 , n2);
		System.out.println(n1/n2);
		System.out.printf("Subtração de %d e %d é: " ,n1 , n2);
		System.out.println(n1 - n2);
		System.out.printf("Resto de %d e %d é: ", n1 , n2);
		System.out.println(n1 % n2);
		//Precedência de avaliação de operações
		System.out.println((n1 + n2)*5);

	}

}
