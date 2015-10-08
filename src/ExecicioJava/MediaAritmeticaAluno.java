package ExecicioJava;

import java.util.Scanner;

public class MediaAritmeticaAluno {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.printf(" Der uma nome e nota para aluno: ");
		String aluno =  sc.next();
		//System.out.println(" Der uma nome e nota para aluno: ");
		
		int nt1 = sc.nextInt();
		int nt2 = sc.nextInt();
		int nt3 = sc.nextInt();
		double media = ((nt1+nt2+nt3)/3);
		
		if(media >=7){
			System.out.println(aluno + " Você está Aprovado!!!!");
			System.out.println("Sua media :" +media);
		}
		else if(media >=6){
			System.out.println(aluno + " Você está em Recuperação!!!!");
			System.out.println("Sua media:" +media);
		}
		else{
			System.out.println(aluno + " Você está Reprovado:!!");
			System.out.println("Sua media é: "+media);
		
		}
	}

}
