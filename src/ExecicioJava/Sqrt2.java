package ExecicioJava;

public class Sqrt2 {
	public static void main(String args[]) {
		double a, b, c, delta;
		StreamTokenizer in = new S
		StreamTokenizer in = new StreamTokenizer(System.in);
		// Requisitando do usu�rio os dados sobre a equa��o a ser
		// analisada.
		//
		/*try {
		System.out.println("Digite os coeficientes da equa��o ax^2+bx+c = 0");
		System.out.print("a = "); System.out.flush(); in.nextToken();
		a = in.nval;
		System.out.print("b = "); System.out.flush(); in.nextToken();
		b = in.nval;
		System.out.print("c = "); System.out.flush(); in.nextToken();
		c = in.nval;
		}
		catch(java.io.IOException e) {
		System.out.println("Falha na entrada dos dados.");
		a = 0;
		b = 0;
		c = 0;
		}
		// Calculando o discriminante da equa��o
		//
		delta = (b*b) - 4*a*c;
		System.out.println( "Equa��o: ("+a+")x^2+("+b+")x+("+c+")" );
		
		// Decidindo sobre o n�mero de ra�zes da equa��o mediante o
		// valor do discriminante calculado acima
		//
		*/if ( delta > 0 ) { // A eq. tem duas ra�zes reais
		double r, d, x1, x2;
		r = Math.sqrt(delta);
		d = 2*a;
		x1 = ( -b -r ) / d;
		x2 = ( -b + r ) / d;
		System.out.println("A equa��o tem duas solu��es reais: ");
		System.out.println(" x1 = " + x1);
		System.out.println(" x2 = " + x2);
		} 		else
		if ( delta < 0 ) // A eq. n�o tem ra�zes reais
		System.out.println("A equa��o n�o tem ra�zes reais.");
		else { // A eq. tem uma raiz real dupla
		double x;
		x = b
		/ (2*a);
		System.out.println("A equa��o tem uma �nica raiz real:");
		System.out.println(" x1 = x2 = " + x);
		}
	}
}
