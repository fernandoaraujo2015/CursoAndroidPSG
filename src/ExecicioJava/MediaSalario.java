package ExecicioJava;

import java.util.Scanner;

public class MediaSalario {

	public static void main(String[] args) {
			
		double s;		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Funcionário do gerente: ");
		int i = sc.nextInt();		
		System.out.print("Salário: R$ ");
		double  x = sc.nextInt();
		System.out.print("\nFuncionário do Coordenador: ");
		int e = sc.nextInt();		
		System.out.print("Salário: R$ ");
		double  y = sc.nextInt();
		System.out.print("\nFuncionário do Supervisor: ");
		int r = sc.nextInt();		
		System.out.print("Salário: R$ ");
		double z = sc.nextInt();
		System.out.println("");
		System.out.printf("A Média Salarial dos Funcionarios é: R$"+ (x+y+z)/(i+e+r));
		System.out.println("");
		
		System.out.println("O Bônus do Gerente é: R$" + x*0.15);
		System.out.println("O Bônus do Coordenador é: R$" +y*0.10);
		System.out.println("O Bônus do Supervisor é:  R$" +z*0.8);
        
	}

}
