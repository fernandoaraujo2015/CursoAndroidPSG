package ExecicioJava;

import java.util.Scanner;

	public class Sqrt {
		public static void main(String args[]) {

			double x;
			double y;
			Scanner sc = new Scanner(System.in);
			
			// Lê um dado double a partir do teclado
			
			System.out.print("x = ");
			double x = sc.nextDouble();
			System.out.print("y = ");
			
			if(x >= 0)
				System.out.printf(sqrt (x));
			else
				System.out.println("x e negativo");
	
			
		}		
			

	}
