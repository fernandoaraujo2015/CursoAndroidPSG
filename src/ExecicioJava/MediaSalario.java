package ExecicioJava;

import java.util.Scanner;

public class MediaSalario {

	public static void main(String[] args) {
			
		double s;		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Funcion�rio do gerente: ");
		int i = sc.nextInt();		
		System.out.print("Sal�rio: R$ ");
		double  x = sc.nextInt();
		System.out.print("\nFuncion�rio do Coordenador: ");
		int e = sc.nextInt();		
		System.out.print("Sal�rio: R$ ");
		double  y = sc.nextInt();
		System.out.print("\nFuncion�rio do Supervisor: ");
		int r = sc.nextInt();		
		System.out.print("Sal�rio: R$ ");
		double z = sc.nextInt();
		System.out.println("");
		System.out.printf("A M�dia Salarial dos Funcionarios �: R$"+ (x+y+z)/(i+e+r));
		System.out.println("");
		
		System.out.println("O B�nus do Gerente �: R$" + x*0.15);
		System.out.println("O B�nus do Coordenador �: R$" +y*0.10);
		System.out.println("O B�nus do Supervisor �:  R$" +z*0.8);
        
	}

}
