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
		
		System.out.println("Opera��es Martemeticas");
		int n1 = 10;
		int n2 = 5;
		
		System.out.println("O Valor de n1 �: " + n1);
		System.out.println("O valor de n2 �: " + n2);
		//Saida formatada com intercalada de valor
		System.out.printf("A soma dentre %d e %d � : " , n1, n2);
		System.out.println(n1+n2);//Mostra o resultado
		System.out.printf("Soma de %d e %d �: " ,n1,n2);
		System.out.println(n1+n2);
		System.out.printf("Multiplica��o de %d e %d �: " ,n1,n2);
		System.out.println(n1*n2);
		System.out.printf("Divis�o de %d e %d �: " , n1 , n2);
		System.out.println(n1/n2);
		System.out.printf("Subtra��o de %d e %d �: " ,n1 , n2);
		System.out.println(n1 - n2);
		System.out.printf("Resto de %d e %d �: ", n1 , n2);
		System.out.println(n1 % n2);
		//Preced�ncia de avalia��o de opera��es
		System.out.println((n1 + n2)*5);

	}

}
